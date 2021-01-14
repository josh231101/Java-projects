/*
 CREAR Y CARGAR UNA MATRIZ DE TAMAÑO 3X3
Y TRASPONERLA Y CARGAR
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
                
        int matriz[][],matrizPrima[][];
        matriz = new int[3][3];
        matrizPrima = new int[3][3];
        
        System.out.println("Llena la matriz");
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print("Matriz [" + i +"][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
               
            }
            System.out.println("");
        }
        
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                matrizPrima[i][j] = matriz[j][i]; 
            }
        }
        
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n MATRIZ TRANSPUESTA");
        
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrizPrima[i][j]);
            }
            System.out.println("");
        }
        
        
        
        
        
        
    }
    
}
