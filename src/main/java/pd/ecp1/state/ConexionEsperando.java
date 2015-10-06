package pd.ecp1.state;

public class ConexionEsperando extends ConexionEstado {

	public ConexionEsperando(Estado estado) {
		super(estado);
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		conexion.getLink().recibir(respuesta);
		if(respuesta==0){
			conexion.setEstado(new ConexionPreparado(Estado.PREPARADO));
		}else{
			conexion.setEstado(new ConexionCerrado(Estado.CERRADO));
		}
	}
}
