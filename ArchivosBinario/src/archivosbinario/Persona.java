/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosbinario;

import java.io.Serializable;

/**
 *
 * @author Miguel
 */
public class Persona implements Serializable{//Interfaz que todos los objetos van a seri serializables es decir que se van a transformar en un flujo de bytes
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: " + edad);
        System.out.println("\n");
    }
    
    
    
}
