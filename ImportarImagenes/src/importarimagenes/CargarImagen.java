/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importarimagenes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

/**
 *
 * @author Juan Camilo
 */
public class CargarImagen extends JApplet{
    //se crean los atributos
        private Image imagen1;
        private ImageIcon imagen2;
        
        //Se inicializan las variables
        public void init(){
            System.out.println(getDocumentBase());
            imagen1= getImage(getDocumentBase(),"lake-tree.jpg");
            imagen2=new ImageIcon("C:\\Users\\Juan Camilo\\Documents\\NetBeansProjects\\ImportarImagenes\\Imagenes\\Stonehenge.jpg");
        }
        //se genera el grafico que se quiere pintar
        public void paint(Graphics g){
            super.paint(g);
            g.drawImage(imagen1, 0, 0, this);
            g.drawImage(imagen1,0,120,getWidth(),getHeight()-120,this);
            imagen2.paintIcon(this,g,180,0);
        }
        
        
}
