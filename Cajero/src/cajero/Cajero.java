/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;
import java.util.Scanner;


/**
 *
 * @author Juan Camilo
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradaTeclado= new Scanner(System.in);
        System.out.println("Digite el nombre de usuario:");
        String nombreUsuario=entradaTeclado.nextLine();
        System.out.println("Digite el numero de documento de usuario:");
        int numeroDocumento=Integer.parseInt(entradaTeclado.nextLine());
        //se crea el modelo de usuarios
        Usuario nuevoUsuario=new Usuario(nombreUsuario,numeroDocumento);
        Cuenta nuevaCuenta= new Cuenta(1,"Ahorros", 0);
        Boolean banderaEstado=true;
        while(banderaEstado==true){
            System.out.println("1. Para consultar saldo");
            System.out.println("2. Para realizar abono");
            System.out.println("3. Para realizar retiro");
            int opcion=Integer.parseInt(entradaTeclado.nextLine());
            switch(opcion){
                case 1:
                    nuevaCuenta.consultarSaldoCuenta();
                break;
                case 2:
                    nuevaCuenta.realizarAbonoCuenta(250);
                break;   
                case 3:
                    nuevaCuenta.realizarRetiroCuenta(300);
                break;
            }
            System.out.println("¿Desea realizar otra tarea? Y/N");
            String opcionTarea=entradaTeclado.nextLine();
            if(opcionTarea=="N"){
                banderaEstado=false;
            }
        }
        System.out.println("Gracias por usar nuestro servicio");
    }
    
}
