/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importarimagenes;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

/**
 *
 * @author Juan Camilo
 */
public class MapaImagenes extends JApplet {
    private ImageIcon imagenMapa;
    
    private static final String leyendas[]={"Clasico error de programacion",
        "Buena practica de programacion","observaciones de apariencia visual",
        "Tip de rendimiento","Tip de probabilidad","Observacion de ingenieria de software",
        "Tip para prevenir errores"};
    
    public void init(){
        addMouseListener(
                new MouseAdapter(){
                    public void mouseExited(MouseEvent e){
                        showStatus("Cursor fuera del applet");
                    }
                }
        );
        addMouseMotionListener(
                new MouseMotionAdapter(){
                    public void mouseMoved(MouseEvent e){
                             showStatus(traducirPosicion(e.getX(),e.getY()));
                    }
                }
        );
        
        imagenMapa=new ImageIcon(this.getClass().getResource("/imagenes/toystory00261.png"));
    }
    
    public void paint(Graphics g){
        super.paint(g);
       imagenMapa.paintIcon(this,g,0, 0);
    }
    
    public String traducirPosicion(int x, int y){
        if(x>=imagenMapa.getIconWidth() || y>= imagenMapa.getIconHeight()){
            return "";
        }
        double anchoIcono=(double) imagenMapa.getIconWidth()/7.0;
        int numeroIcono=(int)((double)x/anchoIcono);
        return leyendas[numeroIcono];
    }
    
}
