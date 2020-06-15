package com.incubyte.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestCalculator extends StringCalculatorApplicationTests {
	
	@Autowired
	private Calculator calc;
	
	@Test
	public void numberIsEmpty() throws Exception {
		assertEquals(calc.sum(""), 0);
	}
	
	@Test
	public void sumSingleNumber() throws Exception {
		assertEquals(calc.sum("1"), 1);
	}
	
	@Test
	public void sumTwoNumbersDelimetedByComma() throws Exception {
		assertEquals(calc.sum("1,2"), 3);
	}
	
	@Test
	public void sumThreNumbersDelimetedByComma() throws Exception {
		assertEquals(calc.sum("1,2,3"),6);
	}
	
	@Test
	public void sumTwoNumbersDelimetedByNewline() throws Exception {
		assertEquals(calc.sum("1\n2"), 3);
	}
	
	@Test
	public void sumThreeNumbersDelimetedByNewlineOrComma() throws Exception {
		assertEquals(calc.sum("1\n2,3"), 6);
	}
	

}
