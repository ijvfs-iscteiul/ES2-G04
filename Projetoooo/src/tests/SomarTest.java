package tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import app.App;

public class SomarTest {

	@Test
	public void test() {
		App test = new App();
		int valor = test.somar(2, 3);
		assertEquals(5, valor);
	}

}
