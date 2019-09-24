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
public class Salones {
    String nombreSalon;
    int capacidadEstudiantes;
    String cuentaConComputador;
    
    
    public void Salones(String nombre,int capacidad,String computador){
        this.nombreSalon=nombre;
        this.capacidadEstudiantes=capacidad;
        this.cuentaConComputador=computador;
    }
}
