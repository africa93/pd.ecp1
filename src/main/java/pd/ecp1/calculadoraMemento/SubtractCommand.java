package pd.ecp1.calculadoraMemento;

import upm.jbb.IO;

public class SubtractCommand extends Operation {
	
	public SubtractCommand(CalculatorMementable calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Restar";
	}

	@Override
	public void execute() {
		int sumando = IO.getIO().readInt();
		calculator.subtract(sumando);
	}

}
