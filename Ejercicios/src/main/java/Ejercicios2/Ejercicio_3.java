/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios2;

import javax.swing.JOptionPane;


public class Ejercicio_3 {
    public static void main(String[] args){
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isLowerCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra es MINUSCULA");
        }else{
            JOptionPane.showMessageDialog(null, "La letra es MAYUSCULA");
        }
    }
    
}
