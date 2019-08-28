/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import java.util.Random;

/**
 *
 * @author Juan Camilo
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pila modeloPila= new Pila();
        /*modeloPila.push(1);
        modeloPila.imprimir();
        modeloPila.push(0);
        modeloPila.imprimir();
        modeloPila.push(1);
        modeloPila.imprimir();
        modeloPila.push(2);
        modeloPila.imprimir();
        
        */
        
        /*Cola modeloCola=new Cola();
        //-1,0,1,2
        modeloCola.enqueue(1);
        modeloCola.imprimir();
        modeloCola.enqueue(0);
        modeloCola.imprimir();
        modeloCola.enqueue(1);
        modeloCola.imprimir();
        modeloCola.enqueue(2);
        modeloCola.imprimir();
        
        try{
            
            Object objetoEliminado=null;
            
            while(true){
                objetoEliminado=modeloCola.dequeue();
                System.out.printf("Se eliminó %s ", objetoEliminado);
                modeloCola.imprimir();
            }
            
        
        }catch(ExcepcionListaVacia e){
            e.printStackTrace();
        }*/
        
        
        Arbol arbol= new Arbol();
        int valor;
        //se debe agregar libreria java.util.random
        Random numeroAleatorio= new Random();
        System.out.printf("Insertar los siguientes valores");
        System.out.println();
        for(int i=0; i< 10; i++){
            valor= numeroAleatorio.nextInt(100);
            System.out.printf(valor+" ");
            arbol.insertarNodo(valor);
        }
        System.out.println();
        System.out.println("Recorrido preorden");
        arbol.recorridoPreorden();
        System.out.println();
        System.out.println("Recorrido inorder");
        arbol.recorridoInorder();
        System.out.println();
        System.out.println("Recorrido postorden");
        arbol.recorridoPostorden();
        System.out.println();
        
        
    }
    
}
