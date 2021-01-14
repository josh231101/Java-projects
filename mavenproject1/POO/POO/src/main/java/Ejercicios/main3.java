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
public class main3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numeroVehiculos;
        int indiceBarato;
        
        System.out.println("Digite la cantidad de vehiculos");
        numeroVehiculos = entrada.nextInt();
        
        //Arreglo del num de coches que quiere el usuario
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for(int i = 0;i<coches.length;i++){
            entrada.nextLine();
            System.out.println("\n Digite las características del Coche " + (i+1));
            System.out.print("Introduzca Marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca el modelo del coche:");
            modelo = entrada.nextLine();
            System.out.print("Introduzca el precio del coche: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\n El coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
        
        

        
        
    }
    
    
    
    
    public static int indiceCocheMBarato(Vehiculo coches[]){
           float precio;
           int indice = 0;
           
           precio = coches[0].getPrecio();
           for(int i =1;i<coches.length;i++){
               if(coches[i].getPrecio() < precio){
                   precio = coches[i].getPrecio();
                   indice = i;
               }
           }
           return indice;
    }
    
}
