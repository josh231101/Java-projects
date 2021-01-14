//Hacer un programa que calcule las suma de tres calificaciones
package Ejercicios1;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int calif1,calif2,calif3, resultado;
        System.out.println("Digite las tres calificaciones que usted tiene: ");
        System.out.println("Presione enter cada vez que introduzca una calificacion");
        calif1 = entrada.nextInt();
        calif2 = entrada.nextInt();
        calif3 = entrada.nextInt();
        
        resultado = calif1 + calif2 + calif3;
        System.out.println("La suma de las calificaciones es: "+ resultado);
        
        
       
        
        
    }
    
}
