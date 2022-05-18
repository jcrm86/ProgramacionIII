/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importarimagenes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
    private BufferedImage ImagenOriginal;
    private BufferedImage ImagenBlancoNegro;
    private final int TOTAL_IMAGENES=103;
    private int imagenActual=0;
    private final int RETRASO_ANIMACION=200;//Retraso en milisegundos
    private int ancho;
    private int alto;
    
    private Timer temporizadorAnimacion;
    
    public SecuenciaImagenes() throws IOException{
        //imagenes=new ImageIcon[TOTAL_IMAGENES];
        File folder =new File("C:\\Users\\juanr\\Documents\\Juan\\ProgramacionIII\\ProcesamientoImagenes\\src\\imagenes");
        File[] fileNames=folder.listFiles();
        int i=0;
         long startTime,endTime;
        imagenes=new ImageIcon[fileNames.length];
        BufferedImage img=ImageIO.read(fileNames[0]);
        //List<ImageIcon> imagenes= new ArrayList<>();
        /*for(File file: fileNames){
           imagenes[i]=new ImageIcon(this.getClass().getResource("/imagenes/"+file.getName()));
            i=i+1;
        }*/
        ancho=img.getWidth();
        alto=img.getHeight();
        ImagenOriginal=img;
        ThreadExample nuevoHilo= new ThreadExample();
        ThreadExample nuevoHilo2= new ThreadExample();
        startTime=System.nanoTime();
        //ImagenBlancoNegro=nuevoHilo.run(img, 0,0,alto, ancho/2);
        ImagenBlancoNegro=nuevoHilo.run(img, 0,0,alto, ancho);
              
// ImagenBlancoNegro=nuevoHilo.run(img, 0,0,alto/2, ancho);
        endTime=System.nanoTime();
         System.out.println("El tiempo de ejecución fue: "+((endTime-startTime)/1000000)+"milisegundo(s)");
         
//        nuevoHilo= new ThreadExample();
        nuevoHilo.newThread=new ThreadExample();
        startTime=System.nanoTime();
       ImagenBlancoNegro=nuevoHilo.newThread.run(img, 0,ancho/2,alto, ancho);
        endTime=System.nanoTime();
         System.out.println("El tiempo de ejecución fue: "+((endTime-startTime)/1000000)+"milisegundo(s)");
         
         
        //ancho=imagenes[0].getIconWidth();
        //alto=imagenes[0].getIconHeight();
        
    }
    
    public int calcularPromedio(int rojo, int verde, int azul){
        return (rojo+verde+azul)/3;
    }
    
    
    public BufferedImage procesarImagen(BufferedImage img,int limiteAlto,int limiteBajo){
         for(int anchoImagen=0; anchoImagen < limiteBajo; anchoImagen++){
            for(int altoImagen=0; altoImagen < limiteAlto; altoImagen++){
                    Color c = new Color(img.getRGB(anchoImagen,altoImagen));
                   // System.out.println("Rojo: "+c.getRed()+" Verde: "+c.getGreen()+" Azul: "+c.getBlue());
                    int average=this.calcularPromedio(c.getRed(),c.getGreen(),c.getBlue());
                    Color grayColor=new Color(average,average,average);
                    img.setRGB(anchoImagen, altoImagen, grayColor.getRGB());
            }
        }
         return img;
    }
    
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        //ImageIcon imageResult= new ImageIcon(ImagenOriginal);
        //imageResult.paintIcon(this, g, 0, 0);
        
        ImageIcon imageResult= new ImageIcon(ImagenBlancoNegro);
        imageResult.paintIcon(this, g, 0, 0);
        
        
      /*  imagenes[imagenActual].paintIcon(this,g,0,0);
       if(temporizadorAnimacion.isRunning()){
            imagenActual=(imagenActual+1)% TOTAL_IMAGENES;
        }*/
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
    
    /*public void pintarImagen(Graphics g){
        imagenes[imagenActual].paintIcon(this,g,0,0);
    
    
    }*/
    
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
