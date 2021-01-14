/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

/**
 *
 * @author Miguel
 */
public class Persona {
    private String persona;
    private int edad;
    private String nacionalidad;

    public Persona(String persona, int edad, String nacionalidad) {
        this.persona = persona;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return this.persona;
    }
    
    
    
    
    
}
