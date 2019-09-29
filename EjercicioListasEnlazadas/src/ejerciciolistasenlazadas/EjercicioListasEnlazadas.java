/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistasenlazadas;
import java.util.LinkedList;
import java.util.Iterator;




/**
 *
 * @author Juan Camilo
 */
public class EjercicioListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* LinkedList<String> listaEnlazadaString= new LinkedList<>();
        
        //Agregar elementos a la lista enlazada
        listaEnlazadaString.add("Elemento 1");
        listaEnlazadaString.add("Elemento 2");
        listaEnlazadaString.add("Elemento 3");
        
        Iterator<String> iterator=listaEnlazadaString.iterator();
        while(iterator.hasNext()){
          System.out.println(iterator.next());
        }
        System.out.println("***Imprimir lista con elmento al frente***");
        //agrega elementos al frente
        listaEnlazadaString.addFirst("Elemento 4 al frente");
        iterator=listaEnlazadaString.iterator();
        while(iterator.hasNext()){
          System.out.println(iterator.next());
        }
        
        //Agregar al final
        System.out.println("***Imprimir lista con elmento al final***");
        listaEnlazadaString.addLast("Elemento 5 al final");
        iterator=listaEnlazadaString.iterator();
          while(iterator.hasNext()){
          System.out.println(iterator.next());
        }
*/
       LinkedList<Integer> listaAOrdenar= new LinkedList<>();
       listaAOrdenar.add(10);
        listaAOrdenar.add(23);
        listaAOrdenar.add(4);
        listaAOrdenar.add(15);
        listaAOrdenar.add(30);
        listaAOrdenar.add(40);
             System.out.println("***Lista sin organizar***");
          Iterator<Integer> iterator=listaAOrdenar.iterator();
        while(iterator.hasNext()){
          System.out.println(iterator.next());
        }
        
        OrganizarLista objetoOrganizar= new OrganizarLista();
        
        System.out.println("***Lista a organizar en orden ascedente***");
        objetoOrganizar.organizarImprimirLista(listaAOrdenar, true);
        iterator=listaAOrdenar.iterator();
        while(iterator.hasNext()){
          System.out.println(iterator.next());
        }
        
        System.out.println("***Lista a organizar en orden descendente***");
        objetoOrganizar.organizarImprimirLista(listaAOrdenar, false);
        iterator=listaAOrdenar.iterator();
        while(iterator.hasNext()){
          System.out.println(iterator.next());
        }
        
    }
    
}
