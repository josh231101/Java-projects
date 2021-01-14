/*
 Leer 5 numeros,guardarlos en un arreglo y mostrarlos en ese orden

 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_1 {
    public static void main(String[] args){
        int[] numeros = new int[5];
        
        
        for(int i=0; i<5;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1) + ". Numero: "));  
        }
        for(int i:numeros){
            System.out.println(i);
        }
       
        
    }
    
    
}
