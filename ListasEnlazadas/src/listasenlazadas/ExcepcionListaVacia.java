/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author Juan Camilo
 */
public class ExcepcionListaVacia extends RuntimeException{
    public ExcepcionListaVacia(){
        this("Lista");
    }
    
    public ExcepcionListaVacia(String nombreLista){
        super(nombreLista+ "está vacia");
    
    }
}
