package tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import app.App;

public class SquareTest {

	@Test
	public void test() {
		App test = new App();
		int output = test.square(5);
		assertEquals(25, output);
	}

}
