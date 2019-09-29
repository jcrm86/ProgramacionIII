/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistasenlazadas;
import java.util.LinkedList;
/**
 *
 * @author Juan Camilo
 */
public class OrganizarLista {
    
    //Constructor
    public OrganizarLista(){
    
    }
    
    public void organizarImprimirLista(LinkedList<Integer> listaEnteros, boolean ordenAscendente){
            for(int contador_i=0; contador_i < listaEnteros.size(); contador_i++)
            {
                for(int contador_j=0; contador_j < listaEnteros.size(); contador_j++)
                {
                    int temporal;
                    if(ordenAscendente){
                        if(listaEnteros.get(contador_i) < listaEnteros.get(contador_j)){
                            temporal=listaEnteros.get(contador_i);
                           listaEnteros.set(contador_i,listaEnteros.get(contador_j));
                           listaEnteros.set(contador_j,temporal);
                        }
                    }else{
                        if(listaEnteros.get(contador_i) > listaEnteros.get(contador_j)){
                           temporal=listaEnteros.get(contador_i);
                           listaEnteros.set(contador_i,listaEnteros.get(contador_j));
                           listaEnteros.set(contador_j,temporal);
                        }
                    }
                    

                }
            }
    
    }
    
}
