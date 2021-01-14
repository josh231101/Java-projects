/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectOne;

/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String equipo_local = "BARCELONA";
        String equipo_visitante = "REAL MADRID";
        
        int goles_local = 0;
        int goles_visitante = 0;
        
        goles_local++;
        goles_local++;
        goles_visitante +=2;
        goles_visitante--;
        
        System.out.println("Marcador Final: ");
        System.out.println(equipo_local + " "+goles_local + "-" + equipo_visitante +" "+ goles_visitante);
        
        
        //Array
        String contactos[] = new String[10];
        contactos[0] = "Carolina";
        contactos[1] = "Josué";
        contactos[2] = "Manuel";
        contactos[3] = "Andrea";
        contactos[4] = "Nose";
        contactos[5] = "Andrea";
        contactos[6] = "Nose";
        contactos[7] = "Andrea";
        contactos[8] = "Nose";
        contactos[9] = "Andrea";
      
        
       System.out.println(contactos[9]);
       
       //
       int poloshirt = 250;
       int joshedad = 17;
       String slogan = "Just Do It";
       long ratiustart = 2023525000;
       double descuento = 0.7;
       //Van con una comilla
       char eficienty = 'A';
       double gravity = 9.80665;
       double pi = 3.1415192052;
       
       System.out.println(poloshirt + " " + joshedad + slogan);
       System.out.println(ratiustart + " "+ descuento + " " + eficienty);
       System.out.println(gravity +" "+pi);
       
       
       
        
    }
    
}
