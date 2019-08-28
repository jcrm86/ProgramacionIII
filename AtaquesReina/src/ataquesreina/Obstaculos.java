/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ataquesreina;

/**
 *
 * @author Juan Camilo
 */
public class Obstaculos {
    
      //funcion que verifica el arreglo de obstaculos
    public boolean validarObstaculos(int x, int y, int arrayObstaculos[][], int r_x, int r_y){
        for (int[] arrayObstaculo : arrayObstaculos) {
            if (arrayObstaculo[0] == x && arrayObstaculo[1] == y || (r_x==x && r_y==y)) {
                return true;
            }
        }
        return false;
    }
}
