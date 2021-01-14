/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Main4 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero,numAtletas,indiceGanador;
        String nombre;
        float tiempo;
        
        System.out.println("BIENVENIDO AL ASISTENTE DE COMPETENCIAS");
        System.out.print("¿Cuántos atletas compitieron?: ");
        numAtletas = entrada.nextInt();
        
        Atleta atletas[] = new Atleta[numAtletas];
        
        for(int i = 0;i<atletas.length;i++){
            entrada.nextLine();
            System.out.println("Atleta " + (i+1) + ". Ingrese sus datos");
            
            System.out.println("Nombre: ");
            nombre = entrada.nextLine();
            
            System.out.println("Numero: ");
            numero = entrada.nextInt();
            
            System.out.println("Tiempo: ");
            tiempo = entrada.nextFloat();
            
            atletas[i] = new Atleta(numero, nombre, tiempo);
        }
        
        indiceGanador = indiceGanador(atletas);
        
        System.out.println(atletas[indiceGanador].atletaGanador());
    }
    public static int indiceGanador(Atleta atletas[]){
        float tiempo;
        int indice=0;
        
        tiempo = atletas[0].getTiempo();
        for(int i=1;i<atletas.length;i++){
            if(atletas[i].getTiempo() < tiempo){
                tiempo = atletas[i].getTiempo();
                indice = i;
            }
        }
        return indice;
    }
    
    
}
