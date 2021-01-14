/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Futbol;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Equipo {
    private String nombre;
    private int copasGanads;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private ArrayList<Jugador> jugadores;
    private String entrenador;

    public Equipo(String nombre, int copasGanads, int partidosGanados, int partidosPerdidos, int partidosEmpatados, ArrayList<Jugador> jugadores, String entrenador) {
        this.nombre = nombre;
        this.copasGanads = copasGanads;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.partidosEmpatados = partidosEmpatados;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
    }

    

    public String getNombre() {
        return nombre;
    }

    public int getCopasGanads() {
        return copasGanads;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + "\nCopas Ganadas: " + copasGanads + "\nPartidos Ganados: " 
                + partidosGanados +"\nPartidos Empatados: " + partidosEmpatados 
                + "\nPartidos Perdidos: " + partidosPerdidos +"\nNumero de jugadores: "+ jugadores.size()+
                "\nEntrenador actual: " + entrenador + entrenador;
    }   
    public void masGanados(int numero){
        partidosGanados+=numero;
    }
    public void masEmpatados(int numero){
        partidosEmpatados+=numero;
    }
    public void masPerdidos(int numero){
        partidosPerdidos+=numero;
    }
    
}
