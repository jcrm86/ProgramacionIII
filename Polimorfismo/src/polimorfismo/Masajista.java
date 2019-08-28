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
public class Masajista extends SeleccionFootball{
    public String nombreMasajista;
    
    //Constructor
    public Masajista(String nombre, String pais, String nombreMasajista){
        super(nombre,pais);
        this.nombreMasajista=nombreMasajista;
    }
    
    
    @Override
    public String entrenamiento(){
        return "Nombre de la seleccion: "+nombreSeleccion+"\n nombre del pais: "+nombrePais+"\n Nombre del futbolista: "+nombreMasajista;
    
    }
    
    
}
