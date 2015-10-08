package pd.ecp1.decorador;

public class Vehiculo extends ComponenteVehiculo{

	private String modelo;
	private String marca;
	
	public Vehiculo(String descripcion, double precio) {
		super(descripcion, precio);
		this.modelo = modelo;
		this.marca = marca;
	}

	@Override
	public void view() {
		System.out.println(modelo+ " ");
	}
	
	public double getPrecio(){
		return precio;
	}
	
}
