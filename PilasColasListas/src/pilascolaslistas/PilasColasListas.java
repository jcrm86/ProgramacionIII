/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilascolaslistas;
import java.util.Stack;//Libreria que representa las pilas
import java.util.LinkedList;//LIbreria que contiene las deficiones de colas.

/**
 *
 * @author Juan Camilo
 */
public class PilasColasListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea una pila nueva
        /*Stack nuevaPila= new Stack();
        nuevaPila.push("Juan Camilo");
        nuevaPila.push(120);
        System.out.println("Lectura método empty: "+nuevaPila.empty());
        System.out.println("Lectura método peek: "+nuevaPila.peek());
        nuevaPila.pop();
        System.out.println("Lectura método peek al retirar el termino de la punta: "+nuevaPila.peek());
        */
        //creación de una cola
        LinkedList nuevaCola= new LinkedList();
       // nuevaCola.offer("Rivera Medina");
        for(int i=0; i < 5;i++){
            nuevaCola.offer(i);
            System.out.println("Lectura método element: "+nuevaCola.element()+" elemento introducido "+i);
        }
        for(int i=0; i < 5;i++){
            System.out.println("Lectura método poll: "+nuevaCola.poll());
        }
        
        
    }
    
}
