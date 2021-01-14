/*
 Leer 10 enteros en una tabla. Guardar en otra tabla los elementos parase
de la primera,y a continuacion los elementos impares
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int pares[] = new int[10];
        int impares[] = new int[10];
        
        System.out.println("LLena el arreglo");
        
        for(int i = 0;i<10;i++){
            System.out.print((i+1) + ". Numero: ");
            arreglo[i] = entrada.nextInt();
        }
        int j=0;
        int x=0;
        for(int i =0;i<10;i++){
            if(arreglo[i]%2 == 0){
                pares[j] = arreglo[i];
                j++;
            }
            else if(arreglo[i] % 2 != 0){
                impares[x] = arreglo[i];
                x++;
            }
        }
        
        System.out.println("Imprimimos tabla de pares");
        for(int i =0;i<=j;i++){
            System.out.print(pares[i]+ " , ");
        }
        
        System.out.println("\n Imprimiendo tabla de impares");
        for(int i=0;i<=x;i++){
            System.out.print(impares[i] + " , ");
        }
        
    }
    
}
