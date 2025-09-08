package ar.edu.unq.po2.tp4.test.supermercado;



public class Producto {
	
	protected double precio;
	private String nombre;
	protected boolean esPrecioCuidado = false;
	
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}


	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}


	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	
	public void aumentarPrecio(double aumento) {
		this.precio = this.precio + aumento;
	}
}
