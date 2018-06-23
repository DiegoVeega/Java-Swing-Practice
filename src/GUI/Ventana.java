package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author diego
 */
public class Ventana extends JPanel{
    public int ANCHO=500, anchoTF=100, anchoB=300;
    public int ALTO=400, altoTF=30, altoB=30;
    public int ancho=300, alto=30;
    //espacios ingreso
    public JTextField text1, text2, text3,text4, text5;//Ingresar nombre, segundo nombre, apellido, segundo apellido
    //public JTextField text5;//impresion completa
    //botones
    public JButton boton;
    
    public Ventana(){
        text1=new JTextField();
        text1.setBounds(new Rectangle(150,30,anchoTF, altoTF));
        
        text2=new JTextField();
        text2.setBounds(new Rectangle(150,90,anchoTF, altoTF));
        
        text3=new JTextField();
        text3.setBounds(new Rectangle(150,150,anchoTF, altoTF));
        
        text4=new JTextField();
        text4.setBounds(new Rectangle(150,210,anchoTF, altoTF));
        
        text5=new JTextField("NOMBRE COMPLETO.");
        text5.setBounds(new Rectangle(105,300,ancho, alto));
        
        boton=new JButton("ESCRIBIR NOMBRE COMPLETO.");
        boton.setBounds(new Rectangle(105,270, anchoB,altoB));
        
        text1.setEditable(true);
        text2.setEditable(true);
        text3.setEditable(true);
        text4.setEditable(true);
        text5.setEditable(false);
        
        JLabel label= new JLabel();
        label.setText("Nombre: ");
        label.setBounds(20, 30, ancho, alto);
        
        JLabel label1= new JLabel();
        label1.setText("Segundo nombre: ");
        label1.setBounds(20, 90, ancho, alto);
        
        JLabel label2= new JLabel();
        label2.setText("Apellido: ");
        label2.setBounds(20, 150, ancho, alto);
        
        JLabel label3= new JLabel();
        label3.setText("Segundo apellido: ");
        label3.setBounds(20, 210, ancho, alto);
        
        //AGREGAR FUNCION AL BOTON
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                text5.setText(text1.getText()+" "+text2.getText()+" "+text3.getText()+" "+text4.getText());
            }
        });
        add(label);
        add(label1);
        add(label2);
        add(label3);
        
        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(text5);
        add(boton);
        setLayout(null);
        setPreferredSize(new Dimension(ANCHO, ALTO));
    }
}