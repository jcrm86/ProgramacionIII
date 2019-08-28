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
public class Cuenta {
    //Numero de cuenta
    int numeroCuenta;
    //Nombre tipo de cuenta
    String tipoCuenta;
    //Saldo cuenta
    float saldoCuenta;
    
    //se crea un constructor
    public Cuenta(int numberoCuenta, String tipoCuenta,float saldoCuenta){
        numeroCuenta=numberoCuenta;
        tipoCuenta=tipoCuenta;
        saldoCuenta=saldoCuenta;
    }
    
    //consultar el saldo de la cuenta
    public void consultarSaldoCuenta(){
        System.out.println("El saldo de la cuenta es: "+saldoCuenta);
    }
     //realizar el abono de la cuenta
    public void realizarAbonoCuenta(float abono){
        saldoCuenta=saldoCuenta+abono;
        consultarSaldoCuenta();
    }
    //realizar retiro a la cuenta
    public void realizarRetiroCuenta(float retiro){
        float localRetiro=saldoCuenta-retiro;
        if(localRetiro <= 0){
            System.out.println("Fondos insuficientes para realizar su retiro");
        }else{
            saldoCuenta=saldoCuenta-retiro;
            consultarSaldoCuenta();
        }
    }
    
    
}
