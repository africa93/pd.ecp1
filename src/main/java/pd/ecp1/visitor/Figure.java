package pd.ecp1.visitor;

public abstract class Figure {
	private String description;
	
	public Figure(String description){}
	
	public abstract void accept(Visitor v);
	
	public String Description(){
		return description;
	}
}
