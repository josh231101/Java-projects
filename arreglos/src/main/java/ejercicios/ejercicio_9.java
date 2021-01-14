/*
    Crear un programa que lea por teclado una tabla de 10 numeros
enteros y la desplace una posicion hacia abajo: y el primero pasa a ser
el segundo, el segundo pasa a ser el tercero y así sucesivamente.
El último pasa a ser el primero.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;
        
        
        System.out.println("Llenar el arreglo");
        for(int i =0;i<10;i++){
            System.out.print(i + "Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        ultimo = arreglo[9];//Guardamos el último elemento
        
        for(int i=8;i>=0;i--){//Avanzar una posición abajo en el arreglo
            arreglo[i+1] = arreglo[i];
            //3,5,3,4,5,6,7,8,6,1
        }
        arreglo[0] = ultimo;//Ponemos el último como el primero
        
        for(int x:arreglo){
            System.out.println("El nuevo arreglo es: " + x);
        }
               
                
                
    }
    
}
