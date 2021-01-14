/* 
Ejercicio 4:
Calcular el salario mensual de un empleado vendedor de autos,
si recibe $1000 dolares mensuales, mas una comisión de $150 por cada carro 
vendido, mas el 5% de comisión.
 */
package Ejercicios1;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio_4 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        final int salario = 1000;
        int carrosVendidos,comision1,comision2;
        float costeCarro,salarioTotal;
        
        System.out.println("Cuantos carros vendiste en el mes: ");
        carrosVendidos = entrada.nextInt();
        
        
        System.out.println("Digite el coste del carro: ");
        costeCarro = entrada.nextFloat();
        
        salarioTotal = salario + (carrosVendidos * 150) + (0.05f *costeCarro*carrosVendidos); ;
        
        System.out.println("\n El salario del empleado es: "+ salarioTotal);
    }
    
    
}
