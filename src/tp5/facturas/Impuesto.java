package tp5.facturas;

public class Impuesto extends Factura {
	
	
	private int tasa;
	
	public Impuesto(String periodo, AgenciaRecaudadora agenciaRecaudadora, int tasa) {
		super(periodo, agenciaRecaudadora);
		this.tasa = tasa;
	}

	
	@Override
	public double montoAPagar() {
		return tasa;
	}

}
