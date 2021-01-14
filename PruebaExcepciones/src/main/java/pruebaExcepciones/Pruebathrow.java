/*
 Uso de throw para excepciones personalizadas
 */
package pruebaExcepciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Pruebathrow {
    private int numero;
    private Scanner entrada;
    
    public void introducirNumeros() throws Excepcion0{
        
        entrada = new Scanner(System.in);
        do{
            System.out.println("Digite un numero");
            numero = entrada.nextInt();
            
            if(numero==0){//Quiero que se produzca una excepcion personalizada
                throw new Excepcion0();
                
            }
        }while(numero!=0);
    }
    
    public static void main(String[] args){
        Pruebathrow prueba = new Pruebathrow();
        
        try{
            prueba.introducirNumeros();
        }catch(Excepcion0 e){
            JOptionPane.showMessageDialog(null, "Ha introducido el numero 0");
        }
        System.out.println("Programa terminado");
        
    }
}
