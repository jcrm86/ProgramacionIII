/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrodeturnos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Juan Camilo
 */
public class DiasMes {
    public Date diaMes;
    public boolean sabado;
    public boolean domingo;
    public boolean festivo;
    
    public DiasMes(Date fecha, boolean sabado, boolean domingo, boolean festivo){
        diaMes=fecha;
        sabado=sabado;
        domingo=domingo;
        festivo=festivo;
    }
    
    public ArrayList<Object> llenarListadoMes(Date fechaInicial, Date fechaFinal){
        long diferencia=fechaFinal.getTime()-fechaInicial.getTime();
        int diferenciaDias=(int)(diferencia/(24*60*60*1000));
        ArrayList<Object> listadoDias= new ArrayList<>();
        for(int i=0;i<diferenciaDias;i++){
            Calendar cal = Calendar.getInstance();
            cal.setTime(fechaInicial);
            cal.add(Calendar.DATE, i); //minus number would decrement the days
            listadoDias.add(new DiasMes(cal.getTime(),false,false,false));
        }
        return listadoDias;
    }
    
    public boolean actualizarFinDeSemanaFeriado(ArrayList<DiasMes> list,Date fecha, boolean sabado, boolean domingo, boolean festivo){
        for(int i=0; i < list.size();i++){
            if(list.get(i).diaMes==fecha){
                list.get(i).sabado=sabado;
                list.get(i).domingo=domingo;
                list.get(i).festivo=festivo;
                return true;
            }
        }
        return false;
    }
    
}
