/*
Ver si una matriz es simétrica
 */
package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nColum;
        
       
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas filas quieres?"));
        nColum = Integer.parseInt(JOptionPane.showInputDialog("Cuantas columnas quieres?"));
       boolean simetrica = true;
        matriz =new int[nFilas][nColum];
        System.out.println("Rellena tu matriz");
        
         for(int i=0;i<nFilas;i++){
            for(int j=0;j<nColum;j++){
                System.out.print("Matriz [" + i + "]" + "[" + j + "] : ");
                matriz[i][j] = entrada.nextInt();
                
            }
        }
         
         
        /*Si es simetrica
         1.- Tienen que ser iguales las filas y las columnas
         2.- Al llevar las filas a las columnas deben ser iguales
         */
        
        if(nFilas == nColum){
            //Lo primero esta bien,ahora comprobar si al voltear las filas a columnas es igual
            int i,j;
            i=0;
            while(i<nFilas && simetrica ==true){
                j=0;
                while(j<i && simetrica == true){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica=false;
                    }
                    j++;
                }
                i++;
            }
            if(simetrica==true){
                System.out.println("La matriz es simétrica");
            }else{
                System.out.println("La matriz no es simetrica");
            }
            
            
            
        }
        else{
            System.out.println("No es simetrica la matriz");
        }
      
        
        
        
    }
    
}
