package pd.ecp1.state;

public class ConexionParado extends ConexionEstado {

	public ConexionParado(Estado estado) {
		super(estado);
	}
	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new ConexionPreparado(Estado.PREPARADO));
	}
	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new ConexionPreparado(Estado.PARADO));
	}

}
