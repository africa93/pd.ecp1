package pd.ecp1.visitor;

public class VisitNumberOfSides extends Visitor {
    private double num_sides;

    @Override
    public void visitTriangle(Triangle triangle) {
        this.num_sides += 3;
    }

    @Override
    public void visitSquare(Square square) {
        this.num_sides += 4;
    }

    @Override
    public void visitCircle(Circle circle) {
        this.num_sides += Double.POSITIVE_INFINITY;
    }

    public double getNum_sides() {
        return num_sides;
    }

}
