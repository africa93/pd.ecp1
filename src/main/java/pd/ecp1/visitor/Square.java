package pd.ecp1.visitor;

public class Square extends Figure {
	private double side;
	
	public Square(String description, double side) {
		super(description);
		this.side=side;
	}

	@Override
	public void accept(Visitor v) {
		v.visitSquare(this);
	}

	public double getSide() {
		return side;
	}
	

}
