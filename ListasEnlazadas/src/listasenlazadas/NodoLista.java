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
public class NodoLista {
    public Object datos;
    public NodoLista siguienteNodo;
    
    //Constructor con un solo parámetro de entrada
    public NodoLista(Object objeto){
        datos=objeto;
        siguienteNodo=null;
    }
    //Constructor con dos parámetros de entrada
    public NodoLista(Object objeto, NodoLista nodo){
        datos=objeto;
        siguienteNodo=nodo;
    }
    //Métodos get
    public Object obtenerObject(){
        return datos;
    }
    //Métodos get
    public NodoLista obtenerSiguienteNodo(){
        return siguienteNodo;
    }
}
