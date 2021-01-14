/*
 Leer por teclado una tabla de 10 elementos numericos
enteros y una posicion (entre 0 y 9).Eliminar el
elemento situado en la posición dada sin dejar huecos
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_12 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10],posicion;
        boolean comprobacion = false;
        
        System.out.println("Llena el arreglo porfavor");
        for(int i =0;i<10;i++){
            System.out.print((i+1) + ".Numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        do{
            System.out.println("Digite un numero 0 y 9 ");
            posicion = entrada.nextInt();
            if(posicion >=0 && posicion<=9){
                comprobacion = true;
            }  
        }while(comprobacion==false);
        
        //Eliminamos el elemento de la posicion que nos da
        for(int i=posicion;i<9;i++){
            arreglo[i] = arreglo[i+1];
        }
        
        for(int i=0;i<9;i++){
            System.out.print(arreglo[i] + " - ");
        }
        
        
    }
    
}
