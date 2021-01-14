/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.io.Serializable;

/**
 *
 * @author Miguel
 */

public class Atleta implements Serializable{
    private String nombre;
    private int edad;
    private double peso;
    private int estatura;

    public Atleta(String nombre, int edad, double peso, int estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public int getEstatura() {
        return estatura;
    }  
}
