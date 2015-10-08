package pd.ecp1.calculadoraMemento;

public class CalculatorMementable implements Mementable<MementoCalculadora> {
	private int total;

	public CalculatorMementable() {
		this.reset();
	}

	public int getTotal() {
		return total;
	}

	protected void setTotal(int total) {
		this.total = total;
	}

	public void add(int valor) {
		this.setTotal(this.total + valor);
	}

	public void subtract(int valor) {
		this.setTotal(this.total - valor);
	}

	public void reset() {
		this.setTotal(0);
	}

	public void undo() {
		// TODO Auto-generated method stub

	}

	public void save() {
		// TODO Auto-generated method stub

	}

	@Override
	public MementoCalculadora createMemento() {
		return new MementoCalculadora(total);
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		this.total = memento.getValor();
	}
}
