package pd.ecp1.composite;

import java.util.ArrayList;

public abstract class Operador extends Expresion {
    private ArrayList<Expresion> expresiones;

    public Operador(Expresion expresion1, Expresion expresion2) {
        expresiones = new ArrayList<>(2);
        expresiones.add(expresion1);
        expresiones.add(expresion2);
    }

    protected ArrayList<Expresion> getExpresiones() {
        return expresiones;
    }

    public String toString() {
        return "(" + getExpresiones().get(0).toString() + getOperador() + getExpresiones().get(1).toString() + ")";
    }

    public abstract String getOperador();

}
