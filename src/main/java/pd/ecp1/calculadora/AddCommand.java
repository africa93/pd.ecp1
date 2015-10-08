package pd.ecp1.calculadora;

import upm.jbb.IO;

public class AddCommand extends Comand {
	
	public AddCommand(Calculator calculator) {
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
