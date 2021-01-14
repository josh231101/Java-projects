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
public class Persona {
    //Atributos
    String nombre;
    int edad;
    String curp;
    
    //METODOS
    //Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //Sobre carga de constructor

    public Persona(String curp) {
        this.curp = curp;
    }
    
    
    public void impresion(){
        System.out.println("Bienvenido " + nombre);
        System.out.println("Tu edad actual es: " + edad);
    }
    
    
}
