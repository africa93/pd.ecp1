package pd.ecp1.state;

public class ConexionParado extends ConexionEstado {

	public ConexionParado() {
		super(Estado.PARADO);
	}
	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new ConexionPreparado());
	}
	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new ConexionPreparado());
	}

}
