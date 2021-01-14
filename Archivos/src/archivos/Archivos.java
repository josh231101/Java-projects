/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class Archivos {

    File archivo;
    
    public void crearArchivo(){
        archivo = new File("prueba.txt");
        
        try {
            if(archivo.createNewFile()){//CREAMOS UN ARCHIVO
                System.out.println("El archivo se ha creado exitosamente");
            }
        } catch (IOException ex) {
            System.err.println("Ocurrio un error");
        }
        
        
    }
    
    public void crearDirectorio(){
        archivo = new File("carpetaPrueba");//Crea una carpeta
        if(archivo.mkdir()){
            System.out.println("Se ha creado el directorio correctamente");
        }
        else{
            System.err.println("Hubo un error no se pudo crear");      
        }
    }
    
    public void escribirTexto(){
        try {
            FileWriter escribir = new FileWriter(archivo);
            escribir.write("HOLA QUE TAL??");
            escribir.write("\r\nMas texto");//Salto de carro para escribir abajo
            escribir.close();//Cerramos el archivo
            
            
        } catch (IOException ex) {
            System.err.println("Error, no se pudo escribir sobre el archivo");
        }
    }
    private void añadirTexto(){
        try {
            FileWriter escribir = new FileWriter(archivo,true);//Deja lo que tenia antes el texto
            escribir.write("\r\n Mucho mas texto");
            escribir.write("\r\n Ahora mas");//Salto de carro para escribir abajo
            escribir.close();//Cerramos el archivo
            
            
        } catch (IOException ex) {
            System.err.println("Error, no se pudo escribir sobre el archivo");
        }
    }
    
    
    private void leerTexto(){
        String cadena;
        
        
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            
            cadena = lectura.readLine();
            while(cadena != null){//LEER TODO EL ARCHIVO(Ya q un file si llega al final el readLine recibe un null
                System.out.println(cadena);
                cadena = lectura.readLine();
            }
             
        } catch (FileNotFoundException ex) {
            System.err.println("Imposible leer el archivo");        
        } catch (IOException ex) {
            System.err.println("Error: "+ex);            
        }
        
    }
    
    
    public static void main(String[] args) {
        Archivos archivos = new Archivos();
        archivos.crearArchivo();
        //archivos.escribirTexto();
        //archivos.añadirTexto();
        //archivos.crearDirectorio();
        archivos.leerTexto();
    }
    
}
