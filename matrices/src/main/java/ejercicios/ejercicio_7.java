/*
 Crear una matriz 5x5
y hacer un marco de unos lo demas de 0
 */
package ejercicios;

/**
 *
 * @author Miguel
 */
public class ejercicio_7{
    public static void main(String[] args){
        
        int matriz[][] = new int[10][10];
        
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                if(i == 0 || i == 8){
                    matriz[i][j] = 1;
                }
                else if(j==0 || j == 8){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
                
            }
        }
        
        System.out.println("Imprimos el marquito de matriz");
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                System.out.print(matriz[i][j] + " "); 
                
            }
            System.out.println("");
        }
    }
}
