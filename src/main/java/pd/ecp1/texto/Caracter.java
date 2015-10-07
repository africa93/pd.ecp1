package pd.ecp1.texto;

public class Caracter extends Componente{
	private char c;
	
	public Caracter(char c){
		this.c=c;
	}
	public char getChar(){
		return c;
	}
	@Override
	public String dibujar(Boolean mayusculas) {
		return Character.toString(Character.toUpperCase(c));
	}
	@Override
	public void add(Componente pf) {}
	
	
}
