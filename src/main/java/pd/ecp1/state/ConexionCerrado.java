package pd.ecp1.state;

public class ConexionCerrado extends ConexionEstado {

	
	public ConexionCerrado() {
		super(Estado.CERRADO);
	}

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new ConexionPreparado());
	}
	
	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new ConexionCerrado());
	}
	
}
