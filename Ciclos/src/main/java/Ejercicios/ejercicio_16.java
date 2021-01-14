/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_16 {
    public static void main(String[] args){
        int num_tabla,multiplicacion;
        
        
        num_tabla =Integer.parseInt(JOptionPane.showInputDialog("Indique cual es la tabla de multiplicar que quieres: "));
        
        
        for(int i=1;i<=10;i++){
            System.out.println(num_tabla + " * " + i + " = " + (i*num_tabla) );
        }
        
    }
    
}
