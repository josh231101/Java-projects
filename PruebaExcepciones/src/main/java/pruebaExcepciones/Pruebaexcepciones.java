/*
 try catch PARA EXCEPCIONES NO VERIFICADAS
 */
package pruebaExcepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Pruebaexcepciones {
    
    public void operaciones(){
        int num1 = 5,num2=0;
        int resultado = num1/num2;
        System.out.println(resultado);
    }
    
    public void operaciones2(){
        try{
            operaciones();
        }catch(ArithmeticException a){
            JOptionPane.showMessageDialog(null, "Ha intentado dividir un numero entero entre cero");
        }finally{
            System.out.println("Programa terminado");
        }
        
        System.out.println("Programa terminado");
    }
    public static void main(String[] args){
        Pruebaexcepciones prueba = new Pruebaexcepciones();
        prueba.operaciones2();
    }
    
}
