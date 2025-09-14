package tp5;




public class Caja {
	
	private double monto = 0;
	
	
	public double getMontoAPagar() {
		return monto;
	}
	
	public void registrar(ProductoTradicional producto) {
		this.sumarAlTotal(producto.getPrecio());
		producto.decrementarStock();
	}
	
	public void cobrar(Cliente cliente) {
		cliente.getProductos().stream().
								forEach(producto -> this.registrar(producto));
								
	}
	
	public void sumarAlTotal(double precio) {
		monto += precio;
	}
}
