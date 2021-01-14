/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package definimos;

/**
 *
 * @author Miguel
 */
public class matriz {
    public static void main(String[] args){
        //CRAR MATRIZ DE FORMA MANUAL
        
        //Esta matriz contiene 3 filas y 4 columnas
        int matriz[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(matriz[i][j] + " , ");
                
            }
            System.out.println("");
        }
    }
    
}
