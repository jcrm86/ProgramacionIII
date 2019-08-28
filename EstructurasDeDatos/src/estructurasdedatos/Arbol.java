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
public class Arbol {
    private NodoArbol raiz;
    //constructor
    public Arbol(){
        raiz=null;
    }
     //metodo que inserta un nuevo nodo
    public void insertarNodo(int valorInsertar){
        if(raiz==null){
            raiz=new NodoArbol(valorInsertar);
        }else{
            raiz.insertar(valorInsertar);
        }
    }
    //metodo que imprime los valores de los nodos
    public void recorridoPreorden(){
        ayudantePreorden(raiz);
    }
    //metodo que imprime los valores de los nodos
    private void ayudantePreorden(NodoArbol nodo){
        if(nodo==null){
            return;
        }
        System.out.printf("%d ", nodo.datos);
        ayudantePreorden(nodo.nodoIzq);
        ayudantePreorden(nodo.nodoDer);
    }
    //metodo publico para imprimir los valores de los nodos del arbol
    public void recorridoInorder(){
        ayudanteInorder(raiz);
    }
    //meotodo que imprime los valores del {arbol in order
    private void ayudanteInorder(NodoArbol nodo){
        if(nodo==null){ return;}
        ayudanteInorder(nodo.nodoIzq);
        System.out.printf("%d ", nodo.datos);
        ayudanteInorder(nodo.nodoDer);
    }
    
    //metodo publico que imprime los valores de los nodos
    public void recorridoPostorden(){
        ayudantePostorden(raiz);
    }
    //metodo privado que imprime los datos de los nodos
    private void ayudantePostorden(NodoArbol nodo){
        if(nodo==null){return;}
       ayudantePreorden(nodo.nodoIzq);
        ayudantePreorden(nodo.nodoDer);
        System.out.printf("%d ", nodo.datos);
    
    }
    
}
