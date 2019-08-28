/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficosbidimensionales;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

/**
 *
 * @author Juan Camilo
 */
public class JPanelColor extends JPanel {
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //define el color del background
        this.setBackground(Color.WHITE);
        //establece el color de la figura
        g.setColor(new Color(254,0,0));
        //crea un grafico de un rectangulo y da las medidas de cada dimensión
        g.fillRect(15, 25, 100, 20);
        //imprime una linea de texto al lado del rectangulo
        g.drawString("RGB actual: "+g.getColor(), 130, 40);
        //se establece el nuevo color del dibujo usando punto flotante
        g.setColor(new Color(0.5f,0.75f,0.0f));
         //crea un grafico de un rectangulo y da las medidas de cada dimensión
        g.fillRect(15, 50, 100, 20);
        //imprime una linea de texto al lado del rectangulo
        g.drawString("RGB actual: "+g.getColor(), 130, 65);
        //se establece el nuevo color del dibujo
        g.setColor(Color.BLUE);
         //crea un grafico de un rectangulo y da las medidas de cada dimensión
        g.fillRect(15, 75, 100, 20);
        //imprime una linea de texto al lado del rectangulo
        g.drawString("RGB actual: "+g.getColor(), 130, 90);
        //muestra los valores de RGB individuales
        Color color= Color.MAGENTA;
        g.setColor(color);
        //crea un grafico de un rectangulo y da las medidas de cada dimensión
        g.fillRect(15, 100, 100, 20);
        //imprime una linea de texto al lado del rectangulo
        g.drawString("Valores RGB: "+color.getRed()+" , "+color.getGreen()+", "+color.getBlue(), 130, 115);
    }
}
