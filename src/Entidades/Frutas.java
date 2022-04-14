package Entidades;

public class Frutas extends Producto {

private String unidadDeVenta;

public Frutas() {
    super();
}

public Frutas(String unidadDeVenta, String nombre, Integer precio) {
    super(nombre, precio);
    this.unidadDeVenta = unidadDeVenta;
}

public String getUnidadDeVenta() {
    return unidadDeVenta;
}

public void setUnidadDeVenta(String unidadDeVenta) {
    this.unidadDeVenta = unidadDeVenta;
}

@Override
public String toString() {
    return ("Nombre: " + nombre + " /// " + "Precio: $" + precio + " /// " + "Unidad de venta: " + unidadDeVenta);
}

}
