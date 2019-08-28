/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosageometrias;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Juan Camilo
 */
public class MouseDragged  extends JPanel{
    private static final int W = 640;
    private static final int H = 480;
    private Point origin = new Point(W / 2, H / 2);
    private Point mousePt;

    public MouseDragged() {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mousePt = e.getPoint();
                repaint();
            }
        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int dx = e.getX() - mousePt.x;
                int dy = e.getY() - mousePt.y;
                origin.setLocation(origin.x + dx, origin.y + dy);
                mousePt = e.getPoint();
                paintRectangle(origin.x + dx, origin.y + dy);
                repaint();
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(W, H);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(0, origin.y, getWidth(), origin.y);
        g.drawLine(origin.x, 0, origin.x, getHeight());
    }
    
    public void paintRectangle(int x, int y){
           Graphics g= getGraphics();
                //g.setColor(Color.BLUE);
                int r=Math.abs(x-40);
                int green=Math.abs(y-40);
                int b=0;
                if(r>250){
                    r=250;
                }
                if(green>250){
                    green=250;
                }
                g.setColor(new Color(r,green,b));
                g.fillRect(x-40,y-40,80,80);
    
    }

}


