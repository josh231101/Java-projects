/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios2;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Ejercicio_4 {
    public static void main(String[] args){
        float precioCompra;
        
        precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Digita el valor de tu compra"));
        
        if(precioCompra > 300){
            precioCompra *= 0.70f;
            JOptionPane.showMessageDialog(null, "Tu precio final es de: " + precioCompra);
        }else{
           JOptionPane.showMessageDialog(null, "Debes pagar "+ precioCompra);
        }    
    }
}
