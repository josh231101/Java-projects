/*
 Leer por teclado una serie de 10 números enteros, Lal app
debe indicarnos si los números están ordenados de forma creciente
decreciente, o si están desordenados

 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_7 {
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
      int[] numeros = new int[10];
      boolean creciente = false;
      boolean decreciente = false;
      
        System.out.println("Llen el arreglo");
      for(int i =0;i<10;i++){
          System.out.println((i+1) + ". Numero");
          numeros[i] = entrada.nextInt();
          
          
      }
      for(int i =0;i<9;i++){
          if(numeros[i]<numeros[i+1]){ //Creciente
              creciente = true;
          }
          if(numeros[i] >numeros[i+1]){//Decreciente
              decreciente = true;
          }
      } 
      if(creciente==true && decreciente ==false){
          System.out.println("La serie es creciente");
      }
      else if(creciente==false && decreciente ==true){
          System.out.println("El arreglo esta en decreciente");
      }
      else if(creciente == true && decreciente == true){
          System.out.println("La serie del arreglo está desordenado");
      }else if(creciente == false && decreciente == false){
          System.out.println("La serie tiene los numeros iguales");
      }
        
    }
    
}
