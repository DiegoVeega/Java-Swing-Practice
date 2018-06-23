package Main;

import GUI.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author diego
 */
public class main {
    public static void main(String[] args){
        JFrame ventana =new JFrame("TU NOMBRE");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
    }
}
