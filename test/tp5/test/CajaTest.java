package tp5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp5.caja.Caja;
import tp5.caja.Cliente;
import tp5.caja.ProductoCooperativa;
import tp5.caja.ProductoTradicional;



public class CajaTest {
	private Caja cajaSuper;
	private Cliente nicolas;
	private Cliente jose;
	private ProductoTradicional arroz;
	private ProductoCooperativa cerveza;
	
	
	@BeforeEach
	public void setUp() {
		cajaSuper = new Caja();
		nicolas = new Cliente();
		jose = new Cliente();
		arroz = new ProductoTradicional(1000,10.0);
		cerveza = new ProductoCooperativa(100,50.0);
		nicolas.agregarConsumible(arroz);
		nicolas.agregarConsumible(cerveza);
		jose.agregarConsumible(arroz);
	}
	
	
	@Test
	public void stockDeArroz() {
		cajaSuper.cobrar(nicolas);
		cajaSuper.cobrar(nicolas);
		cajaSuper.cobrar(jose);
		assertEquals(997, arroz.getStock());
	}
	
	
	@Test
	public void saldoAPagar() {
		cajaSuper.cobrar(nicolas);
		assertEquals(55, cajaSuper.getMontoAPagar());
	}
	
	
	@Test
	public void productoDeCooperativaConDescuento() {
		assertEquals(45.0, cerveza.getPrecio());	
	}
	
	
	@Test
	public void productoTradicional() {
		assertEquals(10, arroz.getPrecio());
	}
	
	
	
	
	
}
