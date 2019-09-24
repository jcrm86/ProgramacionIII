/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

/**
 *
 * @author Juan Camilo
 */
public class Arreglos {
    int numberoLetrasRepetidas;
    
    //Constructor
    public void Arreglos(){
        
    }
    
    public int numeroLetrasRepetidas(String nombre, char letra){
        int contadorLetras=0;
        for(int posicionLetra=0; posicionLetra < nombre.length(); posicionLetra++ ){
            if(letra==nombre.charAt(posicionLetra)){
                contadorLetras++;
            }
       }
        return contadorLetras;
    
    }
    
}
