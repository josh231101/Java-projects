/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclewhile;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class dowhile {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
       int i=1;
       
       do{
           System.out.println(i);
           i++;
       }while(i<=10);
       
       int o=1,lim;
        System.out.println("Digite el limite del contador");
        lim = entrada.nextInt();
        
        do{
            System.out.println(o);
            o++;
        }while(o<=lim);
       
        
    } 
}
