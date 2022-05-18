
package hilos;

import java.awt.Color;
import java.awt.Graphics;


public class Panel extends javax.swing.JPanel {
int x,y=0;
int z=0;
    
    public Panel() {
        initComponents();
    }

   public void paintComponent(Graphics g){
     super.paintComponent(g);
     Color color1= new Color(2*z,20,20);
     g.setColor(color1);
     g.fillRect(10+x,10+y,100,100);
     
    // g.fillPolygon(x1[],y1[],4);
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
