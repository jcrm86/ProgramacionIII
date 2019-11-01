package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploHilos extends javax.swing.JFrame implements Runnable {
    //definción de atributos
    int c1=0;
    int c2=0;
    int c3=0;
    Thread hilo1;
    Thread hilo2;
    Thread hilo3;
    //constructor
    public EjemploHilos() {
        initComponents();
    }
    public void corredor1(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
       c1++;
    } 
    public void corredor2(){
        c2++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
   public void corredor3(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        c3++;
   } 
public void run(){
    
    Thread ct= Thread.currentThread();
   
    while(ct==hilo1 && c1<300){
       corredor1();
       panel1.x=c1;
       panel1.repaint();
       System.out.println("Corredor 1 "+ c1);
    } 
    while(ct==hilo2 && c2<300){
        corredor2();
        panel1.y=c2;
        panel1.repaint();
        System.out.println("Corredor 2 "+ c2);
    } 
    while(ct==hilo3 && c3<124){
        corredor3();
        panel1.z=c3;
        panel1.repaint();
        System.out.println("Corredor 3 "+ c3);
    } 
}  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        panel1 = new hilos.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setText("Acción");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       if(jToggleButton1.isSelected()){
            hilo1=new Thread(this);
            hilo2=new Thread(this);
            hilo3=new Thread(this);
            hilo1.start();
            hilo2.start();
            hilo3.start();   
       }
       else{
         hilo1.stop();
         hilo2.stop();
         hilo3.stop();
       }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EjemploHilos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjemploHilos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjemploHilos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjemploHilos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjemploHilos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jToggleButton1;
    private hilos.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
