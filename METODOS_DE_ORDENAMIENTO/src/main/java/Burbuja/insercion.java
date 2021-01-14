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
public class insercion {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,pos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digita de cuantos numeros quieres tu arreglo"));
        
        arreglo = new int[nElementos];
        
        for(int i =0;i<nElementos;i++){
            System.out.println((i+1) + ". Numero: ");
            arreglo[i] = entrada.nextInt();
        }
        //Ordenamiento por inserción
        for(int i =0;i<nElementos;i++){
            pos=i;
            aux = arreglo[i];
            
            while((pos>0) && (arreglo[pos-1]) >aux){
                arreglo[pos] = arreglo[pos-1];
                pos--;
                
            }
            arreglo[pos] = aux;//Refrescar numero actual
        }
        
        System.out.println("Orden ascendente");
        for(int o:arreglo){
            System.out.println(o);
        }
        System.out.println("\n Descendente");
        
        for(int i =(nElementos-1);i>=0;i--){
            System.out.println(arreglo[i]);
        }
                
                
                
        
        
    }
    
    
}
