/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrodeturnos;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Juan Camilo
 */
public class EspecialidadRotacion {
    public int idEspecialidadRotacion;
    public String nombreEspecialidad;
    public int horasDisponibleEspecialidad;
    
    
    public EspecialidadRotacion(int idEspecialidadRotacion, String nombreEspecialidad, int horasDisponibilidadEspecialidad){
        idEspecialidadRotacion=idEspecialidadRotacion;
        nombreEspecialidad=nombreEspecialidad;
        horasDisponibleEspecialidad=horasDisponibilidadEspecialidad;
    }
    
    
    public ArrayList<Object> llenarListadoEspecialidades(){
            ArrayList<Object> listaEspecialidades= new ArrayList<Object>();
            listaEspecialidades.add(new EspecialidadRotacion(1,"Electivas",0));
            listaEspecialidades.add(new EspecialidadRotacion(2,"Neumologia",8));
            listaEspecialidades.add(new EspecialidadRotacion(3,"Infectologia",8));
            listaEspecialidades.add(new EspecialidadRotacion(4,"Urgencias",8));
            listaEspecialidades.add(new EspecialidadRotacion(5,"Neonatos",9));
            listaEspecialidades.add(new EspecialidadRotacion(6,"Consulta externa",9));
            listaEspecialidades.add(new EspecialidadRotacion(7,"Neurologia",8));
            listaEspecialidades.add(new EspecialidadRotacion(8,"UCI",12));
            listaEspecialidades.add(new EspecialidadRotacion(9,"Cardiologia",0));
            listaEspecialidades.add(new EspecialidadRotacion(10,"Hematooncologia",12));
            listaEspecialidades.add(new EspecialidadRotacion(11,"Nefrologia",8));
            listaEspecialidades.add(new EspecialidadRotacion(12,"Cx pediatrica",8));
            listaEspecialidades.add(new EspecialidadRotacion(13,"Medicina infantil",9));
            return listaEspecialidades;
    }
}
