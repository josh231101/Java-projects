/*
 Diseñar una aplicacion que decalre una tabla de 10 elementos
enteros.
Leer mediante el teclaod 8 numeros.Después  se debe pedir un nu´mero y una
posición, insteratarlo en la posicioón indicada, desplazando los
que estén detrás.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_8 {
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         int arreglo[] = new int[10];
         int numero,posicion;
         
         
         System.out.println("LLenar el arreglo");
         
         for(int i =0;i<8;i++){
             System.out.print( (i+1)+ ". Numero: ");
             arreglo[i] = entrada.nextInt();
             
         }
           
         System.out.println("Digite un numero");
         numero = entrada.nextInt();
         
         System.out.println("Digite una posicion");
         
         posicion = entrada.nextInt();
         if(posicion>9){
             do {
                 System.out.println("Digite otro numero entre 0 y 8");
                 posicion = entrada.nextInt();
             } while (posicion>9);
             
         }
         
         //Correr una posición los elementos detrás de la posición que
         //el usuario quiere.
         for(int i = 7;i>posicion;i--){
             arreglo[i+1] = arreglo[i];
         } 
         arreglo[posicion] = numero;
         
         System.out.println("El nuevo arreglo es");
         for(int i=0;i<9;i++){
             System.out.println("Posicion " + i + " = " + arreglo[i]);
         }
         
         
         
         
    }
    
}
