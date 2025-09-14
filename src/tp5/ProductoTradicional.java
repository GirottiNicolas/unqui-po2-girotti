package tp5;

public class ProductoTradicional {
	
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
		// Consultar validaciones ...this.validarStock();
		stock--;
	}

	public Integer getStock() {
		
		return stock;
	}

}