package hilos;

public class Hilos extends Thread {

    public Hilos(String name){
        super(name); 
    }
    public void run(){
     for (int i=0;i<10;i++)
         System.out.println(i+" "+getName());
         System.out.println("Aqui termina la ejecución del hilo "+getName());
    }
    public static void main(String[] args) {
        new Hilos("Ana").start();
        new Hilos("Juan").start();
        System.out.println("Ya se terminó la ejecución de los hilos");
    }
    
}
