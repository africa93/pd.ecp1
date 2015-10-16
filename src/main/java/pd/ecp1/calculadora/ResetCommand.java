package pd.ecp1.calculadora;

public class ResetCommand extends Operation {

    public ResetCommand(Calculator calculator) {
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
