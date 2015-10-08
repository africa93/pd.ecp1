package pd.ecp1.calculadoraMemento;

import upm.jbb.IO;

public class PrintCommand extends Operation {

	public PrintCommand(CalculatorMementable calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Imprimir";
	}

	@Override
	public void execute() {
		IO.getIO().print(calculator.getTotal());
	}

}
