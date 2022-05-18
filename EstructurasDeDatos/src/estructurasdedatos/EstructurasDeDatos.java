
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;


/**
 *
 * @author Juan Camilo
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //captura de nombre
       /* String nombreCompleto="Juan Camilo Rivera Medina";
        Arreglos objetoArreglos=new Arreglos();
        char letra='a';
        System.out.println("Número de "+ letra+" es: "+objetoArreglos.numeroLetrasRepetidas(nombreCompleto, letra));
        
        //Uso de arreglos
        Random numeroAleatorio= new Random();
        */
        /*int[] arregloDeNumeros= new int[10];
        for(int i=0; i < arregloDeNumeros.length;i++){
            arregloDeNumeros[i]=numeroAleatorio.nextInt(100);
            System.out.println("EL arreglo en la posicion "+i+" es "+arregloDeNumeros[i]);
        }
        */
        //Arreglos con objetos
        /*Salones[] arregloSalones=new Salones[3];
        for(int i=0; i < arregloSalones.length;i++){
            //se construye el objeto en la posicion del arreglo
            arregloSalones[i]=new Salones();
            arregloSalones[i].nombreSalon="Salon "+i;
            arregloSalones[i].capacidadEstudiantes=numeroAleatorio.nextInt(100);
            arregloSalones[i].cuentaConComputador="Si";
            System.out.println("Nombre del salon "+arregloSalones[i].nombreSalon+" Capacidad de estudiantes "+arregloSalones[i].capacidadEstudiantes+" Cuenta con computador "+arregloSalones[i].cuentaConComputador);
        }
        */
        
        /*Arbol arbol= new Arbol();
        int valor;
        //se debe agregar libreria java.util.random
        Random numeroAleatorio= new Random();
        System.out.printf("Insertar los siguientes valores");
        System.out.println();
        for(int i=0; i< 10; i++){
            valor= numeroAleatorio.nextInt(100);
            System.out.printf(valor+" ");
            arbol.insertarNodo(valor);
        }
        System.out.println();
        System.out.println("Recorrido preorden");
        arbol.recorridoPreorden();
        System.out.println();
        System.out.println("Recorrido inorder");
        arbol.recorridoInorder();
        System.out.println();
        System.out.println("Recorrido postorden");
        arbol.recorridoPostorden();
        System.out.println();
        */
        
       /* HashMap<String,Sexo> ciudades= new HashMap<String,Sexo>();
        ciudades.put("Bogota",new Sexo(1500000,5500000));
        ciudades.put("La Dorada", new Sexo(3500000,15000));
        ciudades.put("Medellin",new Sexo(1,34));
        //lectura
        Sexo resultado=ciudades.get("Bogota");
        System.out.println("Habitantes Bogota cantidad femenino"+resultado.cantidadFemenino+" cantidad masdculino"+resultado.cantidadMasculino);
        
        //iterar
        for(String key: ciudades.keySet()){
            System.out.println("Nombre de la llave "+ key);
        }
        */
        TreeMap<Integer,String> personasEdades=new TreeMap<Integer,String>();
        personasEdades.put(80, "Juan");
        personasEdades.put(10, "Juan 1");
        personasEdades.put(40, "Juan 2");
        personasEdades.put(20, "Juan 3");
        for(Integer key: personasEdades.keySet()){
            System.out.println("Llave "+key);
        }
 
        
        TreeMap<Integer,TreeMap<String,Integer>> personasPorEdades=new TreeMap<Integer,TreeMap<String,Integer>>();
        personasPorEdades.put(80, new TreeMap<String,Integer>());
        personasPorEdades.get(80).put("Masculino",600);
        personasPorEdades.get(80).put("Femenino",1000);
        
        for(Integer keyMapa1: personasPorEdades.keySet()){
            System.out.println("Llave "+keyMapa1);
            for(String keyMapa2: personasPorEdades.get(keyMapa1).keySet()){
                System.out.println("Llave segundo mapa "+ keyMapa2 +" "+ personasPorEdades.get(keyMapa1).get(keyMapa2));
            }
        }
        
        
               
        
        
        /*
        
        
        
        Map<String,ArrayList> hashMapEjemplo=new HashMap<>();
        for(int semestre=1; semestre <11;semestre++){
            ArrayList estudiantes= new ArrayList();
            for(int estudiante=1;estudiante< 10;estudiante++){
                estudiantes.add("Estudiante "+estudiante);
            }
            hashMapEjemplo.put("Semestre "+semestre, estudiantes);
        }
        
        for(String key:hashMapEjemplo.keySet()){
            for(int i=0; i< hashMapEjemplo.get(key).size();i++){
                System.out.println("Llave "+key+" Valor "+hashMapEjemplo.get(key).get(i));
            }
        }
        */
        
        
        
    }
    
}
