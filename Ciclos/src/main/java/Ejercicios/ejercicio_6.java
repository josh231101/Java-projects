/*
 Introducir numero hasta que se ponga un 0 y sumarlos todos
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_6 {
     public static void main(String[] args){
         int numero,suma=0;
         
         do{
             numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
             suma +=numero;//Suma iterativo
             
             
         }while(numero!=0);
         System.out.println("La suma de todos los numero que metiste es " + suma);
     }
    
}
