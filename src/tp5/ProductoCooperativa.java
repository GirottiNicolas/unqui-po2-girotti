package tp5;

public class ProductoCooperativa extends ProductoTradicional{
	
	public ProductoCooperativa(int stock, double precio) {
		super(stock, precio);
	}


	@Override
	public double getPrecio() {
		return precioBase - this.descuentoPorIVA(); 
	}
	
	
	public double descuentoPorIVA() {
		return precioBase / this.iva();
		
	}
	
	public int iva() {
		return 10;
	}
}