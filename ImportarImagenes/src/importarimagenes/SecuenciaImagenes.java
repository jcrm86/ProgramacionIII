/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importarimagenes;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Juan Camilo
 */
public class SecuenciaImagenes extends JPanel{
    
    public final static String NOMBRE_IMAGEN="toystory";
    protected ImageIcon imagenes[];
    private final int TOTAL_IMAGENES=103;
    private int imagenActual=0;
    private final int RETRASO_ANIMACION=300;//Retraso en milisegundos
    private int ancho;
    private int alto;
    
    private Timer temporizadorAnimacion;
    
    public SecuenciaImagenes(){
        //imagenes=new ImageIcon[TOTAL_IMAGENES];
        File folder =new File("C:\\Users\\juanr\\Documents\\Juan\\ProgramacionIII\\ImportarImagenes\\src\\imagenes");
        File[] fileNames=folder.listFiles();
        int i=0;
        imagenes=new ImageIcon[fileNames.length];
        //List<ImageIcon> imagenes= new ArrayList<>();
        for(File file: fileNames){
           imagenes[i]=new ImageIcon(this.getClass().getResource("/imagenes/"+file.getName()));
            i=i+1;
        }
        ancho=imagenes[0].getIconWidth();
        alto=imagenes[0].getIconHeight();
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        imagenes[imagenActual].paintIcon(this,g,0,0);
        if(temporizadorAnimacion.isRunning()){
            imagenActual=(imagenActual+1)% TOTAL_IMAGENES;
        }
    }
    
    public void iniciarAnimacion(){
        if(temporizadorAnimacion==null){
            imagenActual=0;
            temporizadorAnimacion=new Timer(RETRASO_ANIMACION,new ManejadorTimer());
            temporizadorAnimacion.start();
        }else{
            if(!temporizadorAnimacion.isRunning()){
                temporizadorAnimacion.restart();
            }
        }
    }
    
    public void detenerAnimacion(){
        temporizadorAnimacion.stop();
    }
    
    public Dimension getMinimumSize(){
        return getPreferredSize();
    }
    
    public Dimension getPreferredSize(){
        return new Dimension(ancho,alto);
    }
    
    private class ManejadorTimer implements ActionListener{
         @Override
        public void actionPerformed(ActionEvent actionEvent){
            repaint();
        
        }


    }
}
