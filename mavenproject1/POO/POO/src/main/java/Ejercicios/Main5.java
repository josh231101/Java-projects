/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Main5 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double base,lado;
        int numeroTriangulos,trianguloAMIterador;
        
        numeroTriangulos = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos triangulos van a ser?"));
        
        
        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[numeroTriangulos];
        
       for(int i =0;i<numeroTriangulos;i++){
           System.out.println("TRIANGULO " + (i+1) + ". ");
           System.out.print("Digite la base del triangulo: ");
           base = entrada.nextDouble();
           System.out.print("Digite un lado del triangulo: ");
           lado = entrada.nextDouble();
           triangulos[i] = new Triangulo_Isosceles(base, lado);
           
       }
        System.out.println("\n\t LOS TRIANGULOS TIENEN LOS SIGUIENTES PERIMETROS Y AREAS");
        
        for(int i = 0;i<triangulos.length;i++){
            System.out.println("TRIANGULO " + (i+1));
            System.out.println(triangulos[i].mostrarDatos());
            System.out.println("\n");
        }
       
       
       trianguloAMIterador = iteradorTAMayor(triangulos);
        System.out.println("El trinauglo con mayor area es el siguiente");
        System.out.println(triangulos[trianguloAMIterador].mostrarDatos());
       
       
        
    }
    public static int iteradorTAMayor(Triangulo_Isosceles triangulos[]){
        double area;
        int iterador = 0;
        
        area = triangulos[0].obtenerArea();
        
        for(int i = 1;i<triangulos.length;i++){
            if(triangulos[i].obtenerArea() > area){
                area = triangulos[i].obtenerArea();
                iterador = i;
            }
            
        }
        return iterador;
    }
    
    
}
