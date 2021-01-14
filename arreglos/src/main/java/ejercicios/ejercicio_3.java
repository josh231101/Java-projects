/*
 Leer 5 numeros por teclado,almacenarlos en un arreglo, y sacar la media de los
numeros positivos,negativos y los ceros.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int conteo_ceros=0,conteo_positivos=0,conteo_neg=0;
        float[] numeros = new float[5];
        float suma_neg=0,suma_pos=0;
        float resultado_pos,resul_neg;
        
        System.out.println("Introduzca 5 numeros ya sean positivos negativos o ceros");
        for(int i =0;i<5;i++){
            System.out.println((i+1) + ". Numero ");
            numeros[i] = entrada.nextFloat();
            if(numeros[i] == 0 ){
                conteo_ceros++;
            }else if(numeros[i] <0 ){
                conteo_neg++;
                suma_neg+= numeros[i];
            }else{
                conteo_positivos++;
                suma_pos+=numeros[i];
            }
            
        }
        if(conteo_neg==0){
            System.out.println("No hay numeros negativos");
        }else{
            resul_neg = suma_neg/conteo_neg;
            System.out.println("\n La media de los numeros negativos es: \n " + resul_neg);
        }
        if(conteo_positivos == 0){
            System.out.println("No hay numeros negativos");
        }else{
        resultado_pos = suma_pos/conteo_positivos;
            System.out.println("\n La media de los numeros positivos es: \n" + resultado_pos );
        }
        System.out.println("El numero de ceros es: " + conteo_ceros);
        
        
        System.out.println("Gracias por participar");
        
        
    }
}
