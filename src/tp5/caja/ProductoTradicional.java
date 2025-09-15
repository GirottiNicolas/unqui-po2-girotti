package tp5.caja;

import tp5.interfaces.Consumible;

public class ProductoTradicional implements Consumible {
	

	private int stock;
	protected double precioBase;
	
	
	public ProductoTradicional(int stock,double precio) {
		this.stock = stock;
		this.precioBase = precio;
	}
	
	public double getPrecio() {
		return precioBase;
	}
		
	void decrementarStock() {
		// Consultar validaciones ...this.validarStock, o se podria crear una validador? O un ProductoSinStock
		stock--;
	}
	
	boolean haySuficienteStock() {
		return stock > 0;
	}
	
	
	public int getStock() {
		return stock;
	}

	@Override
	public void registrar() {
		this.decrementarStock();
		
	}

	@Override
	public double montoAPagar() {
		return this.getPrecio();
	}

}