
package ClasesyObjetos;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args){
        
        int num1,num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("DIGIT A NUMBER"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("DIGIT A NUMBER"));
        
        
        Operacion op = new Operacion();
        
        /*Usamos los métodos y es necesario pasarle argumentos al método para 
        que trabaje con esos datos*/
        
        op.sumar(num1, num2);
        op.restar(num1, num2);
        op.multiplicar(num1, num2);
        op.dividir(num1, num2);
        
        //mETODO IMPRIMIR
        op.mostrar();
        
        
    }
    
}
