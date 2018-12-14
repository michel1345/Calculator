package ch.bbw.consolecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	
	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 30) == 40);
	}
	
	@Test 
	public void testSubtraktionZweiPositiveIsOk() {
		assertTrue(testee.subtraction(30, 10) == 20);
	}
	
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.division(50, 10) == 5);
	}
	
	@Test
	public void testMultiplikationZweiPositiveIsOk() {
		assertTrue(testee.multiplikation(5, 10) == 50);
	}

}
