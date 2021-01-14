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
public class Principal7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre,apellido,dni;
        int numeroCuenta,nCuentas,opcion,indiceCuenta;
        double saldo,cantidad;
        Cuenta cuentas[];
        Cliente cliente;
        
        System.out.print("\n Digite el nombre del cliente ");
        nombre = entrada.nextLine();
        System.out.print("Digite su apellido");
        apellido = entrada.nextLine();
        System.out.print("Digite su DNI");
        dni = entrada.nextLine();
        System.out.print("Digite cuantas tiene: ");
        nCuentas = entrada.nextInt();
        
        cuentas = new Cuenta[nCuentas];
        
        for(int i=0;i<cuentas.length;i++){
            
            System.out.println("\n Digite los datos para la cuenta" + (i+1)+ ":");
            System.out.println("Digite el numero de cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.println("Digite el saldo de la cuenta");
            saldo = entrada.nextDouble();
            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }
        
        cliente = new Cliente(nombre, apellido, dni, cuentas);
       
        do{
            System.out.println("\n\t .:MENU:.");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consulat dinero de la cuenta");
            System.out.println("4. Salir");
            System.out.println("Digite la opcion");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Digite el numero de cuenta");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    if(indiceCuenta == -1){
                        System.out.println("El numero de cuenta ingresado no existe");
                    
                    }else{
                        System.out.println("\n Digite la cantidad de dinero a ingresar");
                        cantidad = entrada.nextDouble();
                        
                        cliente.ingresar_dinero(indiceCuenta, cantidad);
                        System.out.println("\n Ingreso realizado Correctamente....");
                        System.out.println("Saldo disponible: " + cliente.consultar_saldo(indiceCuenta));
                        
                    }
                    break;
                case 2: 
                    System.out.println("Digite el numero de cuenta");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    
                    if(indiceCuenta == -1){
                        System.out.println("No existe tal numero de cuenta");
                        
                    }else{
                        System.out.println("Cuanto dinero desea retirar");
                        cantidad = entrada.nextDouble();
                        if(cantidad>cliente.consultar_saldo(indiceCuenta)){
                            System.out.println("Saldo insuficiente");
                        }
                        else{
                        cliente.retirar_dinero(indiceCuenta, cantidad);
                        System.out.println("Retiro realizado existosamente..");
                        System.out.println("Saldo acutal" + cliente.consultar_saldo(indiceCuenta));
                        }
                        
                    }
                    break;
                case 3:
                     System.out.println("Digite el numero de cuenta");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    
                    if(indiceCuenta == -1){
                        System.out.println("No existe tal numero de cuenta");
                        
                    }else{
                         System.out.println("Saldo acutal" + cliente.consultar_saldo(indiceCuenta));
                    }
                  break;                         
                case 4: 
                    System.out.println("Hasta luego");
                    break;
                default: System.out.println("No escribiste un numero correcto");
            }
        }while(opcion != 4);
        
    }
    public static int buscarNumeroCuenta(Cuenta cuentas[],int n){
        int i=0,indice=0;
        boolean encontrado = false;
        
        //BUSQUEDA SECUENCIAL
        while(i<cuentas.length && (encontrado ==false)){
            if(cuentas[i].getNumeroCuenta() == n){
                encontrado = true;
                indice = i;
            }
            i++;
        }
        if(encontrado == false){
            indice = -1;
        }
        return indice;
    }

    
}
