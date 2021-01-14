/*
 Hacer un juego donde se tenga que adivinar un numero
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_5 {
    public static void main(String[] args){
        int numero,contador = 0;
        int aleatorio;
        
        aleatorio = (int) (Math.random()*100);//Generar un numero aleatorio entre 1 y 100
        System.out.println(aleatorio);
              
       
       
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(aleatorio > numero){
                System.out.println("Digita un numero mayor");
            }else{
                System.out.println("Digita un numero menor");
            }
               
            contador++;
        }while(numero!=aleatorio);
        
        System.out.println("Adivinaste el numero "+ aleatorio + " en " +  contador + " intentos");
        
    }
    
}
