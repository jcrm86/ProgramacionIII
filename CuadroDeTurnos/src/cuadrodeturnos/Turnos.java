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
public class Turnos {
    public String nombreResidente;
    public String nombreServicio;
    public DiasMes fechaTurno;
    public String turnoNocturno;
    public String turnoDiurno;
    
    public Turnos(String nombreR, String nombreS, DiasMes fecha, String tNocturno, String tDiurno){
        nombreResidente=nombreR;
        nombreServicio=nombreS;
        fechaTurno=fecha;
        turnoNocturno=tNocturno;
        turnoDiurno=tDiurno;
    }
    
    public ArrayList<Turnos> generarCuadroTurnos(ArrayList<Object> listadoResidentes, ArrayList<Object> fechasMes, ArrayList<Object> fechasSolicitadas){
        ReglasGenerales reglasGenerales= new ReglasGenerales();
        ArrayList<Turnos> list=new ArrayList<Turnos>();
        return list;
    }
}
