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
public class metod_burbuja {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,aux;
        
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros quieren digitar"));
        arreglo = new int[nElementos];
        
        for(int i =0;i<nElementos;i++){
            System.out.println("Numero " +(i+1));
            arreglo[i] = entrada.nextInt();
        }
        
        
        //VA METODO BURBUJA
        for(int i=0;i<(nElementos-1);i++){
            for(int j=0;j<(nElementos-1);j++){
                if(arreglo[j] > arreglo[j+1]){//numActual>numSig
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        //Mostrarmos el arreglo crecientemente
        System.out.println("\n Arreglo ordenado en creciente");
        for(int j:arreglo){
            System.out.println(j);
        }
        //FORMA DECRECIENTE
        System.out.println("\n Arreglo en decreciente");
        for(int i=(nElementos-1);i>=0;i--){
            System.out.println(arreglo[i]);
        }
                
        
    }
    
}
