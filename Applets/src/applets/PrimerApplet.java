/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author Juan Camilo
 */
public class PrimerApplet extends JApplet{
        public void paint(Graphics g){
            super.paint(g);
            g.drawString("Bienvenido a la aplicación ",25,25);
        }
}
