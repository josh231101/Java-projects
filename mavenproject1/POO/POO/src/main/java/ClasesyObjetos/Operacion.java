
package ClasesyObjetos;

import javax.swing.JOptionPane;


public class Operacion {
    //Atributos
    //Estas son las llamadas variables globales pq pueden usarse en todo el código
   
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //METODOS
    
    
    //metodo para sumarlos
    //Añadimos variables locales es decir le ponemos parametros al metodo
    public void sumar(int num1,int num2){
        suma = num1 + num2;
    }
    
    //metodo para restarlos
    public void restar(int num1,int num2){
        resta = num1 - num2;
    }
    
    public void multiplicar(int num1,int num2){
        multiplicacion = num1 * num2;
    }
    
    public void dividir(int num1, int num2){
        division = num1/num2;
    }
    
    public void mostrar(){
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println(" La multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);
    }
    
}
