package pd.ecp1.factoryMethod;

public class NaturalNumberFr extends NaturalNumber {

    private static final String[] textValue = {"nul", "un", "deux", "trois", "quatre", "cinq"};

    public NaturalNumberFr(int value) {
        super(value);
        this.setTextValue(textValue);
    }

}
