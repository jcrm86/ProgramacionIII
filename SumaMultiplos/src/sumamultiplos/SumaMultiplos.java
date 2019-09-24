/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumamultiplos;

/**
 *
 * @author Juan Camilo
 */
public class SumaMultiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sumaMultiplosTotal(3,7,1000000);
        //sumaMultiplosTotalAnd(3,7,1000000);
        sumaMultiplosTotalSumas(3,7,1000000);
        //sumaMultiplosPorCiclo(3,7,10);
    }
    
    
    public static void sumaMultiplosTotal(int multiplo1, int multiplo2, int ciclos){
        int sumador=0;
        for(int i=0; i< ciclos;i++){
            if(i%multiplo1==0){
                //System.out.println("multiplo de 3 "+i);
                sumador=sumador+i;
            }
            if(i%multiplo2==0){
                //System.out.println("multiplo de 7 "+i);
                sumador=sumador+i;
            }
        }
        System.out.println("La suma total de los multiplos de "+multiplo1+" y "+multiplo2+" es "+sumador);
    
    }
    
       public static void sumaMultiplosTotalSumas(int multiplo1, int multiplo2, int ciclos){
        int sumador=0;
        for(int i=0; i< ciclos;i=i+multiplo1){
                //ystem.out.println("multiplo de 3 "+i);
                sumador=sumador+i;
            
            
        }
        for(int i=0; i< ciclos;i=i+multiplo2){
                //System.out.println("multiplo de 3 "+i);
                sumador=sumador+i;
            
            
        }
        System.out.println("La suma total de los multiplos de "+multiplo1+" y "+multiplo2+" es "+sumador);
    
    }
     public static void sumaMultiplosTotalAnd(int multiplo1, int multiplo2, int ciclos){
        int sumador=0;
        for(int i=0; i< ciclos;i++){
            if(i%multiplo1==0 && i%multiplo2==0){
                //System.out.println("multiplo de 3 "+i);
                sumador=sumador+i;
            }
         
        }
        System.out.println("La suma total de los multiplos de "+multiplo1+" y "+multiplo2+" es "+sumador);
    
    }
    
       public static void sumaMultiplosPorCiclo(int multiplo1, int multiplo2, int ciclos){
        int sumador=0;
        int multiplicacion=0;
        int contador=1;
        do{
            multiplicacion=multiplo1*contador;
            sumador=sumador+multiplicacion;
            contador++;
             System.out.println("contador de 3 "+contador+" multiplicacion "+multiplicacion);
        }while(multiplicacion < ciclos);
        multiplicacion=0;
        contador=1;
        do{
            multiplicacion=multiplo2*contador;
            sumador=sumador+multiplicacion;
            contador++;
            System.out.println("contador de 7 "+contador+" multiplicacion "+multiplicacion);
        }while(multiplicacion < ciclos);
        System.out.println("La suma total de los multiplos de "+multiplo1+" y "+multiplo2+" es "+sumador);
    
    }
}
