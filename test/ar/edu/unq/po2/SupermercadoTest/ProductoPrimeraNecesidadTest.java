package ar.edu.unq.po2.SupermercadoTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.test.supermercado.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad queso;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false,10.0);
		arroz = new ProductoPrimeraNecesidad("Arroz", 3d, false,50.0);
		queso = new ProductoPrimeraNecesidad("Queso", 10d, false,8.0);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
		assertEquals(1.5, arroz.getPrecio());
		assertEquals(9.2, queso.getPrecio());
		
	}
}
