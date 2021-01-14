/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AeropuertoPoo;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Principal {
    static Scanner entrada = new Scanner(System.in);
    final static int num = 4;//Numero de aeropuertos
    static Aeropuerto aeropuertos[] = new Aeropuerto[num];
    
    public static void main(String[] args){
        //Insertar datos de los aeropuertos
        insertarDatosAeropuerto(aeropuertos);
        
        
        menu();
    }
    
    public static void insertarDatosAeropuerto(Aeropuerto aero[]){
        //Aeropuerto 1
        aero[0] = new AeropuertoPublico(80000000, "Jorge Chavez", "Lima", "Peru");
        aero[0].insertarCompañia(new Compañia("AeroPeru"));
        aero[0].insertarCompañia(new Compañia("LATAM"));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 180.99, 120));
        aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20BGHP", "Peruano"));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
        aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21KL", "Peruano"));
        
        //Aeropuerto 2
        aero[1] = new AeropuertoPrivado("Central Ciudad Real","Ciudad Real","España");
        aero[1].insertarCompañia(new Compañia("AirEuropa"));
        String empresas[] = {"Cobresol","Anguila34"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
        aero[1].getCompañia("AirEuropa").insertarVuelo(new Vuelo("AE025","Madrid","Buenos Aires",150.50,120));
        aero[1].getCompañia("AirEuropa").getVuelo("AE025").insertarPasajero(new Pasajero("Juan Pablo","EA384794","Mexicana"));
        
        //Aeropuerto 3
        aero[2] = new AeropuertoPublico(20000000,"Aeropuerto Bogota","Bogota","Colombia");
        aero[2].insertarCompañia(new Compañia("AirAmerica"));
        aero[2].insertarCompañia(new Compañia("VuelaBogota"));
        aero[2].getCompañia("AirAmerica").insertarVuelo(new Vuelo("AE030","Bogota","Lima",130.90,110));
        aero[2].getCompañia("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Damaris","000AA4G5","Colombiana"));
        
        //Aeropuerto 4
        aero[3] = new AeropuertoPublico(40000000,"Aeropuerto Mexico","Mexico","Mexico");
        aero[3].insertarCompañia(new Compañia("AeroMexico"));
        aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("IB2040","Mexico","Nueva York",130.90,140));
        aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("IB2042","Mexico","Lima",100.80,150));
        aero[3].getCompañia("AeroMexico").getVuelo("IB2040").insertarPasajero(new Pasajero("Maria","AA4794H","Inglesa"));
        
        
    }

    private static void menu() {
       int opcion;
       String nombreaeropuerto,nombreCompañia,origen,destino;
       Aeropuerto aeropuerto;
       Compañia compañia;
       do{
           System.out.println("\t .:MENU:.");
           System.out.println("1. Ver Aeropuertos gestionados(Publicos o Privados)");
           System.out.println("2. Ver empresas(Privado) o Subvencion(Publicos)");
           System.out.println("3. Lista de compañias de un aeropuerto");
           System.out.println("4. Lista de vuelos por compañia");
           System.out.println("5. Listar posibles vuelos de origen a destino");
           System.out.println("6. Salir");
           System.out.print("Opcion:");
           opcion = entrada.nextInt();
           
           switch(opcion){
               case 1: //Ver aeropuertos gestionados(Publicos o Privados)
                   mostrarDatosAeropuertos(aeropuertos);
                   break;
               case 2://Ver empresas o subvencion
                   System.out.println("");
                   mostrarPatrocinio(aeropuertos);
                   break;
               case 3: //Compañias de un aeropuerto
                   entrada.nextLine();
                   System.out.println("Digite el nombre del aeropuerto: ");
                   nombreaeropuerto = entrada.nextLine();
                   
                   aeropuerto = buscarAeropuerto(nombreaeropuerto, aeropuertos);
                   if(aeropuerto ==null){
                       System.out.println("El aeropuerto no existe");
                   }else{
                       mostrarCompañias(aeropuerto);
                   }
                   break;
               case 4: //Lista de vuelos por compañia
                   entrada.nextLine();
                   System.out.print("Digite el nombre del aeropuerto: ");
                   nombreaeropuerto = entrada.nextLine();
                   aeropuerto = buscarAeropuerto(nombreaeropuerto, aeropuertos);
                   if(aeropuerto == null){
                       System.out.println("No existe tal aeropuerto");
                   }else{
                       
                       System.out.print("Digite el nombre de la compañia que usted busca: ");
                       nombreCompañia = entrada.nextLine();
                       compañia = aeropuerto.getCompañia(nombreCompañia);
                       if(compañia == null){
                           System.out.println("No existe tal compañia");
                       }
                       else{
                           mostrarVuelos(compañia);
                       }
                   }
                   
                   break;
               case 5: // Lista de posibles vuelos de Origen s Destino
                   entrada.nextLine();
                   System.out.println("Digite la ciudad origen");
                   origen = entrada.nextLine();
                   System.out.println("Digite la ciudad de destino");
                   destino = entrada.nextLine();
                   mostrarVueloOrigenDestino(origen, destino, aeropuertos);
                   break;
               case 6: break;
               default: System.out.println("Error, se equivoco de opcion");
                   
           }
           
       }while(opcion!=6);
    }
    
    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
        for(int i =0;i<aeropuertos.length;i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
            //instanceof determina si ese aeropuerto en el arreglo PERTENECE A LA CLASE Aprivado
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: "+ aeropuertos[i].getNombre() );
                System.out.println("Ciudad:" + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
                
            
            }else{
                System.out.println("Aeropuerto Publico");
                System.out.println("Nombre: "+ aeropuertos[i].getNombre() );
                System.out.println("Ciudad:" + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
            }
            System.out.println("\n");
        }
        
        
    }
    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]){
        String empresas[];
        for(int i =0;i<aeropuertos.length;i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                empresas = ((AeropuertoPrivado)aeropuertos[i]).getListaempresas();
                System.out.println("Empresas: ");
                for(int j=0;j<empresas.length;j++){
                    System.out.println(empresas[j]);
                }
            }else{
                System.out.println("Aeropuerto Publico: " + aeropuertos[i].getNombre());
                //DOWNCASTING
                System.out.println("Subvencion" + ((AeropuertoPublico)aeropuertos[i]).getSubvencion());
            }
            System.out.println("\n");
            
        }
    }
    
    public static Aeropuerto buscarAeropuerto(String nombre,Aeropuerto aeropuertos[]){
        boolean encontrado = false;
        int i=0;
        Aeropuerto aero = null;
        while((!encontrado) && i<aeropuertos.length){
            if(nombre.equals(aeropuertos[i].getNombre())){
                encontrado = true;
                aero = aeropuertos[i];
            }
            i++;
        }
        return aero;
    }
    public static void mostrarCompañias(Aeropuerto aeropuerto){
        System.out.println("\nLas compañias del aeropuerto: " + aeropuerto.getNombre());
        for(int i=0;i<aeropuerto.getNumCompañia();i++){
            System.out.println(aeropuerto.getCompañia(i).getNombre());
            
        }
    }
    public static void mostrarVuelos(Compañia compañia){
        Vuelo vuelo;
        System.out.println("Los vuelos de: " + compañia.getNombre());
        
        for(int i = 0;i<compañia.getNumVuelo();i++){
            vuelo = compañia.getVuelo(i);
            System.out.println("Identificador: " + vuelo.getIdentificador());
            System.out.println("Ciudad de orginen: " + vuelo.getCiudadOrigen());
            System.out.println("Ciudad de destino: " + vuelo.getCiudadDestino());
            System.out.println("Precio: " + vuelo.getPrecio());
            System.out.println("");
            
            
        }
    }
    public static Vuelo[] buscarVuelosOrigenDestino(String origen,String destino,Aeropuerto aeropuertos[]){
        Vuelo vuelo;
        int contador = 0;
        Vuelo listaVuelos[];
        for(int i=0;i<aeropuertos.length;i++){//Recorrer aeropuertos
            for(int j=0;j<aeropuertos[i].getNumCompañia();j++){//Recorrer compañias
                for(int k=0;k<aeropuertos[i].getCompañia(j).getNumVuelo();k++){//Recorremos los vuelos
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if(origen.equals(vuelo.getCiudadOrigen()) && (destino.equals(vuelo.getCiudadDestino()))){
                        contador++;
                    }
                    
                }
                
            }
        }
        listaVuelos = new Vuelo[contador];
        int q=0;
        
        for(int i = 0;i<aeropuertos.length;i++){
            for(int j=0;j<aeropuertos[i].getNumCompañia();j++){
                for(int k=0;k<aeropuertos[i].getCompañia(j).getNumVuelo();k++){
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if((origen.equals(vuelo.getCiudadOrigen()))&& (destino.equals(vuelo.getCiudadDestino()))){
                        listaVuelos[q] = vuelo;
                        q++;
                    }
                }
            }
        }
        return listaVuelos;
    }
    
    
    public static void mostrarVueloOrigenDestino(String origen,String destino,Aeropuerto aeropuertos[]){
        Vuelo vuelos[];
        vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
        if(vuelos.length==0){
            System.out.println("No existen vuelos de esa ciudad origen a destino");
        }else{
            System.out.println("Vuelos Encontrados: ");
            for(int i = 0 ;i<vuelos.length;i++){
                System.out.println("Identificador: " + vuelos[i].getIdentificador() );
                System.out.println("Ciudad Origen: " + vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad Destino: " + vuelos[i].getCiudadDestino());
                System.out.println("Precio: " + vuelos[i].getPrecio());
                System.out.println("\n");
            
            }   
        }
    }
}
