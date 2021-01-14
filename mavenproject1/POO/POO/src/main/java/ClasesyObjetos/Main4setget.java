/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyObjetos;

/**
 *
 * @author Miguel
 */
public class Main4setget {
    public static void main(String[] args){
        Getterysetter p1 = new Getterysetter();
        
        p1.setEdad(10);
        int edad = p1.getEdad();
        p1.setName("Marcolino");
        
        System.out.println("La edad de " + p1.getName() + " es " + edad);
    }
    
}
