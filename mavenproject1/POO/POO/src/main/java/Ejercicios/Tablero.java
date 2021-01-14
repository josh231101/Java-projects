/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Miguel
 */
public class Tablero {
    //Atributos
    private int x;
    private int y;
    
    //METODOS

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moverArriba(int incremento){
        y += incremento;
    }
    public void moverAbajo(int decremento){
        y -= decremento;
    }
    
    public void moverDerecha(int incremento){
        x += incremento;
    }
    public void moverIzquierda(int decremento){
        x-= decremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
    
    
    
    
}
