/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseautoreferenciada;

/**
 *
 * @author Juan Camilo
 */
public class ClaseAutoreferenciada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        autoreferencia objetoEjemplo1= new autoreferencia();
        
        objetoEjemplo1.id=1;
        objetoEjemplo1.nombre="Primer nodo";
        objetoEjemplo1.next=null;
        
        //Se define el segundo nodo
        autoreferencia objetoEjemplo2=new autoreferencia();
        objetoEjemplo2.id=2;
        objetoEjemplo2.nombre="Segundo nodo";
        objetoEjemplo2.next=objetoEjemplo1;
        do{
            System.out.println(objetoEjemplo2.nombre);
            objetoEjemplo2=objetoEjemplo2.next;
       }while(objetoEjemplo2.next != null);
        System.out.println(objetoEjemplo2.nombre);
    }
}
