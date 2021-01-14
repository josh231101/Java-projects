/*
 Ejercicio 2: Pedir 5 numeros guardarlos en un vector y mostrar el orden inverso
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_2 {
   public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
               
       float numeros[] = new float[5];
       
       
       System.out.println("Introduce 5 numeros");
       
       for(int i = 4; i>=0;i--){
           System.out.println((5-i)+". Numero");
           numeros[i] =  entrada.nextFloat();
           
           
       }
       for(float i:numeros){
           System.out.println(i);
       }
       
   }
    
}
