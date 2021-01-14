/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AeropuertoPoo;

/**
 *
 * @author Miguel
 */
public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numeroMaxPasajero;
    private int numeroActualPasajeros;
    private Pasajero[] listaPasajeros;

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numeroMaxPasajero) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numeroMaxPasajero = numeroMaxPasajero;
        this.numeroActualPasajeros = 0;
        this.listaPasajeros = new Pasajero[numeroMaxPasajero];
    }

    
    public void insertarPasajero(Pasajero pasajero){
        listaPasajeros[numeroActualPasajeros] = pasajero;
        numeroActualPasajeros++; 
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }
    
    public String getIdentificador() {
        return identificador;
    }
    

    public double getPrecio() {
        return precio;
    }

    public int getNumeroMaxPasajero() {
        return numeroMaxPasajero;
    }

    public int getNumeroActualPasajeros() {
        return numeroActualPasajeros;
    }
    
    
    //Busquedas de un pasajero
    
    public Pasajero getPasajero(int i){
        return listaPasajeros[i];
    }
    
    
    public Pasajero getPasajero(String pasaporte){
        //BUSQUEDA SECUENCIAL
        boolean encontrado = false;
        int i=0;
        Pasajero pas=null;
        while((!encontrado)&& (i<listaPasajeros.length)){
            if(pasaporte.equals(listaPasajeros[i].getPasaporte())){
                encontrado = true;
                pas = listaPasajeros[i];
            }
            i++;
        }
      return pas;
    }
    
    
    
    
}
