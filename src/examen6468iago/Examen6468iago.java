package examen6468iago;

public class Examen6468iago {

    public static void main(String[] args) {
    //1
        System.out.println("Ejercicio1");
        HiloEjercicio1 hilo = new HiloEjercicio1("Hilo 1");
        HiloEjercicio1 hilo2 = new HiloEjercicio1("Hilo 2");
        HiloEjercicio1 hilo3 = new HiloEjercicio1("Hilo 3");
        
        hilo.start();
        hilo2.start();
        hilo3.start();

        try {
            hilo.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException ex) {
            System.out.println("No quiero esperar");
        }
            
        System.out.println("TERMINA EL MAIN");
        System.out.println("");
            
    //2     
        System.out.println("Ejercicio2");       
        HiloEjercicio2 hilo12 = new HiloEjercicio2("hilo 1", true);
        hilo12.start();

        try {
            hilo12.join();
        } catch (InterruptedException ex) {
            System.out.println("no quiero esperar");
        }
        System.out.println("TERMINA EL MAIN");
        System.out.println("");
        
    //3    
        System.out.println("Ejercicio3");        
          HiloEjercicio3 hilo13 = new HiloEjercicio3("hilo 1");
          hilo13.start();
    }

}
