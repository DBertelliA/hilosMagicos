package act1;

public class Ejecutado {
    public static void main(String[] args) {
        NumeroOculto nmC = new NumeroOculto(numAleatorio());

        for (int i = 0; i < 1000; i++) {
            Thread th1 = new Thread(new Hilo(numAleatorio(), nmC));
            System.out.println(i);
            th1.start();
            if (nmC.isTerminado()){
                break;
            }
        }


    }
    public static int numAleatorio(){
        return ((int) Math.round(Math.random() * 100));
    }
}
