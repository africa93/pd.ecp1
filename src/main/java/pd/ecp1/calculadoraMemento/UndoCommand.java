package pd.ecp1.calculadoraMemento;

public class UndoCommand extends Operation {

	public UndoCommand(CalculatorMementable calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Deshacer";
	}

	@Override
	public void execute() {
		calculator.undo();
	}
}
