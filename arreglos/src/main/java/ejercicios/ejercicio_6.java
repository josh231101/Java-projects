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
public class ejercicio_6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int i,j;
                
        int a[],b[],c[];
        a = new int[12];
        b = new int[12];
        c = new int[24];
        
        //Pedimos primeros 10
        System.out.println("Digite 10 numeros enteros");
        for(i = 0; i<10;i++){
            System.out.println((i+1) + ". Numero");
            a[i] = entrada.nextInt();
            
        }
        for(i = 0; i<10;i++){
            System.out.println((i+1) + ". Numero");
            b[i] = entrada.nextInt();
        }
        
        //EL TERCER ARREGLO DE 3 EN TRES
        i = 0;
        j = 0;
        while(i<12){
            //Copiar los tres elementos del arreglo a
            for(int k=0;k<3;k++){
                c[j] = a[i+k];
                j++;
            }
            
            for(int k=0;k<3;k++){
                c[j] = b[i+k];
                j++;
            }
            i+=3;
        }
        System.out.println("El arreglo resultado es ");
        for(int o:c){
            System.out.println(o);
        }
        
    }
    
}
