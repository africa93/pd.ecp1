package pd.ecp1.visitor;

public class Triangle extends Figure {
	private double base;
	private double height;
	public Triangle(String description, double base, double height) {
		super(description);
		this.base=base;
		this.height=height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public void accept(Visitor v) {
		v.visitTriangle(this);
	}
	
}
