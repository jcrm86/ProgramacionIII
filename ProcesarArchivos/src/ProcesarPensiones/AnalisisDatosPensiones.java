/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesarPensiones;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.io.FileWriter;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Juan Camilo
 */
public class AnalisisDatosPensiones {
    
    public String key;
    public int value;
    public boolean flag;
    //Comentario en el constructor
    public AnalisisDatosPensiones(String llave, int valor, boolean flag_1){
        key=llave;
        value=valor;
        flag=flag_1;
    }

    AnalisisDatosPensiones() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public List<AnalisisDatosPensiones> graficoCantidadSalarioMinimo(File f) throws FileNotFoundException{
          return crearListado(f,2);
    }
    
    public List<AnalisisDatosPensiones> graficoCantidadPorSexo(File f) throws FileNotFoundException{
        return crearListado(f,3);
    }
    
    public List<AnalisisDatosPensiones> graficoCantidadPorTipo(File f) throws FileNotFoundException{
        return crearListado(f,4);
    }
    
    private int getIndexValue(List<AnalisisDatosPensiones>  list, String key){
        for(int i=0; i <list.size(); i++){
            String valor=list.get(i).key.toString();
            if(valor.equals(key) && list.get(i).flag==true){
                return i;
            }
        }
        return -1;
    }
    
    private boolean validarKey(List<AnalisisDatosPensiones> lista, String key){
        for(int i=0; i< lista.size(); i++){
            String valor=lista.get(i).key.toString();
            if(valor.equals(key)){
                return true;
            }
        }
        return false;
    }
    
    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
    
    private List<AnalisisDatosPensiones> crearListado(File f, int indice) throws FileNotFoundException{
         List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(f);) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        }
        
       
        List<AnalisisDatosPensiones> listadoFinal= new ArrayList<>();
        for(int i=0; i < records.size();i++){
           // int contador=0;
            if(!validarKey(listadoFinal,records.get(i).get(indice))){
                for(int j=i; j<records.size();j++){
                    if(records.get(i).get(indice)==records.get(j).get(indice) && !validarKey(listadoFinal,records.get(j).get(indice))){
                        listadoFinal.add(new AnalisisDatosPensiones(records.get(i).get(indice),Integer.parseInt(records.get(j).get(1)),true));
                    }else if(validarKey(listadoFinal,records.get(j).get(indice))){
                        //System.out.println(records.get(j).get(indice)+" "+records.get(j).get(1));
                        int getValor=getIndexValue(listadoFinal,records.get(j).get(indice));
                        if(getValor != -1){
                            listadoFinal.get(getValor).value=listadoFinal.get(getValor).value+Integer.parseInt(records.get(j).get(1));
                         System.out.println(records.get(j).get(indice)+" "+listadoFinal.get(getValor).value);
                    
                        }
                    }
                }
                int getIndex=getIndexValue(listadoFinal,records.get(i).get(indice));
                if(getIndex != -1){
                    listadoFinal.get(getIndex).flag=false;
                }
                
            }
            
        }
        return listadoFinal;
    }
    
    public void imprimirResultadosEnArchivo (String pathArchivo, List<AnalisisDatosPensiones> listaSalida) throws IOException{
                //se crea el archvo en donde se va a escribir la información de la lista
               FileWriter writer = new FileWriter(pathArchivo + "output.csv");
               //recorrer la lista que se va a transformar en csv
                for(int i=0; i < listaSalida.size();i++){
                        //se crea la fila que se va a incluir en el archivo
                       String str =listaSalida.get(i).value+";"+listaSalida.get(i).key+"\n";
                       //se escribe la linea que se va registrar en el archivo
                       writer.write(str);
                  }
                writer.close();
    }
}
