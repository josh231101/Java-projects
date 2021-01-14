/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Futbol;

/**
 *
 * @author Miguel
 */
public class Entrenador {
    final private String nombre;
    final private String apellido;
    private int edad;
    private int añosExperiencia;
    private String estrategia;

    public Entrenador(String nombre, String apellido, int edad, int añosExperiencia, String estrategia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.añosExperiencia = añosExperiencia;
        this.estrategia = estrategia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void cumpleaños(){
        edad+=1;
    }

    public void setAñosExperiencia(){
        añosExperiencia+=1;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public String toString() {
        return "Entrenador: " + "\nNombre: " + nombre + "\nApellido: " + 
                apellido + "\nEdad: " + edad + "\nA\u00f1osExperiencia: " + 
                añosExperiencia + "\nEstrategia: " + estrategia;
    }
    
    
    
    
    
    
    
    
}
