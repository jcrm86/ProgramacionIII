/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficosbidimensionales;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Juan Camilo
 */
public class GraficosBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1
        /*JFrame frame= new JFrame("Uso de colores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanelColor jPanelColor=new JPanelColor();
        frame.add(jPanelColor);
        frame.setSize(400,180);
        frame.setVisible(true);*/
      //Ejercicio 2
      /*MostrarColores2JFrame aplicacion= new MostrarColores2JFrame();
      aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
      
      //Ejercicio 3
     /* JFrame marco= new JFrame("Uso de tipos de letra");
      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      FontJPanel fontJPanel= new FontJPanel();
      marco.add(fontJPanel);
      marco.setSize(475,170);
      marco.setVisible(true);*/
      
      //Ejercicio 4
     /*JFrame marco= new JFrame("Dibujo de lineas, rectangulos y ovalos");
      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      LineasRectsOvalosJPanel lineasRectsOvalosJPanel=new LineasRectsOvalosJPanel();
      lineasRectsOvalosJPanel.setBackground(Color.WHITE);
      marco.add(lineasRectsOvalosJPanel);
      marco.setSize(475,210);
      marco.setVisible(true);*/
     
     //Ejercicio 5
      /*JFrame marco= new JFrame("Dibujo de lineas, rectangulos y ovalos");
      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ArcosPanel arcosPanel=new ArcosPanel();
      arcosPanel.setBackground(Color.WHITE);
      marco.add(arcosPanel);
      marco.setSize(300,210);
      marco.setVisible(true);*/
     
     //Ejercicio 6
     JFrame marco= new JFrame("Dibujo de poligonos");
      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      PoligonosJPanel poligonosPanel=new PoligonosJPanel();
      poligonosPanel.setBackground(Color.WHITE);
      marco.add(poligonosPanel);
      marco.setSize(300,210);
      marco.setVisible(true);
    }
}
