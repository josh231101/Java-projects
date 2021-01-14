/*
 Pedir un número N, y mostrar todos los números del 1 al N
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejrcicios_8 {
    
    public static void main(String[] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero maximo"));
        
        for(int i= 1;i<=numero; i++){
            System.out.println(i);
        }
    
    }
}
