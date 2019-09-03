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
public class Cuadrado extends FigurasGeometricas{
    public long area;
    public long lado1;
    public long lado2;
    
    public Cuadrado(){
        super("Cuadrado");
    }
    
    public long area(long lado1, long lado2){
        this.area=lado1*lado2;
        return this.area;
    }
    
}
