package pd.ecp1.state;

public class ConexionParado extends ConexionEstado {

	@Override
	public void parar(Conexion conexion) {}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new ConexionPreparado());
	}

	@Override
	public void abrir(Conexion conexion) {}

	@Override
	public void cerrar(Conexion conexion) {}

	@Override
	public void enviar(Conexion conexion, String msg) {}

	@Override
	public void recibir(Conexion conexion, int respuesta) {}

}
