/*
 Ejercicio 1:
Ler un numero y sacar su cuadrado una y otra vez pero que salga del bucle si el numero dado es negativo

 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_1 {
    public static void main(String[] args){
        int numero,cuadrado;
                
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
       while(numero>= 0){
           cuadrado = (int) Math.pow(numero, 2);
           JOptionPane.showMessageDialog(null, "El numero "+ numero +  " elevado al cuadrado es " + cuadrado);
           
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
       }
        
        
    }
    
}
