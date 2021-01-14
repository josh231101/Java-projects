/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosbinario;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class ArchivosBinario {

    private void escribirBinario(){
        
        try {
            FileOutputStream archivo = new FileOutputStream("persona.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            
            Persona persona1 = new Persona("Alejandor", 22);
            Persona persona2 = new Persona("Josue", 18);
            Persona persona3 = new Persona("Maria", 80);
            //Escribimos OBJETOS sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);
            
            escritura.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosBinario.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(ArchivosBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void añadirBinario(){
        
        try {
            FileOutputStream archivo = new FileOutputStream("persona.bin",true);
            AñadirContenido escritura = new AñadirContenido(archivo);
            
            
            Persona persona1 = new Persona("Armando", 21);
            Persona persona2 = new Persona("Jose", 12);
            
            //Escribimos OBJETOS sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
           
            
            escritura.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosBinario.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(ArchivosBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void leerBinario(){
        Persona objetoPersona;
        try {
            FileInputStream archivos = new FileInputStream("persona.bin");
            
            ObjectInputStream lectura = new ObjectInputStream(archivos);
            while(true){
                //Recorremos el archivo binario
                objetoPersona = (Persona) lectura.readObject();
                objetoPersona.mostrarDatos();
                }
                
            
        }catch(EOFException ex){
            //Finaliza de leer todo el archivo binario
            return;
        }
        catch (FileNotFoundException ex) {
            
            System.err.println("Error"+ex);        
        }catch (IOException ex) {
            System.err.println("Error" + ex);
            }
        catch (ClassNotFoundException ex) {
            System.err.println(" Erro" + ex);
        }
    }
    
    
    
    public static void main(String[] args) {
        ArchivosBinario archivos = new ArchivosBinario();
        //archivos.escribirBinario();
        archivos.añadirBinario();
        archivos.leerBinario();
    }
    
}
