package pd.ecp1.texto;

public class Texto extends CompositeText{
	
	@Override
	public String dibujarFinal() {
		return "\n ---o---";
	}

	@Override
	public void add(Componente pf) {
		if(pf.esCompuesto()){
			componentes.add(pf);
		}else{
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public boolean esCompuesto() {
		return true;
	}

}
