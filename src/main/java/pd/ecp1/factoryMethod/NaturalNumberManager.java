package pd.ecp1.factoryMethod;

public class NaturalNumberManager {
	private NaturalNumber naturalNumber;
	private NaturalNumberCreator creator;

	public void createFigure(int value) {
		this.naturalNumber = this.creator.createNaturalNumber(value);
	}

	public void setCreator(NaturalNumberCreator creator) {
		this.creator = creator;
	}

	public NaturalNumber getNaturalNumber() {
		return naturalNumber;
	}
}
