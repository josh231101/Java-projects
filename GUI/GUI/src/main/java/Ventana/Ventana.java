/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel
 */
public class Ventana extends JFrame{
    public JPanel panel;
    
    public Ventana(){
        //Se crea una ventanita
        
        setSize(500, 500);   //Establecemos el tamaño
        setTitle("Hola mundo");    //Titulo de arriba
        setDefaultCloseOperation(EXIT_ON_CLOSE);   //Termina el programa al cerrarse
        //setLocation(100, 200);    //Coordenada 100=x & y=200, así iniciamos la ventana en otro lado
        
        setLocationRelativeTo(null);   //Establecemos la pantalla en el centro
        
        
        setResizable(true);//No cambiar el tamaño de la ventana
        setMinimumSize(new Dimension(200, 200));//Establecer la dimension minima de la ventana
        
        //setBounds(100, 200, 500, 500); //Combina setSize y setLocation
    
        //this.getContentPane().setBackground(Color.MAGENTA); //Establecer un color de fondo
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPaneles();
       
        //colocarRadiosBotones();
        //colocarBotones();
        //colocarEtiquetas();
        //colocarBotonesDeActivacion();
        //colocarCajasdeTexto();
        //colocarAreasDeTexto();
        //colocarCasillasDeVerificacion();
        //colocarListasDespegables();
        //colocarCampodeContraselña();
        //colocarTablas();
        colocarListas();
       
    }
    private void colocarPaneles(){
         //.:PANEL:.
        panel = new JPanel();//Creacion de un panel
        panel.setLayout(null);//Desactivamos el Diseño
        panel.setBackground(Color.LIGHT_GRAY);//Ponerle color al panel
        
        
        //Agregamos el panel a la ventana
        this.getContentPane().add(panel);
        
    }
    private void colocarEtiquetas(){
        //.:ETIQUETA TIPO TEXTO:.
        JLabel etiqueta = new JLabel();//Creamos una etiqueta
        etiqueta.setOpaque(true);//Establecemos pintar el fondo de la etiqueta
        etiqueta.setText("PAISAJE MONTAÑA");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Align of text
        etiqueta.setBounds(100, 50, 300, 50);
        etiqueta.setForeground(Color.white);//Color a la letra
        etiqueta.setBackground(Color.red);//Cambiamos color fondo de la etiqueta
        etiqueta.setFont(new Font("chiller", Font.PLAIN, 20));//Ponemos estilo de letra
        panel.add(etiqueta);//Agregamos la etiqueta al panel
                

        //.:ETIQUETA TIPO IMAGEN
       ImageIcon imagen = new ImageIcon("montaña.jpg");//Creamo una imagen
       JLabel etiqueta2 = new JLabel();//Hacemos otra etiqueta
       etiqueta2.setBounds(30, 90, 450, 282);
       etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH)));//Ponemos a la etiqueta un imagen y decimos cual
       panel.add(etiqueta2);
    }
    private void colocarBotones(){
        //.:BOTON 1 DE TEXTO:.
        JButton boton1 = new JButton();
        boton1.setText("Click");//Establecer texto
        boton1.setBounds(100, 50, 130, 50);//Ponerlo x,y y size
        boton1.setEnabled(true);//No clickeable o si
        boton1.setMnemonic('z');//Alt+z
        boton1.setForeground(Color.blue);//Color a la letra
        boton1.setFont(new Font("cooper black", Font.PLAIN, 20));//Fuente a la letra
        panel.add(boton1);//Lo ponemos al panel
       
       
        //.:BOTON 2 DE IMAGEN:.
        JButton boton2 = new JButton();
        boton2.setBounds(100, 150, 130, 50);
        ImageIcon clickaqui = new ImageIcon("boton.png");
        boton2.setIcon(new ImageIcon(clickaqui.getImage().getScaledInstance(150, 140, Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.cyan);
        panel.add(boton2);
        
        
        //.:BOTON 3 - BOTON DE BORDE:.
        JButton boton3 = new JButton();
        boton3.setBounds(100,250, 130, 50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.red,2, true));
        panel.add(boton3);
    
    }
    private void colocarRadiosBotones() {
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);
        radioBoton1.setBounds(50, 100, 100, 50);
        radioBoton1.setBackground(Color.LIGHT_GRAY);
        radioBoton1.setEnabled(true);
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
        radioBoton2.setBounds(50, 150, 100, 50);
        radioBoton2.setBackground(Color.LIGHT_GRAY);
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
        radioBoton3.setBounds(50, 200, 100, 50);
        radioBoton3.setBackground(Color.LIGHT_GRAY);
        panel.add(radioBoton3);
        
        //GRUPO DE BOTONES
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);

    }
    private void colocarBotonesDeActivacion() {
        JToggleButton boton = new JToggleButton("Opcion 1", true);
        boton.setBounds(50, 100, 100, 50);
        panel.add(boton);
        
        JToggleButton boton2 = new JToggleButton("Opcion 2", false);
        boton2.setBounds(50, 155, 100, 50);
        panel.add(boton2);
        
        JToggleButton boton3 = new JToggleButton("Opcion 3", false);
        boton3.setBounds(50, 210, 100, 50);
        panel.add(boton3);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(boton);
        grupoRadioBotones.add(boton2);
        grupoRadioBotones.add(boton3);
        
        
    }
    private void colocarCajasdeTexto() {
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 50, 100, 30);
        cajaTexto.setText("HOLA");
        System.out.println("Texto en la caja: " + cajaTexto.getText());
        panel.add(cajaTexto);
    }
    private void colocarAreasDeTexto() {
        TextArea areaTexto = new TextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Escriba el texto aqui...");
        areaTexto.append("\nEscribe texto aqui..");//Añade mas texto
        areaTexto.setEditable(true);//Editar area de texto
        System.out.println("El texto es: " + areaTexto.getText());
        panel.add(areaTexto);
        
        //Barra de desplazamiento
        //JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //barrasDesplazamiento.setBounds(20, 20, 300, 200);
        //panel.add(barrasDesplazamiento);
    }
    private void colocarCasillasDeVerificacion() {
        JCheckBox casillaVerificacion1 = new JCheckBox("Leche",true);
        casillaVerificacion1.setBounds(20, 20, 100, 40);
        casillaVerificacion1.setEnabled(true);
        panel.add(casillaVerificacion1);
        
        JCheckBox casillaVerificacion2 = new JCheckBox("Galletas");
        casillaVerificacion2.setBounds(20, 50, 100, 40);
        panel.add(casillaVerificacion2);
        
        JCheckBox casillaVerificacion3 = new JCheckBox("Yogurth");
        casillaVerificacion3.setBounds(20, 80, 100, 40);
        panel.add(casillaVerificacion3);
        
        JCheckBox casillaVerificacion4 = new JCheckBox("Cereal");
        casillaVerificacion4.setBounds(20, 110, 100, 40);
        panel.add(casillaVerificacion4);
    }
    private void colocarListasDespegables() {
       //.:COMBO BOX DE STRING:.
        /* String[] paises = {"Peru","Colombia","Paraguay","Ecuador"};
        
        JComboBox  listaDesplegable1= new JComboBox(paises);
        listaDesplegable1.setBounds(20, 20, 100, 30);
        listaDesplegable1.addItem("Argentina");
        listaDesplegable1.setSelectedIndex(3);//Del array decirle cual dejar al inicio
        //listaDesplegable1.setSelectedItem("Colombia");
        panel.add(listaDesplegable1);*/
       
       //.:COMBO BOX DE CLASES USANDO MODELOS:.
       Persona persona1 = new Persona("Alejandro", 21, "peruano");
       Persona persona2 = new Persona("Josue", 19, "peruano");
       Persona persona3 = new Persona("Carolina", 31, "peruano");
        
       
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listaDesplegable = new JComboBox(modelo);
        
        modelo.addElement(persona1);
        modelo.addElement(persona2);
        modelo.addElement(persona3);
       
        listaDesplegable.setBounds(20, 20, 100, 30);
        panel.add(listaDesplegable);
    }
    private void colocarCampodeContraselña() {
        
        JPasswordField campoContraseña = new JPasswordField();
        //campoContraseña.setBackground(Color.red);
        campoContraseña.setBounds(20, 20, 100, 40);
        campoContraseña.setText("ABC123");
        panel.add(campoContraseña);
        //OBTENER CONTRASEÑA!
        String contraseña = "";
        for(int i = 0;i<campoContraseña.getPassword().length;i++){
            contraseña += campoContraseña.getPassword()[i];
        }
        System.out.println("Contraseña: " + contraseña);
        
        
        //Obtener lo que hay de la contraseña
        
    }
    private void colocarTablas(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
        
        String[] personas = {"Josue","25","Mexicana"};
        String[] personas2 = {"Carolian","24","Mexicana"};
        String[] personas3 = {"Andres","23","Peruano"};
        String[] personas4 = {"Marco","25","Mexicana"};
        String[] personas5 = {"Luis","30","Mexicana"};
        String[] personas6 = {"Brandon","21","Mexicana"};
        String[] personas7 = {"Lucy","56","Mexicana"};
        String[] personas8 = {"Miguel","52","Mexicana"};
        String[] personas9 = {"Martha","12","Mexicana"};
        String[] personas10 = {"Noel","43","Mexicana"};
        String[] personas11 = {"Adrian","12","Chilena"};
        String[] personas12 = {"Astrit","11","Alemana"};
        
        modelo.addRow(personas);
        modelo.addRow(personas2);
        modelo.addRow(personas3);
        modelo.addRow(personas4);
        modelo.addRow(personas5);
        modelo.addRow(personas6);
        modelo.addRow(personas7);
        modelo.addRow(personas8);
        modelo.addRow(personas9);
        modelo.addRow(personas10);
        modelo.addRow(personas11);
        modelo.addRow(personas12);
        
        
        
        JTable tabla = new JTable(modelo);
        tabla.setBounds(20, 20, 300, 200);
        panel.add(tabla);
        
        JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
    }
    
    private void colocarListas() {
        DefaultListModel modelo = new DefaultListModel();
        
        modelo.addElement(new Persona("Josue Arreola",18,"Mexicano"));
        modelo.addElement(new Persona("Alejandro",24,"Peruano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        modelo.addElement(new Persona("Miguel",54,"Americano"));
        

        
        JList lista = new JList(modelo);
        lista.setBounds(20, 20, 200, 300);
        panel.add(lista);
        
        JScrollPane scroll = new JScrollPane(lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 200, 300);
        panel.add(scroll);
    }
    
    
    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        
        v1.setVisible(true);//Hacemos visible la venta
    }

    

    

    

    

    

    

    

    
    
}
