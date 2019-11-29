package examen6468iago;

import static java.lang.Thread.sleep;

public class HiloEjercicio1 extends Thread {

    private String nombre = "";

    public HiloEjercicio1(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 25; i++) {
            if (i == 25) {
                System.out.println(" iteracion " + i + " " + getName() + " TERMINA HILO ");
            } else {
                System.out.println(" iteracion " + i + " " + getName());
            }
            try {
                int n = (int) (Math.random() * 5) + 1;
//                System.out.println(n);
                sleep(n * 1000);
            } catch (InterruptedException ex) {
                System.out.println("no tengo sueño");
            }
        }
    }
}
