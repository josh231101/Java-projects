/*
 Pedir numeros hasta que se teclee uno negativo e indicar cuantos se han introducido
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_4 {
    public static void main(String[] args){
        int numero,contador = 0;
                
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
       while(numero>=0){
           
           
           contador++;//Aumentamos en 1 el contador
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
           
       }
        System.out.println("Ha introducido  " + contador + " numeros mayores a 0");
        
        
    }
    
}
