/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importarimagenes;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Juan Camilo
 */
public class SecuenciaImagenesMain {
    
    public static void main(String args[]) throws IOException{
        SecuenciaImagenes animacion=new SecuenciaImagenes();
        
        JFrame window=new JFrame("Animación Toy Story");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(animacion);
        window.pack();
        window.setVisible(true);
        animacion.iniciarAnimacion();
    }
    
    
}
