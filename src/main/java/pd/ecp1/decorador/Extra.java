package pd.ecp1.decorador;

public abstract class Extra extends ComponenteVehiculo {

    protected ComponenteVehiculo componenteVehiculo;

    public Extra(String descripcion, double precio, ComponenteVehiculo componenteVehiculo) {
        super(descripcion, precio);
        this.componenteVehiculo = componenteVehiculo;
    }

}
