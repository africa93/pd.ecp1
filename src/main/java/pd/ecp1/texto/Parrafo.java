package pd.ecp1.texto;

import java.util.ArrayList;

public class Parrafo extends CompositeText {
	private ArrayList<Caracter> caracteres;
	
	public Parrafo(){
		caracteres = new ArrayList<Caracter>();
	}

	@Override
	public String dibujar(Boolean mayusculas) {
		if(mayusculas){
			return dibujaParrafo().toUpperCase()+"\n";
		}
		return dibujaParrafo()+"\n";
	}

	@Override
	public void add(Componente pf) {
		if(!pf.esCompuesto()){
			caracteres.add((Caracter) pf);
		}else{
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public boolean esCompuesto() {
		return true;
	}
	
	private String dibujaParrafo(){
		String parrafo ="";
		for(int i=0; i<caracteres.size(); i++){
			parrafo+=caracteres.get(i);
		}
		return parrafo;
	}
}
