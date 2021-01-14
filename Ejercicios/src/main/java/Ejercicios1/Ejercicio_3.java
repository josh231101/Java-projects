//Calcular la suma de dinero que tiene Guillermo, Luis y Juan si Luis tiene la mitad de Guillermo y Juan la mitad de la suma de guille y luis
package Ejercicios1;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double guillermo,luis,juan,dolares;
        System.out.println("Digita cuanto dinero tiene Guillermno: ");
        guillermo = entrada.nextDouble();
        
        luis = guillermo / 2;
        juan = luis + guillermo;
        dolares = guillermo + luis + juan;
        
        System.out.println("Guillermo Luis y Juan tienen: " + dolares + " dolares");
        
    }
   
}
