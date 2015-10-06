package pd.ecp1.state;

public class Preparado extends Estado{

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new Parado());
	}

	@Override
	public void iniciar(Conexion conexion) {}

	@Override
	public void abrir(Conexion conexion) {}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new Cerrado());
	}

	@Override
	public void recibir(Conexion conexion) {}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.setEstado(new Esperando());
	}


}
