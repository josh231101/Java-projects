//Operadores aritméticos combinados con asignación
package Operadores;

public class OperadoresAsign {
    public static void main(String[] args){
        int numero = 10;
        
        //numero = numero + 5;//Mal
        //Mejor abreviamos operaciones
        numero += 10;
        numero -= 10;
        numero *= 10;
        numero /= 10;
        numero %= 10;
        System.out.println(numero);
        
        //Operador de incremento y decremento
        int x = 5;
        x++;
        System.out.println(x);
       //TENER CUIDADO DE
       int y;
       y= ++x;
        System.out.println(y);
        
        
    }
    
}
