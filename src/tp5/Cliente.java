package tp5;

import java.util.ArrayList;
import java.util.List;



public class Cliente {
	
	private List<ProductoTradicional> productos = new ArrayList<ProductoTradicional>();
	
	public List<ProductoTradicional> getProductos(){
		return productos;
	}
	
	public void agregarProducto(ProductoTradicional producto) {
		productos.add(producto);
	}
}
