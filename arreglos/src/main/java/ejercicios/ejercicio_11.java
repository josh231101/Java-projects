/*
Leer 5 elementos numericos que se introducirán ordenados en forma
creciente.Éstos los guardaremos en una tabla de tamaño 10.Leer un
número N,e insertarlo en el lugar adecuado para que la tabla
continúe ordenada.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_11 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int numero,sitio_numero=0,j=0;
        
        System.out.println("LLene el arreglo con 5 numeros ordenados en forma creciente");
        for(int i=0;i<5;i++){
            System.out.print((i+1) + ". Numero: ");
            arreglo[i] = entrada.nextInt();
            if(i!=0){
                if(arreglo[i-1]>arreglo[i]){
                    System.out.println("Digita los numeros en orden creciente");
                    i-=1;
                }
            }
            
        }
        System.out.println("Digite un numero nuevo: ");
        numero = entrada.nextInt();
        
        //En que posicion metemos el numero
        while(arreglo[j]<numero && j<5){
            sitio_numero++;
            j++;
        }
        //for ultimo,trasladamos una posicion en el arreglo
        //a los elementos que van detrás de numero
        for(int i=4;i>=sitio_numero;i--){
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[sitio_numero] = numero;
        
        for(int i =0;i<6;i++){
            System.out.println(arreglo[i]);
        }
        
        
    }
    
}
