package tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import app.App;

public class DividirTeste {

	@Test
	public void test() {
		App test = new App();
		double valor = test.dividir(9, 3);
		assertEquals(3, valor);
	}

}
