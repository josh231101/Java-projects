
package Herencia_POO;

/**
 *
 * @author Miguel
 */
//Estudiante hereda de la clase Persona
public class Estudiante extends Persona {
    
    private int codigoEstudiante;
    private float notaFinal;
    
    public Estudiante(String nombre, String apellido,int edad,int codigoEstudiante,float notaFinal){
        super(nombre,apellido,edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
        
    }
    public void mostrarDatos(){
        System.out.println("Nombre del estudiante" + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: "+ getEdad()+ 
                "\n El codigo del estudiante" + codigoEstudiante +
                "\nNota Fianl: " + notaFinal);
    }

    
    
    
}
