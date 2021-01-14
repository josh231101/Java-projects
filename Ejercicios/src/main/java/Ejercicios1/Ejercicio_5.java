/*
 La calificación de un estudiante de Informatica se calcula con base a alas 
calificaciones de cuatro aspectos de su rtendimiento académico:
participación, primer examen final,segundo examen final.
Sabiendo que las calificaciones anteriores entrana a la calificación final 
pondereaciones del 10%,25%,25%,y 40%. Hacer un programa que calcule e 
imprima la calificació final obtenida por un estudiante.
 */
package Ejercicios1;

import java.util.Scanner;


public class Ejercicio_5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float participacion,primerExamen,segundoExamen,examenFinal,notaFinal;
        
        System.out.println("Digite la nota de participación: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen parcial: ");
        primerExamen = entrada.nextFloat();
        System.out.println("Digite la nota del segundo examen parcial: ");
        segundoExamen = entrada.nextFloat();
        System.out.println("Digite la nota del examen final: ");
        examenFinal = entrada.nextFloat();
        
        
        //Sacamos los calculos
        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *=0.40f;
        
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        
        System.out.println("La calificacion que obtuviste este año fue de: " + notaFinal);
        
        
        
    }
    
}
