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
public class ejercicio_15 {
    public static void main(String[] args){
        int edad,suma_edad=0,contador_edad=0,contador_estatura=0;
        float edad_media,estatura,suma_estatura=0,estatura_media;
        
        for(int i=1;i<=5;i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Digita la edad"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Digita tu estatura"));
            
            if(edad>18){   contador_edad++;}
            if(estatura>1.75){contador_estatura++;}
            suma_edad+=edad;
            suma_estatura+=estatura;
            
            
        }   
        edad_media = suma_edad/5;
        estatura_media = suma_estatura/5;
        System.out.println("El promedio de las edades es de" + edad_media);
        System.out.println("La estatura media es de " + estatura_media);      
        System.out.println("Hay " + contador_edad + "personas mayores a 18 y " + contador_estatura + "Mayores a 1.75");
        
        
    }
    
}
