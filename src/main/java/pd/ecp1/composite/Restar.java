package pd.ecp1.composite;

public class Restar extends Operador {

    public Restar(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public int operar() {
        return getExpresiones().get(0).operar() - getExpresiones().get(1).operar();
    }

    @Override
    public String getOperador() {
        return "-";
    }

}
