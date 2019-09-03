/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Juan Camilo
 */
public class FigurasGeometricas {
    
    private int cantidadLados;
    public String nombreFigura;
    //constructor
    public FigurasGeometricas(String nombre){
        this.nombreFigura=nombre;
    
    }
    //set
    public void setCantidadLados(int lados){
        this.cantidadLados=lados;
    }
    //get
    public int getCantidadLados(){
        return this.cantidadLados;
    }
    //set nombre figura
    public void setNombreFigura(String nombre){
        this.nombreFigura=nombre;
    }
    
    
}
