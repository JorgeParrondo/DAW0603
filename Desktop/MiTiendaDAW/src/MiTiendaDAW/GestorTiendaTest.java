package MiTiendaDAW;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorTiendaTest {
    GestorTienda gestor = new GestorTienda();
	@Test
	void testCalcularDescuento() {
		 assertEquals(10, gestor.calcularDescuento(100, 10), 0.01);
	     assertEquals(5, gestor.calcularDescuento(100, 5), 0.01);
	     assertEquals(0, gestor.calcularDescuento(100, 4), 0.01);
	}

	@Test
	void testCategorizarProducto() {
		 assertEquals("Económico", gestor.categorizarProducto(9.99));
	     assertEquals("Estándar", gestor.categorizarProducto(10));
	     assertEquals("Estándar", gestor.categorizarProducto(49.99));
	     assertEquals("Premium", gestor.categorizarProducto(50));
	}

	@Test
	void testBuscarProducto() {
		 String[] inventario = {"Manzana", "Platano", "Cereales"};
	     assertEquals("Platano", gestor.buscarProducto(inventario, "Platano"));
	     assertNull(gestor.buscarProducto(inventario, "Colacao"));
	}

}
