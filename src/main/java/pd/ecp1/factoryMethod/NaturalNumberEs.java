package pd.ecp1.factoryMethod;

public class NaturalNumberEs extends NaturalNumber {

    private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEs(int value) {
        super(value);
        this.setTextValue(textValue);
    }

}
