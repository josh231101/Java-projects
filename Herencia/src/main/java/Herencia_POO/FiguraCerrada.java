/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia_POO;

/**
 *
 * @author Miguel
 */
public class FiguraCerrada extends Figura{
    private int nLados;
    
    public FiguraCerrada(double tamaño,int nLados){
        super(tamaño);
        this.nLados = nLados;
    }
    public final void dibujar(){
        System.out.println("Dibujo de una figura cerrada");
    }
       
}
