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
		assertEquals(Calculator.sum("//.\n1.2.3"), 6);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void exceptionIfNumbersIsNegative() throws Exception {
		Calculator.sum("-1");
	}
	
	@Test
	public void ignoreNumbersGreaterThan1000() throws Exception {
		assertEquals(Calculator.sum("10,1001"),10);
		assertEquals(Calculator.sum("1001,10002,2"), 2);
		assertEquals(Calculator.sum("1001,10002,2000,999"), 999);
		assertEquals(Calculator.sum("1001,10002"), 0);
	}
	
	@Test
	public void acceptsMultiCharDelimiter() throws Exception {
		assertEquals(Calculator.sum("//[***]\n1***2***3"), 6);
	}
}
