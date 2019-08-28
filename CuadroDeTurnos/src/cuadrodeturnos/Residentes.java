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
public class Residentes {
    public int cantidadTurnosAcumulados;
    public int cantidadRefuerzosAcumulados;
    public int cantidadHorasAcumladasPorSemana;
    public String especialidadEnQueEstaRotando;
    public int idEspecilidadEnQueEstaRotando;
    public String servicioClaveEnQueRoto;
    public int idServicioClaveEnQueRoto;
    public int anoResidencia;
    public ArrayList<DiaSolicitado> listaDiasPermisosSolicitados;
    public boolean residenteDeHospital;
    public boolean realizaTurnosNocturnos;
    
}
