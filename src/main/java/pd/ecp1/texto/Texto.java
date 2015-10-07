package pd.ecp1.texto;

public class Texto extends CompositeText{
	private String texto;
	
	@Override
	public String dibujar(Boolean mayusculas) {
		if(mayusculas){
			return texto.toUpperCase() +"\n ---o---";
		}
		return texto +"\n ---o---";
	}

	@Override
	public void add(Componente pf) {
		
	}

}
