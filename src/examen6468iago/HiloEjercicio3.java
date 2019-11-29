package examen6468iago;

public class HiloEjercicio3 extends Thread {

    private String nombre = "";
    static int cont = 2;
    HiloEjercicio3 h2;

    public HiloEjercicio3(String str) {
        super(str);

    }

    @Override
    public void run() {
        h2 = new HiloEjercicio3("Hilo " + cont);
        if (cont <= 3) {
            h2.start();
            cont++;
        }

        for (int i = 1; i <= 25; i++) {
            if (i == 25) {
                System.out.println(" iteracion " + i + " " + getName() + " TERMINA HILO ");
            } else {
                System.out.println(" iteracion " + i + " " + getName());
            }

            Thread.yield();
            try {
                sleep(((int) (Math.random() * 4 + 1)) * 100);

            } catch (InterruptedException ex) {
                System.out.println("No tengo sueño");
            }

            //duermo 1 segundo para que se refleje en pantalla el yield, si no lo escribe antes y lo pone desordenador
            try {
                sleep(1000);

            } catch (InterruptedException ex) {
                System.out.println("No tengo sueño");
            }


        }

    }
}
