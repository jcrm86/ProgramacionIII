/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesarPensiones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Juan Rivera
 */
public class Persona {
    public String PrimerNombre;
    public String SegundoNombre;
    public String PrimerApellido;
    public String SegundoApellido;
    public int Edad;
    
    //constructor
    public Persona(){}
    
    public Persona(String pNombre, String sNombre, String pApellido, String sApellido, int edad){
        this.PrimerNombre=pNombre;
        this.SegundoNombre=sNombre;
        this.PrimerApellido=pApellido;
        this.SegundoApellido=sApellido;
        this.Edad=edad;
    }
    
    
    //método que me permiti imprimir a un archivo
        public void imprimirResultadosEnArchivo (String pathArchivo, ArrayList<Persona> listaPersonas) throws IOException{
                //se crea el archvo en donde se va a escribir la información de la lista
               FileWriter pw = new FileWriter(pathArchivo + "output.csv",true); 
               FileWriter writer = new FileWriter(pathArchivo + "output.csv");
               //recorrer la lista que se va a transformar en csv
                for(int i=0; i < listaPersonas.size();i++){
                        //se crea la fila que se va a incluir en el archivo
                       String str =listaPersonas.get(i).PrimerNombre+";"+listaPersonas.get(i).SegundoNombre+";"+listaPersonas.get(i).PrimerApellido+";"+listaPersonas.get(i).SegundoApellido+";"+listaPersonas.get(i).Edad+"\n";
                       //se escribe la linea que se va registrar en el archivo
                       writer.write(str);
                  }
                writer.close();
    }
}
