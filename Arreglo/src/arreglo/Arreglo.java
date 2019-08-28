/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan Camilo
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada= new Scanner(System.in);
        int tamano=Integer.parseInt(entrada.nextLine());
        int[] arreglo= new int[tamano];
        Random numero= new Random();
        int suma=0;
        for(int i=0; i< arreglo.length;i++){
            arreglo[i]=numero.nextInt(100);
            suma=suma+arreglo[i];
        }
        System.out.println("tamano arreglo " + arreglo.length);
           System.out.println("Resultado " + suma);
        
        
        
        
    }
    
}
