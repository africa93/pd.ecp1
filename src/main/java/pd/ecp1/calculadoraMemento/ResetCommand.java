package pd.ecp1.calculadoraMemento;

public class ResetCommand extends Operation {

	public ResetCommand(CalculatorMementable calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Resetear";
	}

	@Override
	public void execute() {
		calculator.reset();
	}

}
