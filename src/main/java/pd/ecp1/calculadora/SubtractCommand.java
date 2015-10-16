package pd.ecp1.calculadora;

import upm.jbb.IO;

public class SubtractCommand extends Operation {

    public SubtractCommand(Calculator calculator) {
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
