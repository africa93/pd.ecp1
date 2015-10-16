package pd.ecp1.VisitorEj1;

public class Visitor2 extends Visitor {
    private int cont_A;

    private int cont_B;

    public Visitor2() {
        this.cont_A = 0;
        this.cont_B = 0;
    }

    @Override
    public void visitElementA(ElementA e) {
        this.cont_A++;
    }

    @Override
    public void visitElementB(ElementB e) {
        this.cont_B++;
    }

    public int getAs() {
        return this.cont_A;
    }

    public int getBs() {
        return this.cont_B;
    }

}
