/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadocalificacionesconsola;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Juan Camilo
 */
public class ListadoCalificacionesConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //abrir mensaje de bienvenida
        LibroCalificaciones libro =new LibroCalificaciones();
        Scanner entrada= new Scanner(System.in);
        List<Double> listadoNotas = new ArrayList<Double>();
        int numeroNotas;
        libro.mostrarMensaje();
        //Capturar numero de notas
        System.out.println("Digite el número de notas a evaluar");
        numeroNotas=Integer.parseInt(entrada.nextLine());
        for(int i=0; i < numeroNotas;i++){
            System.out.println("Digite la nota deseada");
            libro.registroCalificaciones(listadoNotas,Double.parseDouble(entrada.nextLine()));
        }
        
        System.out.println("Su promedio es de: "+libro.calcularPromedio(listadoNotas));
        
    }
    
}
