package ar.edu.unq.po2.tp4.trabajador;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

public class Trabajador {
	
	private ImpuestoAlTrabajador impuesto;
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public Trabajador(ImpuestoAlTrabajador impuesto) {
		this.impuesto = impuesto;
	}
	
	
	// Suma de ingresos parametrizada para evitar duplicacion de codigo
	public int sumarIngresos(ToIntFunction<Ingreso> bloque) {
	    return ingresos.stream()
	                   .mapToInt(bloque)
	                   .sum();
	}
	
	
	// Consultar si es valido
	public int getTotalPercibido() {
		return this.sumarIngresos(ingreso -> ingreso.getMonto());
	}
	
	// Sino, deberia duplicar este metodo
	public int getMontoImponible() {
		return ingresos.stream().
				mapToInt(ingreso -> ingreso.getMontoImponible()).
				sum();
	}
	
	public double getImpuestoAPagar() {
		return impuesto.montoAPagar(this.getMontoImponible());
	}
	
	public void registrarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
}
