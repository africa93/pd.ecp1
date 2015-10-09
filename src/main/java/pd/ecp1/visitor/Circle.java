package pd.ecp1.visitor;

public class Circle extends Figure {
    private double ratio;

    public Circle(String description, double ratio) {
        super(description);
        this.ratio = ratio;
    }

    @Override
    public void accept(Visitor v) {
        v.visitCircle(this);
    }

    public double getRatio() {
        return ratio;
    }

}
