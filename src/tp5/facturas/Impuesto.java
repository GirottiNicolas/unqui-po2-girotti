package tp5.facturas;

public class Impuesto extends Factura {
	
	private int tasa;
	
	@Override
	public double montoAPagar() {
		return tasa;
	}

}
