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

/**
 *
 * @author Juan Camilo
 */
public class Carros {
    public String Marca;
    public String Modelo;
    public String Año;
    
    public Carros(String marca, String modelo, String año){
        Marca=marca;
        Modelo=modelo;
        Año=año;
    }
    
    public Carros(){
    }
    
    public  List<Carros> leerListadoDeArchivo(File f) throws FileNotFoundException{
        List<Carros> listadoCarros = new ArrayList<>();
        try (Scanner scanner = new Scanner(f);) {
            while (scanner.hasNextLine()) {
                String[] carro=getRecordFromLine(scanner.nextLine());
                listadoCarros.add(new Carros(carro[0],carro[1],carro[2]));
            }
        }
        return listadoCarros;
     }
         
    public static String[] getRecordFromLine(String line) {
        String[] values = line.split(",");
        return values;
    }
}
