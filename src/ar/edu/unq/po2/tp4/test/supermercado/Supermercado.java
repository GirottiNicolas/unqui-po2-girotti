package ar.edu.unq.po2.tp4.test.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombreSuper;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombreSuper, String direccion) {
		this.nombreSuper = nombreSuper;
		this.direccion = direccion;
	}

	public void agregarProducto(Producto product) {
		productos.add(product);
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}

	public double getPrecioTotal() {
		return productos.stream().
				mapToDouble(producto -> producto.getPrecio()).
				sum();
	}

}
