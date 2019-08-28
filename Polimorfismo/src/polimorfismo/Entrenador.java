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
public class Entrenador extends SeleccionFootball{
    public String nombreEntrenador;
    
    
    //Constructor
    public Entrenador(String nombre, String pais, String nombreEntrenador){
        super(nombre, pais);
        this.nombreEntrenador=nombreEntrenador;
    }
    
    
    @Override
    public String entrenamiento(){
        return "Nombre de la seleccion: "+nombreSeleccion+"\n nombre del pais: "+nombrePais+"\n Nombre del entrenador: "+nombreEntrenador;
    
    }
}
