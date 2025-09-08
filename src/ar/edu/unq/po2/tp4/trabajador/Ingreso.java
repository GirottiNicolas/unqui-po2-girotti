package ar.edu.unq.po2.tp4.trabajador;

public class Ingreso {
	private String mes;
	private String concepto;
	private int monto;
	
	public Ingreso(String mes, String concepto, int monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	public String getMes() {
		return mes;
	}
	
	public int getMontoImponible() {
		return monto;
	}
	
	public int getMonto() {
		return monto;
	}
	
}
