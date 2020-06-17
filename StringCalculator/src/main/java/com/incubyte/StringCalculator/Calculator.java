package com.incubyte.StringCalculator;

import java.util.Arrays;
import java.util.stream.IntStream;


public class Calculator {

	private String delimeter;
	private String numbers;

	private Calculator(String delimeter, String numbers) {
		super();
		this.delimeter = delimeter;
		this.numbers = numbers;
	}

	
	private int sum() {
		if(getNumbers().anyMatch(n->n<0)) {
			throw new IllegalArgumentException();
		} 
		return getNumbers().filter(n->n<1000).sum();
	}
	
	private IntStream getNumbers() {
		return Arrays.stream(numbers.split(delimeter)).mapToInt(Integer::parseInt);
	}

	public static int sum(String input) throws Exception {
		if (input.isEmpty()) {
			return 0;
		} else {
			return parseInput(input).sum();
		}
	}

	private static Calculator parseInput(String input) {
		if (input.startsWith("//")) {
			String[] div = input.split("\n", 2);
			return new Calculator(div[0].substring(2), div[1]);
		} else {
			return new Calculator(",|\n", input);
		}
	}
}
