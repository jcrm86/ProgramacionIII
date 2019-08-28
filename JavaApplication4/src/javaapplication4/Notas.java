/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.*;

/**
 *
 * @author Juan Camilo
 */
public class Notas {
    
    //Atributos
    float nota;
    int cantidadNotas;
    float promedio;
   
    //metodos
    public float calcularPromedio(List<float> notas){
        //int tamanoLista=notas.size();
        float sumaNotas=0;
        //float promedio=0;
        //leer la lista
        int i=0;
        for(i=0; i< notas.size();i++){
            sumaNotas=sumaNotas+notas.item(i);
        }
        //promedio=sumaNotas/i;
        
        //imprimir en el mismo metodo
        return sumaNotas/i;
        
        
        //
        
        
        
        return 0.0;
    }
    
    
}
