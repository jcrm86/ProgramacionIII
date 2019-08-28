
import java.awt.Graphics;
import javax.swing.JApplet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Camilo
 */
public class Welcome extends JApplet{
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Primer label desplegado en un applet",25,25);
        
    
    }
}
