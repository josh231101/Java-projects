/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 *
 * @author Miguel
 */
public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;
    private JButton boton2;
    
    public Ventana(){
        setBounds(50, 50, 500, 500);
        
        setTitle("Eventos");
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarCajaDeTexto();
        colocarBoton();
        colocarBoton2();
        colocarCajaArea();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        
        //eventoDeMovimientoDeRaton();
        eventoRuedaRaton();
    }

    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setText("Ingrese su nombre");
        etiqueta.setFont(new Font("cooper black",Font.ITALIC ,16));
        panel.add(etiqueta);
    }

    private void colocarCajaDeTexto() {
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 50, 300, 30);
        panel.add(cajaTexto);
    }

    private void colocarBoton() {
        boton = new JButton("Agregar");
        boton.setBounds(150, 100, 150, 40);
        panel.add(boton);
        
        
        saludo = new JLabel();
        saludo.setBounds(20, 150, 300, 40);
        saludo.setFont(new Font("Arial Black", Font.PLAIN, 18));
        panel.add(saludo);
        
        eventooyenteDeAccion();
        
        
    }
    public void eventooyenteDeAccion(){
        //Agregando Evento de Tipo Listener
        ActionListener oyeneteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Le damos al saludo un texto que viene del TextBox
                saludo.setText("Hola " + cajaTexto.getText());
                
            }
        };
        
        boton.addActionListener(oyeneteDeAccion);
        
    }
   
    private void colocarCajaArea()
   {
        areaTexto = new JTextArea();
        areaTexto.setBounds(20, 200, 180, 220);
        panel.add(areaTexto);
        
        JScrollPane scroll= new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 200, 180, 220);
        panel.add(scroll);
    } 
   
    private void colocarBoton2() {
        boton2 = new JButton("Boton 2");
        boton2.setBounds(200, 200, 100, 40);
        panel.add(boton2);
        
        eventoOyenteDeRaton();
    }
    
    
    
    
    public void eventoOyenteDeRaton(){
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.isAltDown()){
                    areaTexto.append("Alt\n");
                }
                else if(e.isControlDown()){
                    areaTexto.append("Ctrl\n");
                }
                else if(e.isShiftDown()){
                    areaTexto.append("Shift\n");
                }
                else if(e.getClickCount() == 2){
                    areaTexto.append("Double clicked\n");
                }else{
                   areaTexto.append("Mouse Clicked\n"); 
                }  
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //areaTexto.append("Mouse Pressed\n");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //areaTexto.append("Mouse Released\n");

            }

            @Override
            public void mouseEntered(MouseEvent e) {
               // areaTexto.append("Mouse Entered\n");

            }

            @Override
            public void mouseExited(MouseEvent e) {
               // areaTexto.append("Mouse Exited\n");

            }
        };
        
        boton2.addMouseListener(oyenteDeRaton);
    }

    private void eventoDeMovimientoDeRaton() {
        MouseMotionListener oyenteMov = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                areaTexto.append("Dragged\n");
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                areaTexto.append("Moved\n");
            }
        };
        
        panel.addMouseMotionListener(oyenteMov);
    }
    
    private void eventoRuedaRaton(){
        MouseWheelListener movRueda = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(e.getPreciseWheelRotation() == -1)//Se mueve hacia arriab
                {
                   areaTexto.append("Moviendo Rueda Arriba\n");
                }
                else if(e.getPreciseWheelRotation() == 1){//Se mueve hacia abajo
                    areaTexto.append("Moviendo Rueda Abajo\n");
                }
                
            }
        };
        
        panel.addMouseWheelListener(movRueda);
        
    }

    
    
    
    
}