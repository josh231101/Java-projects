/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double peso;
        String dni,direccion,ciudad;
        int numPaquete,prioridad,numSucursaal,opcion;
        int contadorSucursales=0,contadorPaquetes=0,indiceSucursal,indicePaquete;
        
        Sucursal sucursal[] = new Sucursal[100];
        Paquete[] paquete = new Paquete[50];
        
        
        
        do{
            System.out.println("\n\t ...:MENU:...");
            System.out.println("1. Ingresar una sucursal");
            System.out.println("2.Realizar un envio");
            System.out.println("3. Consultar sucursal");
            System.out.println("4.Consultar un paquete");
            System.out.println("5.Consultar todas las sucursales");
            System.out.println("6.Consultar todos los envios");
            System.out.println("7.Salir del Menu");
            System.out.print("Ingresa la opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    entrada.nextLine();
                    System.out.println("\n Digite el numero de sucursal:");
                    numSucursaal = entrada.nextInt();
                    System.out.print("Digite la direccion: ");
                    entrada.nextLine();
                    direccion = entrada.nextLine();
                    System.out.print("Digite la ciudad: ");
                    ciudad = entrada.nextLine();
                    sucursal[contadorSucursales] = new Sucursal(numSucursaal, direccion, ciudad);
                    System.out.println("Sucursal "+numSucursaal+"guardada con éxito!");
                    contadorSucursales++;
                    break;
                case 2: 
                    System.out.println("\nDigite el numero de sucursal");
                    numSucursaal = entrada.nextInt();
                    indiceSucursal = buscarSucursal(sucursal, numSucursaal, contadorSucursales);
                    
                    if(indiceSucursal == -1){
                        System.out.println("No existe esa sucursal");
                        
                    }else{
                        System.out.print("Digite el numero de paquete");
                        numPaquete = entrada.nextInt();
                        System.out.print("Digite el DNI de la persona que envia el paquete");
                        entrada.nextLine();
                        dni = entrada.nextLine();
                        System.out.print("Digite el peso del paquete:");
                        peso = entrada.nextDouble();
                        System.out.println("Digite la prioridad:");
                        System.out.println("0-Normal" + "\n1-Alta" + "\n2-Express");
                        System.out.print("Digite el numero de prioridad: ");
                        prioridad = entrada.nextInt();
                        
                        paquete[contadorPaquetes] = new Paquete(peso, dni, numPaquete, prioridad);
                        System.out.println("El precio del envio será de: " + sucursal[indiceSucursal].calcular_precio(paquete[contadorPaquetes])+ "$");
                        
                        contadorPaquetes++;
                    }
                    break;
                case 3: 
                    System.out.print("Digita el numero de sucursal a consultar: ");
                    numSucursaal = entrada.nextInt();
                    
                    indiceSucursal = buscarSucursal(sucursal, numSucursaal, contadorSucursales);
                    if(indiceSucursal == -1){
                        System.out.println("La sucursal no existe");
                    }else{
                        System.out.println("\n\t .:SUCURSAL " + numSucursaal + ":.");
                        System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                    }
                    break;
                case 4:
                    System.out.println("\n\t .:CONSULTA DE PAQUETES:.");
                    System.out.println("Consulta el paquete por el numero de tu Paquete");
                    numPaquete = entrada.nextInt();
                    
                    indicePaquete = buscarPaquete(paquete, numPaquete, contadorPaquetes);
                    if(indicePaquete == -1){
                        System.out.println("No existe ese numero de paquete");
                    }else{
                        System.out.println("\n\t .:PAQUETE" + numPaquete +":.");
                        System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
                    }
                    
                    break;
                case 5:
                    System.out.println("\n\t .:MOSTRANDO TODAS LAS SUCURSALES:.");
                    for(int i =0;i<contadorSucursales;i++){
                        System.out.println(sucursal[i].mostrarDatosSucursal());
                    }
                    System.out.println("\n");
                    break;
                case 6: 
                    System.out.println("\n\t .:MOSTRANDO TODOS LOS PAQUETES:.");
                    for(int i = 0;i<contadorPaquetes;i++){
                        System.out.println(paquete[i].mostrarDatosPaquete());
                    }
                    System.out.println("\n");
                    break;
                
                case 7: System.out.println("Gracias por visitarnos");
                break;
                default:System.out.println("ERROR 404 Numero equivocado");
            }
            
            
            
        }while(opcion!=7);
    }
    public static int buscarSucursal(Sucursal t[],int numeroSucursal,int contadorSucursal){
        int indice = 0;
        boolean encontrado = false;
        
        for(int i =0;i<contadorSucursal;i++){
            if(t[i].getNumSucursal() == numeroSucursal){
                encontrado = true;
                indice = i;
                
            }
            
        }
        if(encontrado == false){
            indice = -1;
        }
        return indice;
    }
    
    //Este metodo devuelve el indice del paquete
    public static int buscarPaquete(Paquete t[],int numeroPaquete,int contadorPaquete){
        int indice = 0;
        boolean encontrado = false;
        
        for(int i = 0;i<contadorPaquete;i++){
            if(t[i].getNumPaquete() == numeroPaquete){
                encontrado = true;
                indice = i;
            }
        }
        if(encontrado==false){
            indice = -1;
        }
        return indice;
        
        
    }
    
}
