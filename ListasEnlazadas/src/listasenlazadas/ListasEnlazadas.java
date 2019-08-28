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
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista=new Lista();
        
        //se insertan elementos a la lista
        lista.insertarAlFrente(-1);
        lista.imprimir();
        lista.insertarAlFrente(0);
        lista.imprimir();
        lista.insertarAlFrente(5);
        lista.imprimir();
        lista.insertarAlFinal(5);
        lista.imprimir();
        
        try{
            Object objetoEliminado=lista.eliminarDelFrente();
            System.out.printf("%s eliminado", objetoEliminado);
            lista.imprimir();
            
              objetoEliminado=lista.eliminarDelFrente();
            System.out.printf("%s eliminado", objetoEliminado);
            lista.imprimir();
            
            objetoEliminado=lista.eliminarDelFinal();
            System.out.printf("%s eliminado", objetoEliminado);
            lista.imprimir();
            
            objetoEliminado=lista.eliminarDelFinal();
            System.out.printf("%s eliminado", objetoEliminado);
            lista.imprimir();
        }catch(ExcepcionListaVacia e){
            e.printStackTrace();
        }
    }
    
}
