package pd.ecp1.state;

public class ConexionPreparado extends ConexionEstado {

	public ConexionPreparado() {
		super(Estado.PREPARADO);
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new ConexionParado());
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new ConexionCerrado());
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.setEstado(new ConexionEsperando());
	}

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new ConexionPreparado());
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new ConexionPreparado());
	}
}
