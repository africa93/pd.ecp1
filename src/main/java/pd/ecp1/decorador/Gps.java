package pd.ecp1.decorador;

public class Gps extends Extra {

	public Gps(String descripcion, double precio, ComponenteVehiculo componenteVehiculo) {
		super(descripcion, precio, componenteVehiculo);
	}

	@Override
	public void view() {
		System.out.println("GPS ");
	}

	public double getPrecio() {
		return getPrecio() + componenteVehiculo.getPrecio();
	}

	public String getDescripcion() {
		return componenteVehiculo.getDescripcion() + descripcion;
	}

}
