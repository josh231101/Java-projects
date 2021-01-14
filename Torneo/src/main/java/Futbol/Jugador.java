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
public class Jugador {
    final private String nombre;
    final private String apellido;
    final private String nacionalidad;
    final private float estatura;
    final private String equipo;
    private int edad;
    final private int dorsal;
    final private String posicion;
    final private int goles;

    public Jugador(String nombre, String apellido, String nacionalidad, float estatura, String equipo, int edad, int dorsal, String posicion, int goles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
        this.equipo = equipo;
        this.edad = edad;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.goles = goles;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public float getEstatura() {
        return estatura;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getEdad() {
        return edad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getGoles() {
        return goles;
    }

    @Override
    public String toString() {
        return "Jugador: " + "\n Nombre: " + nombre + "\n Apellido=" 
                + apellido + "\nNacionalidad: " + nacionalidad + "\nEstatura: " 
                + estatura + "\nEquipo: " + equipo + "\n Edad: " + edad + 
                "\nDorsal: " + dorsal + "\nPosicion=" + posicion + "\nGoles=" 
                + goles ;
    }
    
    
    
    
}
