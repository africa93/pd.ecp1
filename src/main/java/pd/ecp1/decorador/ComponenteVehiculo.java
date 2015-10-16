package pd.ecp1.decorador;

import java.util.ArrayList;

public abstract class ComponenteVehiculo {
    private ArrayList<Extra> extras;

    protected String descripcion;

    protected double precio;

    public ComponenteVehiculo(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
        extras = new ArrayList<Extra>();
    }

    public abstract void view();

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
