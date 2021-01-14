/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Miguel
 */
public class ejercicio_2 {
    public static void main(String[] args){
        int matriz[][] = {{1,2,3},{1,2,3},{1,2,3}},sum1=0,sum2=0,sumaT=0;
        int matrizdos[][] = {{1,2,3},{1,2,3},{1,2,3}};
        
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                sum1+=matriz[i][j];
                sum2+=matrizdos[i][j];
            }
        }
        sumaT = sum1+sum2;
        System.out.println("La suma total de todos los valores de la matriz es: ");
        System.out.println("\n " + sumaT);
        
       
        
        
    }
    
}
