package tp5.facturas;

import tp5.interfaces.Consumible;



public abstract class Factura implements Consumible {
	
	protected String periodo;
	AgenciaRecaudadora agenciaRecaudadora;
	
	
	public Factura(String periodo, AgenciaRecaudadora agenciaRecaudadora) {
		this.agenciaRecaudadora = agenciaRecaudadora;
		this.periodo = periodo;
	}
	
	@Override
	public void registrar() {
		agenciaRecaudadora.registrarPago(this);
		
	}


	public String getPeriodo() {
		return periodo;
	}


}
