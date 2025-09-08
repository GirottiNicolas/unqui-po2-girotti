package ar.edu.unq.po2.tp4.trabajador;

public class IngresoPorHorasExtras extends Ingreso{
	
	private int cantHorasExtras;
	
	public IngresoPorHorasExtras(String mes, String concepto, int monto,int cantHorasExtras) {
		super(mes, concepto, monto);
		this.cantHorasExtras = cantHorasExtras;
	}
	
	public int getCantidadHorasExtras() {
		return cantHorasExtras;
	}
	
	public int getMontoImponible() {
		return 0;
	}
}
