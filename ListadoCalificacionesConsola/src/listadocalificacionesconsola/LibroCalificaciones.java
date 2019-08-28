/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listadocalificacionesconsola;
import java.util.List;

/**
 *
 * @author Juan Camilo
 */
public class LibroCalificaciones {
    //Atributos
    public String NombreCompleto;
    //Métodos
        //metodo que muestra mensaje
        public void mostrarMensaje(){
            System.out.println("Bienvenido al libro de calificaciones:");
        }
        
        //recibir califiaciones
        public List<Double> registroCalificaciones(List<Double> notasActuales, double nuevaNota){
             notasActuales.add(nuevaNota);
             return notasActuales;
        }
        
        //Calcular promedio
        public double calcularPromedio(List<Double> notas){
            double sumarNotas=0;
            double promedio=0.0;
            for(int i=0; i< notas.size();i++){
                sumarNotas=sumarNotas+notas.get(i);
            }
            promedio= sumarNotas/notas.size();
            return promedio;
        }
    
}
