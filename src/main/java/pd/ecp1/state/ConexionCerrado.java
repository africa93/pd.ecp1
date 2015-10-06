package pd.ecp1.state;

public class ConexionCerrado extends ConexionEstado {

	
	public ConexionCerrado(Estado estado) {
		super(estado);
	}

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new ConexionPreparado(Estado.PREPARADO));
	}
	
	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new ConexionPreparado(Estado.CERRADO));
	}
	
}
