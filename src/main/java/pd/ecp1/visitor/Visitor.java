package pd.ecp1.visitor;

public abstract class Visitor {
	public abstract void visitTriangle(Triangle triangle);
	public abstract void visitSquare(Square square);
	public abstract void visitCircle(Circle circle);
}
