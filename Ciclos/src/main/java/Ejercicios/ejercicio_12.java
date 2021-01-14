/*
 Pedir un numero y sacar su factorial
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_12 {
    public static void main(String[] args){
        long factorial=1;
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para sacarle su factorial"));
        
        for(int i=1;i<=numero;i++){
            factorial *= i;//Multiplicacion iterativa
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
        
    }
    
}
