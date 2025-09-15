package tp5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp5.Caja;
import tp5.Cliente;
import tp5.ProductoTradicional;
import tp5.facturas.AgenciaRecaudadora;
import tp5.facturas.Impuesto;
import tp5.facturas.Servicio;


public class ServiciosEImpuestosTest {
	private Caja cajaSuper;
	private Cliente nicolas;
	private ProductoTradicional queso;
	private Servicio facturaDeLuz;
	private Impuesto abl;
	private AgenciaRecaudadora edesur;
	private AgenciaRecaudadora municipio;
	
	
	@BeforeEach
	public void setUp() {
		edesur = new AgenciaRecaudadora();
		municipio = new AgenciaRecaudadora();
		cajaSuper = new Caja();
		nicolas = new Cliente();
		queso = new ProductoTradicional(1000,10.0);
		facturaDeLuz = new Servicio("Enero",150, 100,edesur);
		abl = new Impuesto("Febrero",municipio, 5000);
		nicolas.agregarConsumible(queso);
		nicolas.agregarConsumible(facturaDeLuz);
		nicolas.agregarConsumible(abl);
	}
	
	
	@Test
	public void pagarServicios() {
		cajaSuper.cobrar(nicolas);
		assertEquals(999, queso.getStock());
	}
}
