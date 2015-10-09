package pd.ecp1.composite;

public class Numero extends Expresion {
    private int cifra;

    public Numero(int cifra) {
        this.cifra = cifra;
    }

    @Override
    public int operar() {
        return cifra;
    }

    @Override
    public String toString() {
        return Integer.toString(cifra);
    }

}
