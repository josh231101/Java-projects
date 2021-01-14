/*
 Pedir numeros hasta que se introduzca uno negativo, y calcular la media
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_7 {
    public static void main(String[] args){
        int contador = 0,numero,suma=0;
        float media;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
       
        while(numero>=0){
            suma += numero;//Suma iterativa
            contador++;//Aumentamos en uno el elemetno
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
        }
        if(contador == 0){
            System.out.println("Error! La división entre 0 no existe");
        }else{
            media = (float) suma/contador;
            System.out.println("La media de todos los numero es " + media);
        }
    }
}
