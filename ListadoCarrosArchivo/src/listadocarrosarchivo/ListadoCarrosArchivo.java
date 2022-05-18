/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadocarrosarchivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Camilo
 */
public class ListadoCarrosArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        String file= "..\\ListadoCarrosArchivo\\src\\ListadoCarros.csv";
        File f= new File(file);
        Carros modeloCarros= new Carros();
        try{
            List<Carros> listadoCarros=modeloCarros.leerListadoDeArchivo(f);
            //Desarrolle a partir de este punto los metodos o procedimientos necesarios para completar el problema
           
        }catch (FileNotFoundException ex) {
            Logger.getLogger("El archivo no fue procesado").log(Level.SEVERE, null, ex);
        } 
        
        
  
    }
    
    
     

    
}
