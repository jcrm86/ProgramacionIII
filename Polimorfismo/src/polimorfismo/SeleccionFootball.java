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
public class SeleccionFootball {
    public String nombreSeleccion;
    public String nombrePais;
    
    //Constructor
    public SeleccionFootball(String nombre, String pais){
        this.nombreSeleccion=nombre;
        this.nombrePais=pais;
    }
    
    //metodo entrenamiento
    public String entrenamiento(){
        return "Nombre de la seleccion: "+nombreSeleccion+"\n nombre del pais: "+nombrePais;
    }
    
    
}
