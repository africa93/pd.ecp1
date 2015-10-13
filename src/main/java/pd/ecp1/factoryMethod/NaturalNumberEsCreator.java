package pd.ecp1.factoryMethod;

public class NaturalNumberEsCreator extends NaturalNumberCreator {
    @Override
    public NaturalNumber createNaturalNumber(int value) {
        return new NaturalNumberEs(value);
    }
}
