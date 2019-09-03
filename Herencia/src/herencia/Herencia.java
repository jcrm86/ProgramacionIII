/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Juan Camilo
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado figuraCuadrado=new Cuadrado();
        figuraCuadrado.nombreFigura="Cuadrado";
        System.out.println("El area total del cuadrado es: "+figuraCuadrado.area(10, 20));
    }
    
}
