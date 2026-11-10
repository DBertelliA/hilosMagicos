package act1;

public class NumeroOculto {
    private int valorQueHoldea;
    private boolean terminado = false;

    public NumeroOculto(int valorQueHoldea) {
        this.valorQueHoldea = valorQueHoldea;
    }

    public synchronized int comparador(int i){
        if(terminado){return -1;}
        if(valorQueHoldea == i){
            terminado = true;
            return 1;
        }else{
            return 0;
        }
    }

    public boolean isTerminado() {
        return terminado;
    }
}
