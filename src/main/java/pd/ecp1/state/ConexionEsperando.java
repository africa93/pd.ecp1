package pd.ecp1.state;

public class ConexionEsperando extends ConexionEstado {

	@Override
	public void parar(Conexion conexion) {}

	@Override
	public void iniciar(Conexion conexion) {}

	@Override
	public void abrir(Conexion conexion) {}

	@Override
	public void cerrar(Conexion conexion) {}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		conexion.getLink().recibir(respuesta);
		if(respuesta==0){
			conexion.setEstado(new ConexionPreparado());
		}else{
			conexion.setEstado(new ConexionCerrado());
		}
	}

	@Override
	public void enviar(Conexion conexion, String msg) {}

}
