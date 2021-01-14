/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyObjetos;


public class Coche {
    
    //Atributos de mi clase Coche
    String color;
    String marca;
    int km;
    
    
    //Metodo
    public static void main(String[] args){
        //Creamos objetos de la clase coche
        Coche coche1 = new Coche();
        
        //Rellenar los atributos de mi objeto
        coche1.color = "Rojo";
        coche1.marca = "Ford";
        coche1.km = 0;
        
        
        System.out.println("El color del coche1 es " + coche1.color);
        
        System.out.println("La marca del coche1 es " + coche1.marca);
    
        System.out.println("El kilometraje del coche es " + coche1.km);
    
        Coche coche2 = new Coche();
        coche2.color = "Azul";
        coche2.marca = "Ferrari";
        coche2.km = 1200;
        System.out.println("\n");
        System.out.println("El color del coche1 es " + coche2.color);
        
        System.out.println("La marca del coche1 es " + coche2.marca);
    
        System.out.println("El kilometraje del coche es " + coche2.km);
        
    
    }
    
    
    
}
