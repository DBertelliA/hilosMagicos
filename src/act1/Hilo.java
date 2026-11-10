package act1;

public class Hilo implements Runnable{
    private int valor;
    private NumeroOculto nm;

    public Hilo(int valor, NumeroOculto nm) {
        this.valor = valor;
        this.nm = nm;
    }

    @Override
    public void run() {
        int result = nm.comparador(valor);

        if(result == 1){
            System.out.println("Ya lo han adivinado");
        }else if (result == 0){
            System.out.println("Intentalo de nuevo");
        }else {
            System.out.println("Ocupado");
        }
    }
}
