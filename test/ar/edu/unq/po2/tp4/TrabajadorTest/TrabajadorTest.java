package ar.edu.unq.po2.tp4.TrabajadorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp4.trabajador.ImpuestoAlTrabajador;
import ar.edu.unq.po2.tp4.trabajador.Ingreso;
import ar.edu.unq.po2.tp4.trabajador.IngresoPorHorasExtras;
import ar.edu.unq.po2.tp4.trabajador.Trabajador;

public class TrabajadorTest {
	private Trabajador nicolas;
	private Trabajador alejandra;
	private ImpuestoAlTrabajador impuesto;
	private IngresoPorHorasExtras ingresoHorasExtras;
	private Ingreso ingresoSeptiembre;
	private Ingreso ingresoAgosto;
	
	@BeforeEach
	public void setUp() {
		impuesto = new ImpuestoAlTrabajador(2);
		ingresoSeptiembre = new Ingreso("Septiembre","Sueldo mensual", 50000);
		ingresoHorasExtras = new IngresoPorHorasExtras("Septiembre","Sueldo mensual", 50000,100);
		nicolas = new Trabajador(impuesto);
		nicolas.registrarIngreso(ingresoSeptiembre);
		alejandra = new Trabajador(impuesto);
		alejandra.registrarIngreso(ingresoHorasExtras);
		ingresoAgosto = new Ingreso("Agosto","Sueldo mensual", 75000);
		
		
	}
	
	
	@Test
	public void testIngresoDeTrabajador() {
		assertEquals(2, impuesto.getTasaDeImpuesto());
		assertEquals(50000, ingresoSeptiembre.getMonto());
		assertEquals(50000, ingresoSeptiembre.getMontoImponible());
		assertEquals(50000, nicolas.getTotalPercibido());
		assertEquals(1000, nicolas.getImpuestoAPagar());
	}
	
	
	@Test
	public void testTrabajadorConExtras() {
		assertEquals(2, impuesto.getTasaDeImpuesto());
		assertEquals(50000, ingresoHorasExtras.getMonto());
		assertEquals(0, ingresoHorasExtras.getMontoImponible());
		assertEquals(50000, alejandra.getTotalPercibido());
		assertEquals(0, alejandra.getImpuestoAPagar());
	}
	
	
	@Test
	public void testTrabajadorConExtrasEIngresoDeSueldo() {
		alejandra.registrarIngreso(ingresoAgosto);
		assertEquals(125000, alejandra.getTotalPercibido());
		assertEquals(1500, alejandra.getImpuestoAPagar());
		assertEquals(75000, alejandra.getMontoImponible());
		
	}
}
