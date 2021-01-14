/*
 Cuantas cifras tiene
 */
package Ejercicios2;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Ejercicio_8 {
    public static void main(String[] args){
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entre 0 y 99,999"));
        if(numero>=0 && numero<=99999){
            JOptionPane.showMessageDialog(null, "Tu numero tiene " + Integer.toString(numero).length() + " cifras");
            
        }else{
            JOptionPane.showMessageDialog(null, "No es parte del rango de numeros");
        }
    }
    
}
