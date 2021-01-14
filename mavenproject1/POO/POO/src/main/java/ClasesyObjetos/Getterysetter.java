
package ClasesyObjetos;


public class Getterysetter {
    //Encapsulamiento: Ocultamos estos atributo para que no se puedan modificar
    //mas que aqui
    
    private int edad;
    private String nombre;
    private char primerLetra;
    
    //Setter y Getter: Manipular los atributos sin que puedan sen violados por otra clase
    
    //Metodo setter
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Metodo getter
    public int getEdad(){
        return edad;
    }
    //Getter y setter del nombre
    public void setName(String nombre){
        this.nombre = nombre;
    }
    public String getName(){
        return nombre;
    }

    
    
    
    
    
}
