package pd.ecp1.calculadora;

import upm.jbb.IO;

public class PrintCommand extends Operation {

	public PrintCommand(Calculator calculator) {
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
