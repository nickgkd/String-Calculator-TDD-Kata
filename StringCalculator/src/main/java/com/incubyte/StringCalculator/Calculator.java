package com.incubyte.StringCalculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public int sum(String numbers) {

		if (numbers.isEmpty()) {

			return 0;

		} else if (numbers.length() == 1) {

			return Integer.parseInt(numbers);

		} else {

			String[] num = numbers.split(",");

			int num1 = Integer.parseInt(num[0]);
			int num2 = Integer.parseInt(num[1]);

			return num1 + num2;

		}
	}
	


}
