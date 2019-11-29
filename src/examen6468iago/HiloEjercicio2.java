package examen6468iago;

public class HiloEjercicio2 extends Thread {

    private String nombre = "";
    static int cont = 2;

    public HiloEjercicio2(String str, boolean con) {
        super(str);

    }

    @Override
    public void run() {
        HiloEjercicio2 h2 = new HiloEjercicio2("Hilo " + cont, true);
        if (cont <= 3) {
            h2.start();
            cont++;
        }
         try {
            h2.join();
          
            

        } catch (InterruptedException ex) {
        }
        for (int i = 1; i <= 25; i++) {
    
            System.out.println(" iteracion "+i+" "+getName());
            try {
                sleep(((int) (Math.random() * 5 + 1)) * 1000);
            } catch (InterruptedException ex) {
                System.out.println("No tengo sueño");
            }
        }
        System.out.println("TERMINA " + getName());
       
    }
}
