package pd.ecp1.state;

public class ConexionPreparado extends ConexionEstado{

	public ConexionPreparado(Estado estado) {
		super(estado);
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new ConexionParado(Estado.PARADO));
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new ConexionCerrado(Estado.CERRADO));
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.setEstado(new ConexionEsperando(Estado.ESPERANDO));
	}
	
	@Override
	public void abrir(Conexion conexion){
		conexion.setEstado(new ConexionEsperando(Estado.PREPARADO));
	}
	
	@Override
	public void iniciar(Conexion conexion){
		conexion.setEstado(new ConexionEsperando(Estado.PREPARADO));
	}
}
