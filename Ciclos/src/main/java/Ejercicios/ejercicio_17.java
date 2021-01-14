/*
 Una empresa de desinfectantes necesita gestionar las facturas.
En cada factura figura: el codigo del articulo, la cantidad ventida en litros 
y el precio por litro.Se pide de 5 facturas introducidas: Facturación total,cantidad
en litros vendidos del articulo 1 y cuantes facturas se emitieron de mas 
de $600
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_17 {
    public static void main(String[] args){
       int codigo,litros,litrosArticulo=0;
       int conteomas600=0;
       float precio_litro,importe_factura,facturacionTotal=0;
       
       for(int i=1;i<=5;i++){
           codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" + i + "\nDigite el codigo del articulo"));
           litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" + i + "\nDigite la cantidad de litros"));
           precio_litro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N°" + i + "\nDigite el precio"));
           
           importe_factura = (float) litros * precio_litro;//Importe por factura
           facturacionTotal += importe_factura;
       
           if(codigo== 1){
               litrosArticulo +=litros;
           }
           if(importe_factura>600){
               
               conteomas600++;
           }
       }
        System.out.println("REPORTES DE VENTA");
        System.out.println("Facturacion total " + facturacionTotal);
        System.out.println("Cantidad de litros vendidos del articulo:1 " + litrosArticulo);    
        System.out.println("Cantidad de facturas mayores a $600\n" +conteomas600);
    }
    
}
