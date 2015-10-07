package pd.ecp1.texto;

public class Parrafo extends CompositeText {
	String parrafo;
	
	public Parrafo(){
		
	}

	@Override
	public String dibujar(Boolean mayusculas) {
		if(mayusculas){
			return parrafo.toUpperCase();
		}
		return parrafo;
	}

	@Override
	public void add(Componente pf) {
		throw new UnsupportedOperationException();
	}
}
