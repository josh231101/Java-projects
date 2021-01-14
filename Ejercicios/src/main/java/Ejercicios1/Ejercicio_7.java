/*
 Ejercicio 7: Construir un programa que, dado un número de horas,
devuelve el numero de semanas, días y horas equivalentes. Por ejem.
dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas
 */
package Ejercicios1;

import java.util.Scanner;


public class Ejercicio_7 {
     public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
     
         int horasTotales,semanas,dias,horas;
         System.out.println("Digita el numero de horas: ");
         horasTotales = entrada.nextInt();
         
         semanas = horasTotales/168;
         dias = horasTotales%168 / 24;
         horas = horasTotales%24;
         
         System.out.println("\n El equivalente es: ");
         System.out.println("Semanas: " + semanas);
         System.out.println("Días: " + dias);
         System.out.println("Horas: " + horas);
         
         
     }
    
}
