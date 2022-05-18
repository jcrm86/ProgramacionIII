/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package importarimagenes;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.lang.Thread;

/**
 *
 * @author Juan Rivera
 */
public class ThreadExample extends Thread {
    
    public ThreadExample newThread;
    //sobreescribir el método run
    public BufferedImage run(BufferedImage img,int inicioAlto, int inicioBajo, int limiteAlto,int limiteBajo) 
    { 
        try
        { 
            // Displaying the thread that is running 
            /*System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running");*/ 
            for(int anchoImagen=inicioBajo; anchoImagen < limiteBajo; anchoImagen++){
                for(int altoImagen=inicioAlto; altoImagen < limiteAlto; altoImagen++){
                        Color c = new Color(img.getRGB(anchoImagen,altoImagen));
                        //System.out.println("Rojo: "+c.getRed()+" Verde: "+c.getGreen()+" Azul: "+c.getBlue());
                        int average=this.calcularPromedio(c.getRed(),c.getGreen(),c.getBlue());
                        Color grayColor=new Color(average,average,average);
                       //Color grayColor=new Color(c.getRed(),0,0);
                        img.setRGB(anchoImagen, altoImagen, grayColor.getRGB());
                }
            }
          } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
        return img;
    }
    public int calcularPromedio(int rojo, int verde, int azul){
        return (rojo+verde+azul)/3;
    }
}
