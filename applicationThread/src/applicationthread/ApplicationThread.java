/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationthread;

/**
 *
 * @author Juan Rivera
 */
public class ApplicationThread {

    public static void main(String[] args) {
         int numeroHilos = 8; // Numero of threads 
        for (int i=0; i<numeroHilos; i++) 
        { 
            //Ejercicio 1
           // ThreadExample object = new ThreadExample(); 
            //Ejercicio 2
            Thread object = new Thread(new RunnableThread());
            object.start(); 
        } 
    }
}
