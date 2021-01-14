
package Ejercicios;

import java.util.Scanner;


public class Main6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        /*
        numero 1 = a +b;
        numero 2 = c + d;
        */
         NumeroComplejo numero1,numero2,suma,multi;      
        double a,b,c,d;
        int opcion;
        int entero;
        
        do{
            System.out.println("\t .:Operaciones con Numero Complejos:."); 
            System.out.println("1.Sumar dos mumeros complejos");
            System.out.println("2.Multiplicar 2 numeros complejos.");
            System.out.println("3. Comparar 2 números complejos(iguales o no)");
            
            System.out.println("4. Multiplicar un número complejo por un entero.");
            System.out.println("5.Salir");
            System.out.println("Digite la opcion de menu: ");
            opcion = entrada.nextInt();
            
            
            switch(opcion){
                case 1:
                    System.out.println("\nDigite el primer numero complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("\n Digite el segundo numero Complejo");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    
                    
                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);
                    
                    suma = numero1.calcularSuma(numero2);
                    System.out.println("\n La suma es: " + suma.getA() + " + " + suma.getB() + "i");
                    
                    break;
                case 2:
                    System.out.println("\nDigite el primer numero complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("\n Digite el segundo numero Complejo");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    
                    
                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);
                    
                    multi = numero1.calcularProducto(numero2);
                    System.out.println("\n La multiplicacion es: " + multi.getA() + " + " + multi.getB() + "i");
                    
                    break;
                case 3:
                    System.out.println("\nDigite el primer numero complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("\n Digite el segundo numero Complejo");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    
                    
                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);
                    
                    if(numero2.comprobarIgualdad(numero2)){
                        System.out.println("Los dos numeros complejos son iguales");
                    }else{
                        System.out.println("\nLos numeros complejos no son iguales");
                    }
                    break;
                case 4: 
                    System.out.println("\nDigite el primer numero complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("\n Digite el entero");
                    entero = entrada.nextInt();
                    
                    numero1 = new NumeroComplejo(a, b);
                    multi = numero1.multiplicarPorEnter(entero);
                    System.out.println("\n La multiplicacion es: " + multi.getA() + " + " + multi.getB() + "i");
                    break;
            }
            System.out.println("");
                    
        }while(opcion !=5);
        
        
    }
    
}
