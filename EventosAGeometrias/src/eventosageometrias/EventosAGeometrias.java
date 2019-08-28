/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosageometrias;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import static javax.swing.text.html.HTML.Attribute.TITLE;


/**
 *
 * @author Juan Camilo
 */
public class EventosAGeometrias extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        //Ejercicio 1
        //new MouseListenerEvents();
        
        //Ejercicio 2
        /*EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame f = new JFrame("Prueba drag cursor");
                f.add(new MouseDragged());
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
        });*/
        
        //Ejercicio 3
         new Movimientos();
      
        
    }
    
}
