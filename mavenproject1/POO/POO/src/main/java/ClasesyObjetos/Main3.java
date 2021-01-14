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
public class Main3 {
    
    public static void main(String[] args){
        Persona p1 = new Persona("Marco",52);
        Persona p2 = new Persona("Josue",18);
        
        p1.impresion();
        System.out.println("\n");
        p2.impresion();
        
        String curp = "AEE134C34";
        Persona p3 = new Persona(curp);
        
        
    }
}
