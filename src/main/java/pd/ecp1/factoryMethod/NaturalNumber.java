package pd.ecp1.factoryMethod;

public abstract class NaturalNumber {
	private int value;
	private String[] textValue;

	public NaturalNumber(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}

	public String getTextValue() {
		if (this.value < textValue.length) {
			return textValue[this.value];
		} else {
			return "???";
		}
	}

	protected void setTextValue(String[] textValue) {
		this.textValue = textValue;
	}
}
