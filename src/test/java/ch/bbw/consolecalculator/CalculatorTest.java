package ch.bbw.consolecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	private Calculator test;
	
	//Summe
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 30) == 40);
	}
	
	@Test
	public void testSummeZweiNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.summe(-7, -7) == -14);
	}

	@Test
	public void testSummePositivUndNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.summe(9, -7) == 2);
	}

	@Test
	public void testSummeZeroIsOk() {
		test = new Calculator();
		assertTrue(test.summe(-10, 10) == 0);
	}

	@Test
	public void testSummeMaxValueUndMinValueIsOk() {
		test = new Calculator();
		assertTrue(test.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}

	@Test
	public void testSummeMaxValueUndZeroIsOk() {
		test = new Calculator();
		assertTrue(test.summe(Integer.MAX_VALUE, 0) == 2147483647);
	}

	@Test
	public void testSummeMaxValueUndIsMinValueIsFalse1() {
		test = new Calculator();
		assertTrue(test.summe(Integer.MAX_VALUE, 1) == Integer.MIN_VALUE);
	}

	@Test
	public void testSummeMaxValueIsFalse() {
		test = new Calculator();
		assertTrue(test.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == -2);
	}

	
	
	// Subtraktion
	@Test 
	public void testSubtraktionZweiPositiveIsOk() {
		assertTrue(testee.subtraction(30, 10) == 20);
	}
	
	
	//Division
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.division(50, 10) == 5);
	}
	
	//Multiplikation
	@Test
	public void testMultiplikationZweiPositiveIsOk() {
		assertTrue(testee.multiplikation(5, 10) == 50);
	}

}
