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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SeleccionFootball seleccion[]=new SeleccionFootball[4];
        
        //Sin polimorfismo
        seleccion[0]= new SeleccionFootball("FCB","Colombia");
        
        //Aplicando polimorfismo
        seleccion[1]= new Futbolista("FCB","Colombia","Falcao");
        seleccion[2]= new Entrenador("FCB","Colombia","Nombre ejemplo del entrenador");
        seleccion[3]= new Masajista("FCB","Colombia","Nombre del masajista");
        
        for(SeleccionFootball selec: seleccion){
            System.out.println(selec.entrenamiento());
            System.out.println("");
        }
        
        
        
        
        
        
        
    }
    
}
