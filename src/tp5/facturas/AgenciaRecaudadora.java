package tp5.facturas;

import tp5.interfaces.Agencia;

public class AgenciaRecaudadora implements Agencia {

	@Override
	public void registrarPago(Factura factura) {
		System.out.println("Factura registrada. Total del pago $" + factura.montoAPagar() + "-> Periodo: " + factura.getPeriodo() );
		
	}

}
