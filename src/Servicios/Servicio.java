package Servicios;

import Entidades.Bebidas;
import Entidades.Frutas;
import Entidades.HigienePersonal;
import Entidades.Producto;
import java.util.ArrayList;
import java.util.Collections;

public class Servicio {

private final ArrayList<Producto> listaProductos = new ArrayList();


public void hacerTodo(){
    cargarLista();
    mostrarLista();
    ordenamiento();
}
public void cargarLista() {
    Bebidas bebida1 = new Bebidas();
    bebida1.setNombre("Coca-Cola Zero");
    bebida1.setVolumen(1.5);
    bebida1.setPrecio(20);
    listaProductos.add(bebida1);
    Bebidas bebida2 = new Bebidas();
    bebida2.setNombre("Coca-Cola");
    bebida2.setVolumen(1.5);
    bebida2.setPrecio(18);
    listaProductos.add(bebida2);
    HigienePersonal higienePersonal = new HigienePersonal();
    higienePersonal.setNombre("Shampoo Sedal");
    higienePersonal.setContenido(500);
    higienePersonal.setPrecio(19);
    listaProductos.add(higienePersonal);
    Frutas fruta1 = new Frutas();
    fruta1.setNombre("Frutillas");
    fruta1.setUnidadDeVenta("kg");
    fruta1.setPrecio(64);
    listaProductos.add(fruta1);
}

public void mostrarLista() {
    for (Producto producto : listaProductos) {
        System.out.println(producto);
    }
    System.out.println("=============================");
}

public void ordenamiento() {
    Collections.sort(listaProductos);
    String productoMasCaro = listaProductos.get(listaProductos.size() - 1).getNombre();
    String productoMasBarato = listaProductos.get(0).getNombre();
    System.out.println("El producto mas caro: " + productoMasCaro);
    System.out.println("El producto mas barato: " + productoMasBarato);

}
}
