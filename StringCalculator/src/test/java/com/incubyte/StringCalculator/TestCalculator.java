package com.incubyte.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestCalculator extends StringCalculatorApplicationTests {
	
//	@Autowired
//	private Calculator calc;
	
	@Test
	public void numberIsEmpty() throws Exception {
		assertEquals(Calculator.sum(""), 0);
	}
	
	@Test
	public void sumSingleNumber() throws Exception {
		assertEquals(Calculator.sum("1"), 1);
	}
	
	@Test
	public void sumTwoNumbersDelimetedByComma() throws Exception {
		assertEquals(Calculator.sum("1,2"), 3);
	}
	
	@Test
	public void sumThreNumbersDelimetedByComma() throws Exception {
		assertEquals(Calculator.sum("1,2,3"),6);
	}
	
	@Test
	public void sumTwoNumbersDelimetedByNewline() throws Exception {
		assertEquals(Calculator.sum("1\n2"), 3);
	}
	
	@Test
	public void sumThreeNumbersDelimetedByNewlineOrComma() throws Exception {
		assertEquals(Calculator.sum("1\n2,3"), 6);
	}
	
	@Test
	public void sumTwoNumbersUsingDifferentDelimeter() throws Exception {
		assertEquals(Calculator.sum("//;\n1;2"), 3);
	}
}
