import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import demo.Calculator;

public class CalculatorTest {
	
	@Test
	public void testAdditionPositive() {
		Calculator calculator = new Calculator();
		int actualOutput = calculator.addition(6, 7);
		int expectedOutput = 13;
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testAdditionNegative() {
		Calculator calculator = new Calculator();
		int actualOutput = calculator.addition(-2, -5);
		int expectedOutput = -7;
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testAdditionZero() {
		Calculator calculator = new Calculator();
		int actualOutput = calculator.addition(0, 0);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testMultiplyPositive() {
		Calculator calculator = new Calculator();
		int actualOuput = calculator.multiply(4, 7);
		int expectedOutput = 28;
		assertEquals(expectedOutput, actualOuput);
	}
	
	@Test
	public void testMultiplyNegative() {
		Calculator calculator = new Calculator();
		int actualOuput = calculator.multiply(-4, -5);
		int expectedOutput = 20;
		assertEquals(expectedOutput, actualOuput);
	}
	
	@Test
	public void testMultiplyZero() {
		Calculator calculator = new Calculator();
		int actualOuput = calculator.multiply(4, 0);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOuput);
	}
}
