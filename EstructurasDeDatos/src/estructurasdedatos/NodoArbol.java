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
public class NodoArbol {
    //Atributos
    public NodoArbol nodoIzq;
    public int datos;
    public NodoArbol nodoDer;
    //Constructor
    public NodoArbol(int datosNodo){
        datos=datosNodo;
        nodoIzq=nodoDer=null;
    }
    //método que inserta los valores en el árbol
    public void insertar(int valorInsertar){
        //Se inserta en el subarbol izquierdo
        if(valorInsertar < datos){
            if(nodoIzq==null){
                nodoIzq=new NodoArbol(valorInsertar);
            }else{
                nodoIzq.insertar(valorInsertar);
            }
        }else if(valorInsertar > datos){
            if(nodoDer==null){
                nodoDer=new NodoArbol(valorInsertar);
            }else{
                nodoDer.insertar(valorInsertar);
            }
        }
    }
}
