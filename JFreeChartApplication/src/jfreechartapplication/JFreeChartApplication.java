/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfreechartapplication;

/**
 *
 * @author Juan Camilo
 */
public class JFreeChartApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //cambio ejecutado hace 5 minutos
                
                
                new FirstExercise().setVisible(true);
            }
        });
    }
    
}
