package pd.ecp1.state;

public class ConexionPreparado extends ConexionEstado{

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new ConexionParado());
	}

	@Override
	public void iniciar(Conexion conexion) {}

	@Override
	public void abrir(Conexion conexion) {}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new ConexionCerrado());
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.setEstado(new ConexionEsperando());
	}


}
