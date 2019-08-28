/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrodeturnos;

import java.util.ArrayList;

/**
 *
 * @author Juan Camilo
 */
public class Servicio {
    public int idServicio;
    public String nombreServicio;
    
    
    public Servicio(int idServicio, String nombreServicio){
        idServicio=idServicio;
        nombreServicio=nombreServicio;
    }
    
    public ArrayList<Object> llenarListadoServicios(){
        ArrayList<Object> listadoServicios=new ArrayList<Object>();
        listadoServicios.add(new Servicio(1,"Urgencias"));
        listadoServicios.add(new Servicio(2,"Neonatos"));
        listadoServicios.add(new Servicio(3,"UCI"));
        listadoServicios.add(new Servicio(4,"Pisos"));
        
        return listadoServicios;
    }
}
