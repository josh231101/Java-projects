package HelloWorld;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        
        
        //NUMEROS ENTEROS
        //Del -128 al 127
        byte numero = 127;
        //Hata es numero + y - +1
        short corto = 32767;
        //+ y - hasta ese
        int numeroreales = 2147483647;
        //El que más numeros acepta
        long maximo = 922337285;
        System.out.println("Numero " + numero);
        System.out.println(corto);
        System.out.println(numeroreales);
        System.out.println(maximo);
        //sout + tab es el print
        
        //NUMEROS REALES
        //Siempre con f el float
        float decimal = 3.45f;
        double decimallargo = 34.23523523523523;
        System.out.println(decimal);
        System.out.println(decimallargo);
        
        //CARACTERES
        char letra = 'A';
        System.out.println(letra);
        
        //BOOLEANOS
        boolean cierto = true;
        boolean falso = false;
        
        
        //DATOS NO PRIMITIVOS
        Integer numero2 = null;
        //Cadenas -->Es NO PRIMITIVA
        String texto = "BIENVENIDOS A MI CÓDIGO";
        
        //CONSTANTES
        final char letrab= 'B';
        System.out.println(letrab);
        
        
        //OBTENER DATOS C.9
        
        /*Scanner entrada = new Scanner(System.in);
        char letrita;
        
        System.out.println("Digite un numero: ");
        
        letrita = entrada.next().charAt(0);
        System.out.println("el numero es: " + letrita);*/
        


        
       
        //ENTRADA Y SALIDA DE TEXTO CON JOPTIONPANE
        String cadena;
        int entero;
        double decimal2;
        char caracter;
        cadena = JOptionPane.showInputDialog("Ingrese una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una numero"));
        caracter = JOptionPane.showInputDialog("Ingrese una caracter").charAt(0);
        decimal2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero decimal"));
        
        JOptionPane.showMessageDialog(null,cadena);
        JOptionPane.showMessageDialog(null,decimal2);
        JOptionPane.showMessageDialog(null,caracter);
        
                
                
                
    
    }
    
}
