/*
Ejercicio 9: Hacer un programa para calcular el área de Polígonos(T
riangulos y Rectangulos) el programa debe ser capaz de alamacenar en un
arreglo N triángulo y rectángulos, y al final
mostrar el area y los datos de cada uno.Para ello se tendrá lo
siguiente-.
1.Una calse Poligono
2.Una subclase Rectángulo.
3.Una subclase Triángulo.
 */
package Poligonos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Principal {
   
    //ARREGLO DINAMICO
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String [] args){
        //Llenar un polígono
        llenarPoligono();
        //Mostrar los datos y el área de cada Polígono
        mostrarResultados();
    }
    
    
    public static void llenarPoligono(){
        char respuesta;
        int opcion;
        do{
            do{
                System.out.println("Digite que polígono desea");
            System.out.println("1.Triangulo");
            System.out.println("2.Rectangulo");
            System.out.println("Opcion ");
            opcion = entrada.nextInt();  
            }while(opcion<1 || opcion>2);
            
            switch(opcion){
                    case 1://Llenar un triángulo
                        llenarTriangulo();
                        
                        break;
                    case 2://Llenar un rectángulo
                        llenarRectangulo();
                        break;
            }
            System.out.println("\nDesea introducir otro polígono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
            
        }while(respuesta == 's' || respuesta == 'S');
        
    }
    
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        
        System.out.print("Digite el lado 1 del Triangulo:");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del Triangulo:");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado 3 del Triangulo:");
        lado3 = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        
        //Guardamos un triángulo dentro de nuestro arreglo de polígonos
        poligono.add(triangulo);
    }
    public static void llenarRectangulo(){
        double lado1,lado2;
        System.out.print("Digite el lado 1 del Rectángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del Rectángulo: ");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
        
       
    }
    public static void mostrarResultados(){
        //Bucle for each le pasamos el arrayList poligono
        //RECORREMOS TODOS LOS DATOS
        for(Poligono poli:poligono){
            System.out.println(poli.toString());
            
            System.out.println("Area = "+poli.area());
            System.out.println("");
        }
    }
    
}
