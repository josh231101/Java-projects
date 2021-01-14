/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Futbol;

import java.util.ArrayList;
import java.util.Scanner;
import javax.crypto.AEADBadTagException;

/**
 *
 * @author Miguel
 */
public class Main {
    static Scanner entrada = new Scanner(System.in);
    //Iniciamos una nueva lista de jugadores
    public static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    static ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();
    static ArrayList<Equipo> equipos = new ArrayList<Equipo>();   
    
    
    public static void main(String[] args){
        menu();
    }
    
    //Menu de opciones
    public static void menu(){
        int opcion;
        do{
            do{
              System.out.println("\n\t .:MENU FUTBOLERO:.");
            System.out.println("1. Agregar a un nuevo Equipo.");
            System.out.println("2. Agregar a un nuevo jugador.");
            System.out.println("3. Agregar a un nuevo DT.");
            System.out.println("4. Consultar todos los DT.");
            System.out.println("5. Consultar a todos los jugadores");
            System.out.println("6. Consultar a todos los equipos");
            System.out.println("7. Actualizar informacion");
            System.out.println("8. Salir");
            System.out.print("Digite la opcion: ");
            opcion = entrada.nextInt();  
            
            switch(opcion){
                case 1: agregarEquipo(); break;
                case 2: agregarJugador();break;
                case 3: agregarDT();break;
                case 4: consultarDTs(); break;
                case 5: consultarJugadores();break;
                case 6: consultarEquipos();break;
                case 7: actualizar(); break;
                case 8: System.out.print("\n Hasta pronto futbolero"); break;
                default: System.out.print("Opcion incorrecta");break;
                    
            }
            
            }while(opcion<1 || opcion>8);
        }while(opcion!=8);
        
    }
    public static void agregarEquipo(){
        String nombre,entrenador;
        int copasGanads,partidosGanados,partidosPerdidos,partidosEmpatados;
        
        
        entrada.nextLine();
        System.out.print("Ingresa el nombre del nuevo Equipo: ");
        nombre = entrada.nextLine();
        System.out.print("Ingresa el numero de copas que tiene: ");
        copasGanads = entrada.nextInt();
        System.out.print("Ingresa el numero de partidos ganados: ");
        partidosGanados = entrada.nextInt();
        System.out.print("Ingresa el numero de partidos perdidos: ");
        partidosPerdidos= entrada.nextInt();
        System.out.print("Ingresa el numero de partidos Empatados: ");
        partidosEmpatados = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese el nombre del entrenador: ");
        entrenador = entrada.nextLine();
        
        Equipo equipo = new Equipo(nombre,copasGanads,partidosGanados,partidosPerdidos,partidosEmpatados,jugadores,entrenador);
       
        
    }
    public static void agregarJugador(){
        String nombre,apellido,nacionalidad,posicion;
        float estatura;
        int dorsal,edad,goles;
        entrada.nextLine();
        System.out.print("Ingresa el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingresa el apellido: ");
        apellido = entrada.nextLine();
        System.out.print("Ingrese la nacionalidad: ");
        nacionalidad = entrada.nextLine();
        System.out.println("Ingrese la estatura: ");
        estatura = entrada.nextFloat();
        entrada.nextLine();
        System.out.println("Ingrese la posicion del equipo: ");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese el numero de playera: ");
        dorsal = entrada.nextInt();
        System.out.println("Cuantos goles tiene: ");
        goles = entrada.nextInt();
       
        Jugador jugador = new Jugador(nombre, apellido, nacionalidad, estatura, apellido, edad, dorsal, posicion, goles);
        jugadores.add(jugador);
        
        
    }
    public static void agregarDT(){
        String nombre,apellido,estrategia;
        int edad, añosExperiencia;
        entrada.nextLine();
        System.out.print("Digite el nombre del nuevo DT: ");
        nombre = entrada.nextLine();
        System.out.println("Digite el apellido del Dt: ");
        apellido = entrada.nextLine();
        System.out.println("Digite su edad: ");
        edad = entrada.nextInt();
        System.out.println("Digite los años de experiencia: ");
        añosExperiencia = entrada.nextInt();
        System.out.println("Que estrategia usa? ");
        estrategia = entrada.nextLine();
        Entrenador entrenador = new Entrenador(nombre, apellido, edad, añosExperiencia, estrategia);
        entrenadores.add(entrenador);
    
    }
    public static void consultarDTs(){
        for(Entrenador o:entrenadores){
            System.out.println(o.toString());
            System.out.println("\n");
        }
    }
    public static void consultarJugadores(){
        for(Jugador jugadores:jugadores){
            System.out.println(jugadores.toString());
            System.out.println("\n");
        }
    }
    public static void consultarEquipos(){
        for(Equipo equipos:equipos){
            System.out.println(equipos.toString());
            System.out.println("\n");
        }
    }
    
    public static void actualizar(){
        int opcion;
        String equipo;
        System.out.println("Que informacion quieres actualizar");
        System.out.println("1.Un Equipo");
        System.out.println("2.Un Jugador");
        System.out.println("3. Un Dt");
        opcion= entrada.nextInt();
        switch(opcion){
                
                case 1: entrada.nextLine();
                System.out.println("QUÉ EQUIPO? ");
                equipo = entrada.nextLine();
                    for(int i =0;i<equipos.size();i++){
                        if(equipo == equipos.get(i).getNombre()){
                            int opcion2;
                            do{
                                System.out.println("Que dese cambiar");
                            System.out.println("1.Partidos Gandos");
                            System.out.println("2.Partidos Empatados");
                            System.out.println("3.Partidos Perdidos");
                            System.out.println("4. Salir");
                            System.out.print("Opcion: ");
                            opcion2 = entrada.nextInt();
                            int numero;
                            switch(opcion2){
                                case 1: 
                                    
                                    System.out.print("Cuantos ganó: ");
                                    numero = entrada.nextInt();
                                    
                                    equipos.get(i).masGanados(numero); break;
                                case 2: System.out.print("Cuantos Empató: ");
                                        numero = entrada.nextInt();
                                        equipos.get(i).masEmpatados(numero);
                                        break;
                                case 3: 
                                    System.out.print("Cuantos Perdió: ");
                                        numero = entrada.nextInt();
                                        equipos.get(i).masPerdidos(numero);
                                    break;
                                case 4: System.out.println("Datos Actualizados");break;
                                default: break;
                            }while(opcion2<1 || opcion>4);
                            
                            }while(opcion2 !=4);
                        }
                    }  
                case 2: System.out.println("ACTUALIZADO....");break;
                case 3: System.out.println("ACTUALIZADO....");break;
        }
  
        
             
    }
    
}
    
