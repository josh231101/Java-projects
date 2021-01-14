/*
 Leer 10 enteros ordenados crecientemente.
Leer N y buscarlo en la tabla.Se debe mostrar la posicion en
que se encuentra.Si no está, indicarlo con un mensaje.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicios_15 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int numero;
        
        System.out.println("Rellena el arreglo");
        for(int i = 0;i<10;i++){
            System.out.print((i+1) + ". Numero: ");
            arreglo[i] = entrada.nextInt();
            if(i!=0){
                if(arreglo[i-1]>arreglo[i]){
                    System.out.println("Digita los numeros en orden creciente");
                    i-=1;
                }
            }
        }
        
        System.out.println("Bienvenido a la busqueda del numero");
        System.out.print("\nDigite el numero que quiere buscar: ");
        numero = entrada.nextInt();
        boolean comprobacion = false;
        for(int i =0;i<10;i++){
            if(numero == arreglo[i]){
                System.out.println("Encontramos el numero " + numero + " en la posicion " + i );
                comprobacion = true;
            }
            
        }
        if(comprobacion == false){System.out.println("No econtramos el numero"); }
        
    }
    
}
