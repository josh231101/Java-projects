/*
 Ejercicio 4:Construir un programa para una competencia de
atletismo, el programa debe gestionar una serie de atletas
caracterizados por su número de atleta, nombre y tiempo de carrera,
al final el programa debe mostrar los datos del atleta ganador 
de la carrera
 */
package Ejercicios;

/**
 *
 * @author Miguel
 */
public class Atleta {
    //Atributo
    private int numero;
    private String nombre;
    private float tiempo;
    
    
    //METODO
    //Constructor
    public Atleta(int numero,String nombre,float tiempo){
        this.numero = numero;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }
    
   public String atletaGanador(){
       return nombre + " con el numero " + numero + " ha ganado la competencia con un tiempo total de " + tiempo + " segundos";
   } 
    
    
    
    
}
