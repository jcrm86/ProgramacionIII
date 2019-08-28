/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficosbidimensionales;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Juan Camilo
 */
public class MostrarColores2JFrame extends JFrame{
    private JButton cambiarColorButtom;
    private Color color= Color.LIGHT_GRAY;
    private JPanel coloresJPanel;
    public MostrarColores2JFrame(){
        super("Uso de JColorChooser");
        coloresJPanel=new JPanel();
        coloresJPanel.setBackground(color);
        cambiarColorButtom=new JButton("Cambiar color");
        cambiarColorButtom.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent evento){
                        color=JColorChooser.showDialog(MostrarColores2JFrame.this,"Seleccione un color",color);
                        if(color==null){
                            color=Color.LIGHT_GRAY;
                        }
                        coloresJPanel.setBackground(color);
                    }
                }
        );
        add(coloresJPanel,BorderLayout.CENTER);
        add(cambiarColorButtom,BorderLayout.SOUTH);
        //tamaño del panel
        setSize(400,130);
        setVisible(true);
    }  
}
