/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenfinalprogramacion;

/**
 *
 * @author Juan Rivera
 */
public class ExamenFinalProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      long numb1=0, numb2=0;
    int contador=0;
    long numero=0;

    for(numb1=0;numb1<1000000000;numb1++){
        for(numb2=1;numb2<21;numb2++){
            if(numb1%numb2==0){
                contador++;
            }
            if(contador==20){
                numero=numb1;
            }
        }
        contador=0;

}System.out.println(numero);
    } 

}
