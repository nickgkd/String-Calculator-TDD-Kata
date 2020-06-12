package com.incubyte.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestCalculator extends StringCalculatorApplicationTests {
	
	@Autowired
	private Calculator calc;
	
	@Test
	public void numberIsEmpty() {
		assertEquals(calc.sum(""), 0);
	}
	
	@Test
	public void singleNumber() {
		assertEquals(calc.sum("1"), 1);
	}
	
	@Test
	public void multipleNumbers() {
		assertEquals(calc.sum("1,2"), 3);
	}

}
