package pd.ecp1.composite;

public class Multiplicar extends Operador{

	public Multiplicar(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}

	@Override
	public int operar() {
		return getExpresiones().get(0).operar()*getExpresiones().get(1).operar();
	}
	@Override
	public String toString() {
		return getExpresiones().get(0).toString()+"x"+getExpresiones().get(1).toString();
	}
}
