/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficosbidimensionales;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Juan Camilo
 */
public class FontJPanel extends JPanel {
    public void paintComponent(Graphics g){
        //Se establece la fuente de la letra
        //Dentro se define el objeto Font
        g.setFont(new Font("Serif",Font.BOLD,12));
        g.drawString("Serif con tamaño de 12 puntos", 20, 50);
        
        //se cambia el tipo de letra
        g.setFont(new Font("Monospaced", Font.ITALIC,24));
        g.drawString("Tipo de letra Monospaced de 24 puntos italic",20,70);
        
        //se cambia la fuente
        g.setFont(new Font("SansSerif", Font.PLAIN,14));
        g.drawString("SansSerif 14 puntos fuente simple",20,90);
        
        //se realiza un cambio de color en la fuente, y se combina Negrita con Cursiva
        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD+ Font.ITALIC,18));
        g.drawString(g.getFont().getName()+" "+g.getFont().getSize()+" puntos negrita cursiva ",20,110);
    }
}
