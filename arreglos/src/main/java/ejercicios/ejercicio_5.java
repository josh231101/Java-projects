/*
 Leer por teclado dos tables de 1o numeros enteros y mezclarlas en un
a
tercer de la forma:  el 1° de A, el 1° de B,el 2° de A,el 2° del B;
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];
        a = new int[10];//Arreglo a con 10 elementos
        b = new int[10];//ARREGLO B CON 10 ELEMENTOS
        c = new int[20];//Arreglo c contendrá el a y el b
        
        System.out.println("Digite el arreglo a");
        
        //Arreglo a
        for(int i=0;i<10;i++){
            System.out.println((i+1) + ". Digite un numero");
            a[i] = entrada.nextInt();
        }
        
        //Arreglo b
        System.out.println("\n Digite el segundo arreglo");
        for(int i = 0;i<10;i++){
            System.out.println((i+1) + ". Digite un numero");
            b[i] = entrada.nextInt();
        }
        
        //Ahora,mezclamos los dos arreglos en el array C
        //Usar el i para AyB y J para el arreglo c
        
        int j=0;
        for(int i = 0;i<10;i++){
            c[j] = a[i];
            j++;
            c[j] = a[i];
            j++;
        }
        
        for(int i:c){
            System.out.println(c);
        }
        
        
        
        
        
        
        
    }
    
    
}
