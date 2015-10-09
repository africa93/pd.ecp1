package pd.ecp1.texto;

public class Parrafo extends CompositeText {
    public Parrafo() {

    }

    @Override
    protected String dibujarFinal() {
        return "\n";
    }

    @Override
    public void add(Componente pf) {
        if (!pf.esCompuesto()) {
            componentes.add(pf);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean esCompuesto() {
        return true;
    }
}
