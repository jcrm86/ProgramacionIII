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
public class Pila extends Lista{
    
    
    //se crea el constructor pila
    public Pila (){
        super("pila");
    }
    
    //método que agrega parametro a la pila
    public void push(Object objeto){
        insertarAlFrente(objeto);
    }
    
    //método que elimina el primer parametro de la pila
    public Object pop() throws ExcepcionListaVacia
    {
        return eliminarDelFrente();
            
    }
    
}
