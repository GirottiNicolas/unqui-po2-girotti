package tp5.caja;

import tp5.interfaces.Consumible;

public class Caja {
	
	private double monto = 0;
	
	
	public double getMontoAPagar() {
		return monto;
	}
	
	public void registrar(Consumible consumible) {
		consumible.registrar();
		this.sumarAlTotal(consumible.montoAPagar());
		System.out.println("Monto a pagar por el cliente $" + this.getMontoAPagar());
		
	}
	
	public void cobrar(Cliente cliente) {
		cliente.getConsumibles().stream().
								forEach(producto -> this.registrar(producto));
								
	}
	
	public void sumarAlTotal(double precio) {
		monto += precio;
	}
}
