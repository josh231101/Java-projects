/*
 Crear un program que lea 10 numeros enteros y desplace N posiciones en el
arreglo(N lo dice el usuario)
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicios_10 {
    public static void main(String[] args){
       Scanner entrada  = new Scanner(System.in);
       int arreglo[] = new int[10];
       int n_pos=0,ultimo;
       
        System.out.println("LLenar el arreglo");
        
       for(int i=0;i<10;i++){
           System.out.print( (i+1) +"Digita un numero");
           arreglo[i] = entrada.nextInt();
       }
       
       System.out.println("Digite la cantidad de posiciones a desplazar");
       n_pos = entrada.nextInt();
       
       
       for(int vuelta=1;vuelta<=n_pos;vuelta++){
           ultimo = arreglo[9];//Guardamos el ultimo elemento del arreglo
           for(int i=8;i>=8;i--){//Desplazamos 1 posicion en el arreglo
               arreglo[i+1] = arreglo[i];
           }
           
           arreglo[0] = ultimo;//Ponemos el último como el primero
       }
       
        System.out.println("\n El arreglo resultante es");
        for(int s:arreglo){
            System.out.println(s);
        }
       
    }
}
