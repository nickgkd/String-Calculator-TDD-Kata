package com.incubyte.StringCalculator;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public int sum(String numbers) throws Exception {

		if (numbers.isEmpty()) {

			return 0;

		} else {
			Stream<String> num = Arrays.stream(numbers.split(",|\n"));
			return num.mapToInt(Integer::parseInt).sum();
		}
	
	}
}	
