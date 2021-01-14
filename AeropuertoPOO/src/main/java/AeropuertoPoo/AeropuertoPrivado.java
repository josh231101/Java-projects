
package AeropuertoPoo;


public class AeropuertoPrivado extends Aeropuerto{
    private String listaempresas[] = new String[10];
    private int numEmpresas;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c,String e[]) {
        super(nombre, ciudad, pais, c);
        this.listaempresas = e;
        numEmpresas = e.length;
    }
    
    public void insertarEmpresas(String e[]){
        this.listaempresas = e;
        this.numEmpresas = e.length;
 
    }
    public void insertarEmpresa(String e){
        listaempresas[numEmpresas] = e;
        numEmpresas++;
    }

    public String[] getListaempresas() {
        return listaempresas;
    }

    public int getNumEmpresas() {
        return numEmpresas;
    }
    
    
    
    
    
    
}
