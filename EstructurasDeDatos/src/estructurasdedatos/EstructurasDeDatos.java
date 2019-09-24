
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import java.util.Random;


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
        String nombreCompleto="Juan Camilo Rivera Medina";
        Arreglos objetoArreglos=new Arreglos();
        char letra='a';
        System.out.println("Número de "+ letra+" es: "+objetoArreglos.numeroLetrasRepetidas(nombreCompleto, letra));
        
        //Uso de arreglos
        Random numeroAleatorio= new Random();
        /*int[] arregloDeNumeros= new int[10];
        for(int i=0; i < arregloDeNumeros.length;i++){
            arregloDeNumeros[i]=numeroAleatorio.nextInt(100);
            System.out.println("EL arreglo en la posicion "+i+" es "+arregloDeNumeros[i]);
        }
        */
        //Arreglos con objetos
        Salones[] arregloSalones=new Salones[3];
        for(int i=0; i < arregloSalones.length;i++){
            //se construye el objeto en la posicion del arreglo
            arregloSalones[i]=new Salones();
            arregloSalones[i].nombreSalon="Salon "+i;
            arregloSalones[i].capacidadEstudiantes=numeroAleatorio.nextInt(100);
            arregloSalones[i].cuentaConComputador="Si";
            System.out.println("Nombre del salon "+arregloSalones[i].nombreSalon+" Capacidad de estudiantes "+arregloSalones[i].capacidadEstudiantes+" Cuenta con computador "+arregloSalones[i].cuentaConComputador);
        }
        
        
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
        
    }
    
}
