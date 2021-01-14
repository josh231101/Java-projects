/*
    Leer dos series de 10 enteros, que estaraán ordenados
crecientemente.Copiar(fusionar) las dos tablas en una tercera,
de forma que sigan ordenados
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicios_14 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo_1[] = new int[10], arreglo_2[] = new int[10],i;
        int[] arreglo_final = new int[20];
        System.out.println("Primer arreglo");
        for(i=0;i<10;i++){
            System.out.println((i+1) + ". Numero: ");
            arreglo_1[i]= entrada.nextInt();
            if(i!=0){
                if(arreglo_1[i-1]>arreglo_1[i]){
                    System.out.println("Digita los numeros en orden creciente");
                    i-=1;
                }
            }
        }
        System.out.println("Segundo arreglo");
        
        for(i=0;i<10;i++){
            System.out.println((i+1) + ". Numero: ");
            arreglo_2[i]= entrada.nextInt();
            if(i!=0){
                if(arreglo_2[i-1]>arreglo_2[i]){
                    System.out.println("Digita los numeros en orden creciente");
                    i-=1;
                }
            }
        }
        
        
        //Comprobar cual es mayor que otro
        
        int j=0;
        
        for(i=0;i<10;i++){
            if(arreglo_1[i]<arreglo_2[i]){
                arreglo_final[j] = arreglo_1[i];
                j++;//j=1
                arreglo_final[j] = arreglo_2[i];
                j++;//j=2
                
            }
            else if(arreglo_1[i] > arreglo_2[i] ){
                arreglo_final[j] = arreglo_2[i];
                j++;
                arreglo_final[j] = arreglo_1[i];
                j++;
            }
            else if(arreglo_1[i] == arreglo_2[i]){
                arreglo_final[j] = arreglo_1[i];
                j++;
                arreglo_final[j] = arreglo_2[i];
            }
        }
        System.out.println("Imprimimos arreglo final combinando todos");
        for(i=0;i<20;i++){
            System.out.print(arreglo_final[i] + " , ");
        }
    
    }
}
