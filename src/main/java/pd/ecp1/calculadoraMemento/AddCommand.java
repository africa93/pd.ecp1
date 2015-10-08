package pd.ecp1.calculadoraMemento;

import upm.jbb.IO;

public class AddCommand extends Operation {

	public AddCommand(CalculatorMementable calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Sumar";
	}

	@Override
	public void execute() {
		int sumando = IO.getIO().readInt();
		calculator.add(sumando);
	}

}
