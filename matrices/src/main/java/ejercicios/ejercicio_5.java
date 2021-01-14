/*
Ejercicio_5:
Crear y cargar una matriz de tamaño n*m, y mostrar la suma de
cada fila y columna
 */
package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nColum,sumaFilas=0,sumaColumnas=0;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas de su arreglo: "));
        nColum = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas de su arreglo: "));
        
        matriz = new int[nFilas][nColum];
        System.out.println("\n Rellen el arreglo  ");
        for(int i =0;i<nFilas;i++){
            for(int j=0;j<nColum;j++){
                System.out.println("Matriz ["+ i+"]" + "["+ j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        //Algoritmo suma de cada fila de la matriz
        System.out.println("\nImprimimos la suma de cada fila");
        for(int i = 0;i<nFilas;i++){
            for(int j = 0;j<nColum;j++){
                sumaFilas += matriz[i][j];
            }
            System.out.println("Suma fila "+ i +  " = " + sumaFilas);
            sumaFilas = 0;
        }
        System.out.println("\n Imprimimos la suma de Cada columna");
        
        //Algoritmo suma de cada columna de la matriz
        for(int i = 0;i<nColum;i++){
            for(int j = 0;j<nFilas;j++){
                sumaColumnas += matriz[j][i];
            }
            System.out.println("Suma columna "+ i +  " = " + sumaColumnas);
            sumaColumnas = 0;
        }
         

    }
    
}
