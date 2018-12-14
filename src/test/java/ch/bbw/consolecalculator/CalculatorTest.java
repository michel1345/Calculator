package ch.bbw.consolecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
	Calculator testee;

	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 30) == 40);
	}

}
