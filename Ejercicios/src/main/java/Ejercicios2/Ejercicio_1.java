/*
Ejercicio 1: Pedir dos numeros y decir cual es el mayor o
si son iguales
 */
package Ejercicios2;

import javax.swing.JOptionPane;


public class Ejercicio_1 {
    public static void main(String[] args){
        int num1,num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        
        if(num1>num2){JOptionPane.showMessageDialog(null, num1 + " es mayor que " + num2);}
        else if(num1<num2){JOptionPane.showMessageDialog(null, num2 + " es mayor que " + num1);}
        else {JOptionPane.showMessageDialog(null, num2 + " y " + num1  + " son iguales");}
            
         
        
    
    }
    
}
