/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_14_mejorado {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo_1[] = new int[10], arreglo_2[] = new int[10],i=0;
        int[] arreglo_final = new int[20];
        System.out.println("Primer arreglo");
        for(i=0;i<10;i++){
            System.out.println((i+1) + ". Numero: ");
            arreglo_1[i]= entrada.nextInt();
            if(i!=0){
                if(arreglo_1[i-1]>arreglo_1[i]){
                    System.out.println("Digita los numeros en orden creciente");
                    i-=1;
                }
            }
        }
        System.out.println("Segundo arreglo");
        
        for(i=0;i<10;i++){
            System.out.println((i+1) + ". Numero: ");
            arreglo_2[i]= entrada.nextInt();
            if(i!=0){
                if(arreglo_2[i-1]>arreglo_2[i]){
                    System.out.println("Digita los numeros en orden creciente");
                    i-=1;
                }
            }
        }
        
       
        int j=0;//Para el arreglo b
        
        int k=0;//Para el arreglo c
        
        while(i<10 && j<10){
            if(arreglo_1[i] < arreglo_2[j]){//Sii el elemento a es mejor de b
                arreglo_final[k] = arreglo_1[i];
                i++;
            }
            else{
                arreglo_final[k] = arreglo_2[j];//Cop el elem del b
                j++;//Avanzamos una pos en b
            }
            k++;//Avanzamos una posicion en el c
        }
        //Cuando salimos del while es pq un array (aob) se ha copiado completamente
        if(i==10){//Significa que ya copiamos todo el a falta el b
            while(j<10){
                arreglo_final[k] = arreglo_2[j];
                j++;
                k++;
            }
        }//Significa que ya copiamos todo el b falta el a
        else{//Significa que ya copiamos todo el b falta el a
            while(i<10){
                arreglo_final[k] = arreglo_1[i];
                i++;
                j++;
                
            }
        }
        System.out.println("\nEl arreglo c completo es");
        for(k=0;k<20;k++){
            System.out.println(arreglo_final[k]);
        }
        
    }
    
}
