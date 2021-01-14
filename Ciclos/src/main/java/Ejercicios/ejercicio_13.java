/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_13 {
    public static void main(String[] args){
        int numero,suma_pos=0,conteo_pos=0
                ,suma_neg=0,conteo_neg=0,conteo_ceros=0;
        
        float media_pos,media_neg;
        
        for(int i =1;i<=10;i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(numero==0){//Si el numero es cero
                conteo_ceros++;//Aumentamos en 1 el conteo de ceros
            }
            else if(numero>0){//Si es positivo
                suma_pos += numero;//Suma iterativa de positivos
                conteo_pos++;
            }else{
                suma_neg+= numero;
                conteo_neg++;
            }
         
            
        }
         //Media positivos
          if(conteo_pos == 0){
              System.out.println("No se puede sacar la media de positivos");
          }else{
              media_pos = (float) suma_pos/conteo_ceros;
              System.out.println("La media de los positivos es " + media_pos);
          }
          
          //Media negativos
          if(conteo_neg == 0){
              System.out.println("No se puede sacar media de los negativos");
          }else{
              media_neg = (float) suma_neg/conteo_neg;
              System.out.println("La media de los numeros negativos es " + media_neg);
          }
            
            System.out.println("El numero de ceros que digitaste fue: "+ conteo_ceros);
    }
    
}
