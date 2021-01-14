/*
 Ejercicio 6: Calcular el binomio al cuadrado de Newton
es decir la suma de dos numeros al cuadrado
 */
package Ejercicios1;

import java.util.Scanner;


public class Ejercicio_6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double a,b,result;
        System.out.println("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b: ");
        b = entrada.nextDouble();
        
        result = Math.pow(a, 2) + Math.pow(b, 2);
        System.out.println("El resultado es " + result);
        
    }
    
}
