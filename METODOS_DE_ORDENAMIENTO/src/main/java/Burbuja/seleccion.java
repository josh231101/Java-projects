/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class seleccion {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,min,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros quieren digitar"));
        arreglo = new int[nElementos];
        
         for(int i =0;i<nElementos;i++){
            System.out.print("Numero " +(i+1));
            arreglo[i] = entrada.nextInt();
        }
        
        //ALGORITMO ORDENAMIENTO POR SELECCION
        for(int i=0;i<nElementos;i++){
            min = i;
            for(int j=i+1;j<nElementos;j++){
                if(arreglo[j] <arreglo[min]){
                    min=j;
                    
                }
                
            }
            aux=arreglo[i];
            arreglo[i] = arreglo[min];            
            arreglo[min] = aux;
        }
        for(int i:arreglo){
        System.out.println(i);
        }
    }
    
}
