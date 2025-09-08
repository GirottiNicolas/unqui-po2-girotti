package ar.edu.unq.po2.tp4.trabajador;

public class ImpuestoAlTrabajador {
	
	private int tasaDeImpuesto;
	
	
	public ImpuestoAlTrabajador(int tasaDeImpuesto) {
		this.tasaDeImpuesto = tasaDeImpuesto;
	}
	
	public double montoAPagar(double montoImponible) {
		
		return  montoImponible * (this.tasaDeImpuesto / 100.0 );
	}
	
	public int getTasaDeImpuesto() {
		return tasaDeImpuesto;
	}

}
