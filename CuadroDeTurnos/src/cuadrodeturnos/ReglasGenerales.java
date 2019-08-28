/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrodeturnos;

/**
 *
 * @author Juan Camilo
 */
public class ReglasGenerales {
    public int cantidadDiasSolicitadosPermiso;
    public int cantidadMaximaHorasSemana;
    public int tiempoTurnoNormal;
    public int tiempoTurnoFestivo;
    public int tiempoRefuerzos;
    
    public ReglasGenerales(){
        cantidadDiasSolicitadosPermiso=5;
        cantidadMaximaHorasSemana=66;
        tiempoTurnoNormal=12;
        tiempoTurnoFestivo=15;
        tiempoRefuerzos=3;
    }
}
