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
public class main2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Tablero c1;
        int x,y;
        System.out.print("Digite la posicion x inicial: ");
        x = entrada.nextInt();
        System.out.print("Digite la posicion y inicial: ");
        y = entrada.nextInt();
        
        //Posicion inicial del objeto en el tablero
        c1 = new Tablero(x,y);
        
        int opcion;
        int valor;
        do{
            valor = 0;
            System.out.println("\n\t .:MENU:.");
            System.out.println("1.Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia la DERECHA");
            System.out.println("4. Mover hacia la IZQUIERDA");
            System.out.println("5. SALIR");
            System.out.println("DIGITE LA OPCION:");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Cuánto te moverás hacia arriba? ");
                    valor = entrada.nextInt();
                    
                    c1.moverArriba(valor);
                    System.out.println("Tu posicion acutal es");
                    System.out.println("Eje X: "+ c1.getX() + ", Eje Y: " + c1.getY());
                    break;
                case 2:
                    System.out.println("Cuánto te moverás hacia abajo? ");
                    valor = entrada.nextInt();
                    
                    c1.moverAbajo(valor);
                    System.out.println("Tu posicion acutal es");
                    System.out.println("Eje X: "+ c1.getX() + ", Eje Y: " + c1.getY());
                    
                    break;
                case 3:
                    System.out.println("Cuánto te moverás hacia la derecha? ");
                    valor = entrada.nextInt();
                    
                    c1.moverDerecha(valor);
                    System.out.println("Tu posicion acutal es");
                    System.out.println("Eje X: "+ c1.getX() + ", Eje Y: " + c1.getY());
                    
                    break;
                case 4:
                    System.out.println("Cuánto te moverás hacia la izquierda? ");
                    valor = entrada.nextInt();
                    
                    c1.moverIzquierda(valor);
                    System.out.println("Tu posicion acutal es");
                    System.out.println("Eje X: "+ c1.getX() + ", Eje Y: " + c1.getY());
                    
                    break;
                case 5:
                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Intenta de nuevo");
                    break;
            }        
        }while(opcion != 5);
            
        
                
    }
    
}
