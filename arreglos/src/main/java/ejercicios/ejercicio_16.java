/*
 Queremos desarrolar una aplicacion que nos ayude a agestionar las notas.
CADA GRUpo tiene 5 alumnos,Se pide leer las notas del primer,segundo, y tercer 
trimestre de un grupo. Debemos mostrar al final: La nota media del grupo
en cada trimestre, y la media del alumno que se encuentra en la posicion N(N 
se le por el teclado);
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ejercicio_16 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float primer[],segundo[],tercero[];
        int posicion;
        
        primer = new float[5];//Arreglo con 5 elementos
        segundo = new float[5];
        tercero = new float[5];
        
        float sumaPrimer=0,sumaSegundo=0,sumaTercer=0,sumaAlumno=0;
        float promedioPrimer,promedioSegundo,promedioTercero,promedioAlumno;
        
        System.out.println("Digite las notas del primer trimestre");
        for(int i =0;i<5;i++){
            System.out.println("Alumno " + i +" : ");
            primer[i] = entrada.nextFloat();
            sumaPrimer += primer[i];//Suma iterativa para obtener promedio
        }
        System.out.println("Digite las notas del segundo trimestre");
        for(int i =0;i<5;i++){
            System.out.println("Alumno " + i +" : ");
            segundo[i] = entrada.nextFloat();
            sumaSegundo+=segundo[i];
        }
        System.out.println("Digite las notas del tercer trimestre");
        for(int i =0;i<5;i++){
            System.out.println("Alumno " + i +" : ");
            tercero[i] = entrada.nextFloat();
            sumaTercer += tercero[i];
        }
        //Sacamos los promedios de cada uno de los Trimestres
        promedioPrimer = sumaPrimer/5;
        promedioSegundo= sumaSegundo/5;
        promedioTercero = sumaTercer/5;
        
        //Ahora pedimos la posicion del alumno N para sacar su promedio
        do{
            
            System.out.println("Digite la posicion del alumno para sacar el promedio");
            posicion = entrada.nextInt();
        }while(posicion<0 || posicion>4);
        
        //Sacamos la suma de las notas del alumno
        sumaAlumno = primer[posicion] + segundo[posicion] + tercero[posicion];
        promedioAlumno = sumaAlumno/3;
        
        System.out.println("Mostrando los datos requeridos");
        System.out.println("EL PROMEDIO DE PRIMER TRIMESTRE ES: " + promedioPrimer);
        System.out.println("EL PROMEDIO DE SEGUNDO TRIMESTRE ES: " + promedioSegundo);
        System.out.println("EL PROMEDIO DE TERCER TRIMESTRE ES: " + promedioTercero);
        
        System.out.println("El promedio del alumno es: " + promedioAlumno);
        
        
        
        
        
        
        
    }
    
}
