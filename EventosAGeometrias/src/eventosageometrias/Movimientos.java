/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosageometrias;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Juan Camilo
 */
public class Movimientos {
    
    public Movimientos() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ex) {
                }

                JFrame frame = new JFrame("Movimientos sliders");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new ControlPanel());
                frame.pack();
                frame.setSize(800,800);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
    
}
