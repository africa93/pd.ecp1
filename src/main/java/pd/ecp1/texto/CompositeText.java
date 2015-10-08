package pd.ecp1.texto;

import java.util.ArrayList;

public abstract class CompositeText extends Componente{
	
	protected ArrayList<Componente> componentes;
	
	public CompositeText(){
		componentes = new ArrayList<Componente>();
	}
	
	@Override
	public String dibujar(Boolean mayusculas) {
		String result="";
		for (Componente componente : componentes) {
			result+=componente.dibujar(mayusculas);
		}
		return result+dibujarFinal();
	}

	protected abstract String dibujarFinal();
	
}
