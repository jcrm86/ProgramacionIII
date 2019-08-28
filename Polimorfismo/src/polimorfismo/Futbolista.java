/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Juan Camilo
 */
public class Futbolista extends SeleccionFootball {
    public String nombreFutbolista;
    
    
    //Constructor
    public Futbolista(String nombre, String pais, String nombreFutbolista){
        super(nombre,pais);
        this.nombreFutbolista=nombreFutbolista;
    }
    
    //Método entrenamiento
    @Override
    public String entrenamiento(){
        return "Nombre de la seleccion: "+nombreSeleccion+"\n nombre del pais: "+nombrePais+"\n Nombre del futbolista: "+nombreFutbolista;
    
    }
}
