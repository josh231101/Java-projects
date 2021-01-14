/*
 Ejercicio 3: Construir un programa que dad una serie de vehículos caracterizados
por su marca,modelo y precio,imprima las propiedades del vehículo
más barato. Para ello, deberán leer por teclado las características
de vehículo y crear una clase que represente a cada uno de ellos
 */
package Ejercicios;

/**
 *
 * @author Miguel
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;
    
    //Constructor
    public Vehiculo(String marca,String modelo,float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    //getPrecio

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio" + precio;
    }
    
    
    
}
