/*
 TRY CATCH PARA EXCEPCIONES VERIFICADAS
 */
package pruebaExcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class PruebaExcepcion {
    
   //En algun momento el codigo puede tener eesa excepcion
    public void leerArchivo() throws FileNotFoundException, IOException{
        //Si mueves el archivo va a capturar el error y hacer lo que se codifico en el otro metodo
        File archivo = new File("C:\\Users\\Miguel\\Desktop\\CURSO DE JAVA\\DownCASTINGYArrrayList.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        
        String linea;
        
        while((linea = bf.readLine()) !=null){
            System.out.println(linea);
        }
    }
    
    public void leerArchivo2(){
        try{
            leerArchivo();
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado,por favor verifique la ruta");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
        }
        
        System.out.println("Programa terminado");
        
    }
    
    
    public static void main(String[] args){
        PruebaExcepcion prueba = new PruebaExcepcion();
        prueba.leerArchivo2();
        
    }
    
}
