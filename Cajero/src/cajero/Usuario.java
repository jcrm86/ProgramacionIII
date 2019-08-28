/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author Juan Camilo
 */
public class Usuario {
    //NOMbre de usuario
    String nombreUsuario;
    //numero de documento
    int numeroDocumento;
    
    Cuenta tipoCuenta;
    
    
    //constructor
    public Usuario(String nombreUsuario,int numeroDocumento){
        this.nombreUsuario=nombreUsuario;
        this.numeroDocumento=numeroDocumento;
    }
    
    public void consultarNumeroDocumento(){
        System.out.print("El número de documento registrado es: "+numeroDocumento);
    }
    
}
