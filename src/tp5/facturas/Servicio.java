package tp5.facturas;

public class Servicio extends Factura {
	
	private double costoPorUnidad;
	private int cantUnidadesConsumidas;
	
	
	@Override
	public double montoAPagar() {
		return costoPorUnidad * cantUnidadesConsumidas;
	}
	
	
}
