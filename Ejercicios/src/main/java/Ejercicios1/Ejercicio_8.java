/*
 Ejercicio 8: Construir un programa que calcule y muestre
las raize de la ecuación de segundo grado
de coeficientes reales.
 */
package Ejercicios1;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio_8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double a,b,c,x1,x2;
        System.out.println("Digita los valores de a,b y c en tu ecuación:");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        x1 = ( -b + Math.sqrt(Math.pow(b, 2) - (4*a*c))) /(2*a);
        x2 = ( -b - Math.sqrt(Math.pow(b, 2) - (4*a*c))) /(2*a);
        System.out.println("El valor de x1 es: " + x1);
        System.out.println("El valor de x2 es: " + x2);
                
        
        
                
    }
    
}
