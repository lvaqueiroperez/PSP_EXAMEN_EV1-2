package examenpsp_ev1_2;

public class ExamenPSP_Ev1_2 {

    public static void main(String[] args) throws InterruptedException {

        ClaseHilos h1 = new ClaseHilos("HILO1");
        ClaseHilos h2 = new ClaseHilos("HILO2");
        ClaseHilos h3 = new ClaseHilos("HILO3");

        h3.start();
        h3.join();
        h2.start();
        h2.join();
        h1.start();
        h1.join();

        System.out.println("TERMINA PROGRAMA PRINCIPAL");

    }

}
