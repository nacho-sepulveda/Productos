package Entidades;

public class HigienePersonal extends Producto {

private Integer contenido;

public HigienePersonal() {
    super();
}

public HigienePersonal(Integer contenido, String nombre, Integer precio) {
    super(nombre, precio);
    this.contenido = contenido;
}

public Integer getContenido() {
    return contenido;
}

public void setContenido(Integer contenido) {
    this.contenido = contenido;
}

@Override
public String toString() {
    return ("Nombre: " + nombre + " /// " + "Contenido:" + contenido + "ml" + " /// " + "Precio: $" + precio);
}

}
