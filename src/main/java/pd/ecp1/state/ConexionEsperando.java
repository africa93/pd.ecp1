package pd.ecp1.state;

public class ConexionEsperando extends ConexionEstado {

	public ConexionEsperando() {
		super(Estado.ESPERANDO);
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		conexion.getLink().recibir(respuesta);
		if (respuesta == 0) {
			conexion.setEstado(new ConexionPreparado());
		} else {
			conexion.setEstado(new ConexionCerrado());
		}
	}
}
