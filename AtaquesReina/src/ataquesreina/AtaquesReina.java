/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ataquesreina;
import java.util.Scanner;


/**
 *
 * @author Juan Camilo
 */
public class AtaquesReina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        Obstaculos obstaculo= new Obstaculos();
        int reina_x, reina_y, contador_ataques=0;
        boolean obstaculoV=false, flag=false;
        System.out.println("Ingrese el tamaño del tablero, solo se define una dimensión debido a que es un tablero cuadrado ");
        int tamanoTablero=Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese la cantidad de obstaculos ");
        int cantidadObstaculos=Integer.parseInt(entrada.nextLine());
        int[][] coordenadasObstaculos= new int[cantidadObstaculos][2];
        
        
        //se asignan las posiciones de la reina
        System.out.println("Defina las posiciones de la reina en X: ");
        reina_x=Integer.parseInt(entrada.nextLine());
        System.out.println("Defina las posiciones de la reina en Y: ");
        reina_y=Integer.parseInt(entrada.nextLine());
        
        
        //se verifica que la cantidad de obstaculos sea menor al tamaño total del tablero
        if(cantidadObstaculos > tamanoTablero*tamanoTablero){
            System.out.println("La cantidad de obstaculos supera el tamaño del tablero, por favor re asigne la variable ");
            cantidadObstaculos=Integer.parseInt(entrada.nextLine());
            while(cantidadObstaculos > tamanoTablero*tamanoTablero){
                int tamanoTableroTotal=tamanoTablero*tamanoTablero;
                System.out.println("La cantidad de obstaculos debe ser menor a:  "+ tamanoTableroTotal);
                cantidadObstaculos=Integer.parseInt(entrada.nextLine());
            }
        }
        
        //se realiza un ciclo para almacenar los obstaculos
        for(int i=0; i< cantidadObstaculos; i++){
            System.out.println("Ingrese la coordenada x del obstaculo: ");
            coordenadasObstaculos[i][0]=Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese la coordenada y del obstaculo: ");
            coordenadasObstaculos[i][1]=Integer.parseInt(entrada.nextLine());
            while(coordenadasObstaculos[i][0]==reina_x && coordenadasObstaculos[i][1]==reina_y){
                System.out.println("La posición del obstaculo coincide con la posición de la reina, re asigne la posición del obstaculo ");
                System.out.println("Ingrese la coordenada x del obstaculo: ");
                coordenadasObstaculos[i][0]=Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese la coordenada y del obstaculo: ");
                coordenadasObstaculos[i][1]=Integer.parseInt(entrada.nextLine());
            }
            
        }
        
        
        //validador de columnas
        for(int i= reina_x+1; i <= tamanoTablero;i++){
            obstaculoV=obstaculo.validarObstaculos(i,reina_y,coordenadasObstaculos,reina_x,reina_y);
            if(obstaculoV != true && flag != true){
                contador_ataques++;
            }else{
                flag=true;
            }
        }
         flag=false;
        for(int i= reina_x-1; i > 0;i--){
            obstaculoV=obstaculo.validarObstaculos(i,reina_y,coordenadasObstaculos,reina_x,reina_y);
            if(obstaculoV != true && flag != true){
                contador_ataques++;
            }else{
                flag=true;
            }
        }
        
        //validador filas
        flag=false;
        for(int i= reina_y+1; i <= tamanoTablero;i++){
            obstaculoV=obstaculo.validarObstaculos(reina_x,i,coordenadasObstaculos,reina_x,reina_y);
            if(obstaculoV != true && flag != true){
                contador_ataques++;
            }else{
                flag=true;
            }
        }
        flag=false;
         for(int i= reina_y-1; i >0;i--){
            obstaculoV=obstaculo.validarObstaculos(reina_x,i,coordenadasObstaculos,reina_x,reina_y);
            if(obstaculoV != true && flag != true){
                contador_ataques++;
            }else{
                flag=true;
            }
        }
         
        //validador diagonales
        flag=false;
        for(int i= reina_x+1, j=reina_y+1; i <= tamanoTablero && j <= tamanoTablero;i++, j++){
            obstaculoV=obstaculo.validarObstaculos(i,j,coordenadasObstaculos,reina_x,reina_y);
            if(obstaculoV != true && flag != true){
                contador_ataques++;
            }else{
                flag=true;
            }
        }
        flag=false;
           for(int i= reina_x-1, j=reina_y-1; i > 0 && j > 0;i--, j--){
            obstaculoV=obstaculo.validarObstaculos(i,j,coordenadasObstaculos,reina_x,reina_y);
            if(obstaculoV != true && flag != true){
                contador_ataques++;
            }else{
                flag=true;
            }
        }
        //validador de diagonales invertidas 
        flag=false;
         for(int i= reina_x-1, j=reina_y+1; i >0 && j <= tamanoTablero;i--, j++){
            obstaculoV=obstaculo.validarObstaculos(i,j,coordenadasObstaculos,reina_x,reina_y);
            if(obstaculoV != true && flag != true){
                contador_ataques++;
            }else{
                flag=true;
            }
        }
        flag=false;
           for(int i= reina_x+1, j=reina_y-1; i <= tamanoTablero && j > 0;i++, j--){
            obstaculoV=obstaculo.validarObstaculos(i,j,coordenadasObstaculos,reina_x,reina_y);
            if(obstaculoV != true && flag != true){
                contador_ataques++;
            }else{
                flag=true;
            }
        }
           
           System.out.println("La cantidad de cuadros a los que puede realizar un ataque son: "+ contador_ataques);
    }
    
  
    
}
