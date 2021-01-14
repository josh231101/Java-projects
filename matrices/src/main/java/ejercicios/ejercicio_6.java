/*
Utilizando dos matrices de tamaño 5x9 y 9x5
cargar la primera y trasponerla en la segunda.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_6 {
    public static void main(String[] args){
        int matriz1[][],matriz2[][];
        Scanner entrada = new Scanner(System.in);
        
        matriz1 = new int[5][9];
        matriz2 = new int[9][5];
        
        System.out.println("Rellena la matriz");
        
        for(int i =0;i<5;i++){
            for(int j = 0;j<9;j++){
                System.out.print("Matriz [" + i + "]" + "["+j+"]" );
                matriz1[i][j] = entrada.nextInt();
                
            }
        }
        System.out.println("\n Imprimimos la matriz");
        for(int i =0;i<5;i++){
            for(int j = 0;j<9;j++){
                System.out.print(matriz1[i][j] + " ");
                
            }
            System.out.println("");
        }
        
        
        System.out.println("\n TRASPONEMOS");
        for(int i =0;i<5;i++){
            for(int j = 0;j<9;j++){
                //TRANSPONEMOS
                matriz2[j][i] = matriz1[i][j];
            }
        }
        System.out.println("\n Imprimimos la matriz TRASPUESTA");
        for(int i =0;i<9;i++){
            for(int j = 0;j<5;j++){
                System.out.print(matriz2[i][j] + " ");
                
            }
            System.out.println("");
        }
 
    }
    
}
