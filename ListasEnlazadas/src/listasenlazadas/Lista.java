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
public class Lista {
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;
    private String nombre;
    
    //constructor sin argumentos, crea una lista vacia con el nombre de Lista
    public Lista(){
      nombre="Lista";
    }
    
    //constructor de 1 argumento, crea una lista vacia con el nombre de la lista
    public Lista(String nombreLista){
        nombre=nombreLista;
        primerNodo=ultimoNodo=null;
    }
    
    //insertar elementos al frente de la lista
    public void insertarAlFrente(Object elementoAInsertar){
        if(estaVacia()){//el primer y ultimo nodo hacen referencia al mismo elemento
            primerNodo=ultimoNodo=new NodoLista(elementoAInsertar);
        }else{
            //se agrega el nuevo elemento y se referencia con respecto a el mismo
            primerNodo=new NodoLista(elementoAInsertar, primerNodo);
        }
    }
    //metodo que inserta al final de la lista
    public void insertarAlFinal(Object elementoInsertar){
        if(estaVacia()){
            primerNodo=ultimoNodo=new NodoLista(elementoInsertar);
        }else{
            ultimoNodo=ultimoNodo.siguienteNodo=new NodoLista(elementoInsertar);
        }
    
    }
    
    //Eliminar elementos del frente
    public Object eliminarDelFrente() throws ExcepcionListaVacia{
        if(estaVacia()){
            throw new ExcepcionListaVacia(nombre);
        }
        Object elementoEliminado= primerNodo.datos;
        if(primerNodo==ultimoNodo){
            primerNodo=ultimoNodo=null;
        }else{
            primerNodo=primerNodo.siguienteNodo;
        }
        return elementoEliminado;
    }
    
    //Eliminar elementos del final
    public Object eliminarDelFinal() throws ExcepcionListaVacia{
        if(estaVacia()){
            throw new ExcepcionListaVacia(nombre);
        }
        
        Object elementoEliminado=ultimoNodo.datos;
        //se verifica que la lista unicamente contenga un elemento
        if(primerNodo==ultimoNodo){
            primerNodo=ultimoNodo=null;
        }else{
            //si contiene varios elementos
            NodoLista actual=primerNodo;
            //se identifica el ultimo nodo de la lista
            while(actual.siguienteNodo != ultimoNodo){
                actual=actual.siguienteNodo;
            }
            //se reemplaza ultimo nodo
            ultimoNodo=actual;
            //se define el siguiente nodo como null
            actual.siguienteNodo=null;
            
        }
        return elementoEliminado;
    }
    
    
    //verifica si la lista con la que se esta trabajando esta vacia.
    public boolean estaVacia(){
        return primerNodo==null;
    }
    
    public void imprimir(){
        if(estaVacia()){
            System.out.printf("%s vacia ",nombre);
            return;
        }
        System.out.printf("La %s es: ", nombre);
        NodoLista actual =primerNodo;
        
        while(actual != null){
            System.out.printf("%s ",actual.datos);
            actual=actual.siguienteNodo;
        }
        System.out.println("");
    }
}
