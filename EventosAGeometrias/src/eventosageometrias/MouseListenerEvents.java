/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosageometrias;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.event.*;

/**
 *
 * @author Juan Camilo
 */
public class MouseListenerEvents extends Frame implements MouseListener {
    public MouseListenerEvents(){
        //setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        addMouseListener((java.awt.event.MouseListener) this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    };
   
    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Graphics g = getGraphics();
        g.setColor(new Color(250,0,0));
        
        g.drawRect(e.getX(), e.getY(), 40,40);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /*System.out.println(e.getX()+" "+e.getY());
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.drawOval(e.getX(), e.getY(), 20,20);*/
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println(e.getX()+" "+e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       /* Graphics g = getGraphics();
        g.setColor(new Color(Math.abs(e.getX()), Math.abs(e.getY()),0));
        g.drawOval(Math.abs(e.getX()), Math.abs(e.getY()), 40,40);
        System.out.println("Mouse entered: "+e.getX()+" "+e.getY());*/
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         System.out.println("Mouse exited: "+e.getX()+" "+e.getY());
    }
   
  
}
