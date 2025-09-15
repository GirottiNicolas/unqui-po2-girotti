package tp5.facturas;

public class Servicio extends Factura {
	
	private double costoPorUnidad;
	private int cantUnidadesConsumidas;
	
	
	public Servicio(String periodo,double costoPorUnidad, int cantUnidadesConsumidas, AgenciaRecaudadora agenciaRecaudadora ) {
		super(periodo, agenciaRecaudadora);
		this.costoPorUnidad = costoPorUnidad;
		this.cantUnidadesConsumidas = cantUnidadesConsumidas;

	}
	
	@Override
	public double montoAPagar() {
		return costoPorUnidad * cantUnidadesConsumidas;
	}
	
	
}
