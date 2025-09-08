package ar.edu.unq.po2.tp4.test.supermercado;

public class ProductoPrimeraNecesidad extends Producto{

	
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio,esPrecioCuidado);	
		this.descuento = descuento;
	}
	
	public double getPrecio() {
		return  this.precio -(this.precio * (this.descuento / 100)) ;
	}
}