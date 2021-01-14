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
public class ejercicio_4 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        
        
        for(int i =0;i<10;i++){
            System.out.print((i+1)+". Numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("El resultado es ");
        
        for(int i=0;i<5;i++){
            System.out.print(numeros[i] + " ");//Poner el primero
            System.out.print(numeros[9-i] + " ");//   Poner el ultimo
            
        }
        
    }
    
}
