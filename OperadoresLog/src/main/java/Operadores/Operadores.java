//Operadores Aritméticos
package Operadores;

import java.util.Scanner;


public class Operadores {
    public static void main(String[] args){
        System.out.println("Hola mundo");
        
        Scanner entrada = new Scanner(System.in);
        float numero1,numero2, suma, resta, multi, div, resto;
        
        System.out.print("Digite 2 numeros: ");
        numero1 = entrada.nextFloat();
        numero2= entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        div = numero1/numero2;
        resto = numero1%numero2;//Mod divide num1 /num2 y saca el residu
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multi);
        System.out.println("La division es: " + div );
        System.out.println("El resto de la division es: " + resto);
    
        
        
        
    }
    
}
