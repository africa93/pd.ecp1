package pd.ecp1.calculadora;

public abstract class Operation implements Comando {

    protected Calculator calculator;

    public Operation(Calculator calculator) {
        this.calculator = calculator;
    }
}
