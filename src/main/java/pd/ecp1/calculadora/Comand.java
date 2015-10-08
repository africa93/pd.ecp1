package pd.ecp1.calculadora;

public abstract class Comand implements Comando {
	
	protected Calculator calculator;
	
	public Comand(Calculator calculator){
		this.calculator = calculator;
	}
}
