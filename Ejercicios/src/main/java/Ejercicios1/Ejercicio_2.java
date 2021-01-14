//Calcular cuanto debe ganar el empleado apartir de sus salarioxhora y sus horas trabajadas
package Ejercicios1;

import java.util.Scanner;


public class Ejercicio_2 {
      public static void main(String[] args){
          
          Scanner entrada = new Scanner(System.in);
          int horas;
          float salarioHora,salarioSemanal;
          
          System.out.println("Digite las horas que trabajó usted: ");
          horas = entrada.nextInt();
          System.out.println("Digite su salario por hora");
          salarioHora = entrada.nextFloat();
          
          salarioSemanal = horas * salarioHora;
          System.out.println("\n Usted ganó esta semana: "+ salarioSemanal);
          
          
          
         
          
      }
}
