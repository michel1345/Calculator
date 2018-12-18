package ch.bbw.consolecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	private Calculator test;

	// Summe

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

	@Test
	public void testSubtraktionZweiNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.subtraction(-7, -6) == -1);
	}

	@Test
	public void testSubtraktionPositivUndNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.subtraction(10, -5) == 15);
	}

	@Test
	public void testSubtraktionZeroIsOk() {
		test = new Calculator();
		assertTrue(test.subtraction(5, 5) == 0);
	}

	@Test
	public void testSubtraktionMaxValueUndZeroIsOk() {
		test = new Calculator();
		assertTrue(test.subtraction(Integer.MAX_VALUE, 0) == 2147483647);
	}

	@Test
	public void testSubtraktionMinValueUndZeroIsOk() {
		test = new Calculator();
		assertTrue(test.subtraction(Integer.MIN_VALUE, 0) == -2147483648);
	}

	@Test
	public void testSubtraktionMaxValueUnd1IsMinValueIsFalse() {
		test = new Calculator();
		assertTrue(test.subtraction(Integer.MIN_VALUE, 1) == Integer.MAX_VALUE);
	}

	@Test
	public void testSubtraktionMinValueUndMaxValueIsFalse() {
		test = new Calculator();
		assertTrue(test.subtraction(Integer.MIN_VALUE, Integer.MAX_VALUE) == 1);
	}

	// Multiplikation
	@Test
	public void testMultiplikationZweiPositiveIsOk() {
		assertTrue(testee.multiplikation(10, 10) == 100);
	}

	@Test
	public void testMultiplikationZweiNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.multiplikation(-30, -2) == 60);
	}

	@Test
	public void testMultiplikationPositivUndNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.multiplikation(-30, 2) == -60);
	}

	@Test
	public void testMultiplikationZeroIsOk() {
		test = new Calculator();
		assertTrue(test.multiplikation(5, 0) == 0);
	}

	@Test
	public void testMultiplikationZeroIsOk2() {
		test = new Calculator();
		assertTrue(test.multiplikation(0, 5) == 0);
	}

	@Test
	public void testMultiplikation0Und0IsOk() {
		test = new Calculator();
		assertTrue(test.multiplikation(0, 0) == 0);
	}

  /*@Test
	public void testMultiplikationMaxValue2TimesIsFalse() {
		test = new Calculator();
		assertTrue(test.multiplikation(Integer.MAX_VALUE, 2) == -2);

	}*/

	@Test
	public void testMultiplikationMaxValueUnd1IsMinValueIsOk() {
		test = new Calculator();
		assertTrue(test.multiplikation(Integer.MAX_VALUE, -1) == -2147483647);
	}

	/*public void testMultiplikationMaxValuewithMaxValueisFalse() {
		test = new Calculator();
		assertTrue(test.multiplikation(Integer.MAX_VALUE, Integer.MAX_VALUE) == 1);
	}*/

	// Division
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.division(50, 10) == 5);
	}

	@Test
	public void testDivisionZweiNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.division(-15, -3) == 5);
	}

	@Test
	public void testDivisionPositivUndNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.division(-45, 9) == -5);
	}

	@Test
	public void testDivisionZweiGleicheZahlenIsOk() {
		test = new Calculator();
		assertTrue(test.division(10, 10) == 1);
	}

	/*@Test
	public void testDivisionDurch0IsFalse() throws ArithmeticException {
		test = new Calculator();
		assertTrue(test.division(5, 0) == 0);
	}*/

	@Test
	public void testDivision0DurchDividisorIsOk() {

		test = new Calculator();
		assertTrue(test.division(0, 5) == 0);
	}

	@Test
	public void testDivision0DurchIsOk() {

	}

	/*@Test
	public void testDivisionMaxValueUndMinValueIsOk() {
		test = new Calculator();
		assertTrue(test.division(Integer.MAX_VALUE, Integer.MIN_VALUE) == 0);
	}*/

	@Test
	public void testDivisionMaxValueUnd1IsOk() {
		test = new Calculator();
		assertTrue(test.division(Integer.MIN_VALUE, 1) == Integer.MIN_VALUE);
	}

}
