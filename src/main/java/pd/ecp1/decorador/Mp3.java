package pd.ecp1.decorador;

public class Mp3 extends Extra {

	public Mp3(String descripcion, double precio, ComponenteVehiculo componenteVehiculo) {
		super(descripcion, precio, componenteVehiculo);
	}

	@Override
	public void view() {
		System.out.println("MP3 ");
	}

}
