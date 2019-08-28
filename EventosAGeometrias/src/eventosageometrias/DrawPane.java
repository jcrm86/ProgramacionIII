/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosageometrias;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 *
 * @author Juan Camilo
 */
public class DrawPane extends JPanel{
        private double scale = 1;
        private double angle = 0;
        private final int rectWidth = 20;
        private final int rectHeight = 20;
        @Override
        protected void paintComponent(Graphics g)//paints obj on the screen
        {
            super.paintComponent(g); //prepares graphic object for drawing
            int originX = getWidth() / 2; 
            int originY = getHeight() / 2;
            int xOffset = -(rectWidth / 2);
            int yOffset = -(rectHeight / 2);
            g.setColor(Color.WHITE);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.translate(originX, originY);
            g2d.scale(scale, scale);
            System.out.println("Escala: "+scale);
            g2d.rotate(Math.toRadians(angle), 0, 0);
            System.out.println("Angulo en radianes: "+Math.toRadians(angle));
            g2d.fill(new Rectangle2D.Double(xOffset, yOffset, rectWidth, rectHeight));
            g2d.dispose();
            //g.setColor(Color.RED);
            //g.drawRect(originX + xOffset, originY + yOffset, rectWidth, rectWidth);
        }

        public void setAngle(double angle) {
            this.angle = angle;
            repaint();
        }

        public void setScale(int scale) {
            // Scaling is normalized so that 1 = 100%
            this.scale = (scale / 100d);
            repaint();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }
    }


