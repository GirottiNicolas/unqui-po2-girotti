package tp5.facturas;

import tp5.interfaces.Consumible;



public abstract class Factura implements Consumible {
	
	private String periodo;
	AgenciaRecaudadora agenciaRecaudadora;
	

	@Override
	public void registrar() {
		agenciaRecaudadora.registrarPago(this);
		
	}


	public String getPeriodo() {
		return periodo;
	}


}
