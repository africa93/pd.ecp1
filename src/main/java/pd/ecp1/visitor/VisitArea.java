package pd.ecp1.visitor;

public class VisitArea extends Visitor {
	private double area;

	public VisitArea() {
		this.area = 0;
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		area += (triangle.getBase() * triangle.getHeight());
	}

	@Override
	public void visitSquare(Square square) {
		area += (square.getSide() * square.getSide());
	}

	@Override
	public void visitCircle(Circle circle) {
		area += (3.14 * (circle.getRatio() * circle.getRatio()));
	}

	public double getArea() {
		return area;
	}

}
