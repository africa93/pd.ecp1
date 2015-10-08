package pd.ecp1.calculadoraMemento;

public abstract class Operation implements Comando {

	protected CalculatorMementable calculator;

	public Operation(CalculatorMementable calculator) {
		this.calculator = calculator;
	}
}
