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
public class ControlPanel extends JPanel {
     private JSlider slider; //declare slider
        private DrawPane myPanel; 
        public ControlPanel() {
            setLayout(new BorderLayout());
            myPanel = new DrawPane();
            myPanel.setBackground(Color.LIGHT_GRAY); //establece el color de fondo

            slider = new JSlider(SwingConstants.VERTICAL, 0, 400, 100);// crea el slider 
            slider.setMajorTickSpacing(20); //configura los espacios a cada 10 pixeles
            slider.setPaintTicks(true); //pinta el slider en la pantalla

            slider.addChangeListener(//crea el listener que estar{a atento a los cambios en el slider
                    new ChangeListener() {
                        @Override
                        public void stateChanged(ChangeEvent e) {
                            myPanel.setScale(slider.getValue()); //Toma el valor del slider, y lo inserta a la escala del panel
                        }
                    }
            );

            JSlider rotate = new JSlider(SwingConstants.VERTICAL, 0, 720, 0);//crea el slider de rotación
            rotate.setMajorTickSpacing(20); //configura los espacios a cada 10 pixeles
            rotate.setPaintTicks(true); //pinta el slider en la pantalla

            rotate.addChangeListener(//crea el listener que estará atento a los cambios en el slider
                    new ChangeListener() {
                        @Override
                        public void stateChanged(ChangeEvent e) {
                            JSlider slider = (JSlider) e.getSource();
                            myPanel.setAngle(slider.getValue()); //cambia el angulo del panel creado
                        }
                    }
            );
            add(slider, BorderLayout.WEST);
            add(rotate, BorderLayout.EAST);

            add(myPanel);

            myPanel.setScale(800);
        }
}
