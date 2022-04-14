

package Entidades;

public class Bebidas extends Producto{
    private Double volumen;

    public Bebidas() {
        super();
    }
    
    public Bebidas(Double volumen, String nombre, Integer precio) {
        super(nombre, precio);
        this.volumen = volumen;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return ("Nombre: " + nombre + " /// " + "Litros:" + volumen + " /// " + "Precio: $" + precio);
    }
    
    
    
}
