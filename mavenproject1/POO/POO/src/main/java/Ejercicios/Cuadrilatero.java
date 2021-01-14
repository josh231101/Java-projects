/*
Ejercicio1: Construir un programa que calcule el are y el perimetro
de un cuadrilatero dada la long de sus dos lados, los valores
de la longitud deberán introducirse por linea de ordenes. 
Si es un cuadrado, solo se prop la long de uno de los lados
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;

    //Metodo constructor 1
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Metodo constructor2 (Cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro(){
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    public float getArea(){
        float area = lado1*lado2;
        return area;
    }
    
    
    public static void main(String[] args){
        Cuadrilatero c1;
        float lado1,lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2"));
        
        if(lado1 == lado2){
            //Son cuadrados
            c1 = new Cuadrilatero(lado1);
            System.out.println("El perimetro del cuadrado es: " + c1.getPerimetro());
            System.out.println("El area del cuadrado es: " + c1.getArea());
        }
        else{
            c1 = new Cuadrilatero(lado1, lado2);
            System.out.println("El perimetro del cuadrado es: " + c1.getPerimetro());
            System.out.println("El area del cuadrado es: " + c1.getArea());
        }

    }
    
    
    
    
    
    
    
}
