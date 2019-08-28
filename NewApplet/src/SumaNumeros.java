
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Camilo
 */
public class SumaNumeros extends JApplet {
    private Double suma;
    public void init(){
        String primerNumero;
        String segundoNumero;
        double numero1;
        double numero2;
        primerNumero=JOptionPane.showInputDialog("Escriba el primer número ");
        segundoNumero=JOptionPane.showInputDialog("Escriba el segundo número ");
        numero1=Double.parseDouble(primerNumero);
        numero2=Double.parseDouble(segundoNumero);
        suma=numero1+numero2;
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(15,10,270,20);
        g.drawString("El total de la suma es: "+suma,25,25);
    }
    
}
