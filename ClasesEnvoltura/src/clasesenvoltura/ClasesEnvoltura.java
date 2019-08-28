/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesenvoltura;

/**
 *
 * @author Juan Camilo
 */
public class ClasesEnvoltura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Boxing
        Integer intBoxing= 10;
        System.out.println("Boxing de primitivo int: "+intBoxing.toString());
        
        //Unboxing
        int intUnBoxing=intBoxing;
        System.out.println("Unboxing de primitivo int: "+intUnBoxing);
        
    }
    
}
