/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Juan Camilo
 */
public class Parcial1 {
        public static void main(String[] args) {
            String nombreFigura="nombre de la figura";
            int altura=10.5;
            int lados=3;
            double base=13.4;
            int area=0;
           //Se verifica si la figura es un triangulo
            if(lados ==3){
                System.out.println("Es un triangulo.");
            }else{
                System.out.println("La cantidad de lados de la figura es diferente de 3.");
            }
           area=base*altura/2;
           return  area;
        
    }
}
