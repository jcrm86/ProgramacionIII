/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

/**
 *
 * @author Juan Camilo
 */
public class Cola {
    //se define un atributo de tipo Lista
    private Lista listaCola;
    
    //se define el constructor
    public Cola(){
        listaCola= new Lista("Cola");
    }
    
    //se crea el método para agregar a la cola un elemento al final
    public void enqueue(Object objeto){
        listaCola.insertarAlFinal(objeto);
    }
    
    //se crea método para eliminar del frente
    public Object dequeue(){
        return listaCola.eliminarDelFrente();
    }
    
    public boolean estaVacia(){
       return listaCola.estaVacia();
    }
    
    public void imprimir(){
        listaCola.imprimir();
    }
    
    
    
}
