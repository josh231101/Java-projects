/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package definimos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class matriz_pedida {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nColum;
        
       
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas filas quieres?"));
        nColum = Integer.parseInt(JOptionPane.showInputDialog("Cuantas columnas quieres?"));
       
        matriz =new int[nFilas][nColum];
        
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nColum;j++){
                System.out.print("Matriz [" + i + "]" + "[" + j + "] : ");
                matriz[i][j] = entrada.nextInt();
                
            }
        }
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nColum;j++){
                System.out.print(matriz[i][j] + " , ");
                
            }
            System.out.println("");
        }
        
        

    }
    
}
