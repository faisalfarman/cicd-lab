package com.example.cicdlab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTests {

	Calculator calculator = new Calculator();


	@Test
	void addingTwoNumber() {
		int a = 2;
		int b = 5;
		int expected = 8;
		int result = calculator.add(a, b);

		Assertions.assertEquals(expected, result);
	}

	@Test
	void subtructingTwoNumber() {
		int a = 5;
		int b = 2;
		int expected = 3;
		int result = calculator.subtract(a, b);

		Assertions.assertEquals(expected, result);
	}

	@Test
	void multiplyTwoNumber() {
		int a = 5;
		int b = 2;
		int expected = 10;
		int result = calculator.multiply(a, b);

		Assertions.assertEquals(expected, result);
	}

	@Test
	void divideTwoNumber() {
		int a = 9;
		int b = 3;
		int expected = 3;
		double result = calculator.divide(a, b);

		Assertions.assertEquals(expected, result);
	}

	@Test
	void squareRootOfTwoNumber() {
		int a = 9;
		int expected = 3;
		double result = calculator.squareRootOf(a);

		Assertions.assertEquals(expected, result);
	}

	@Test
	void getAreaOfAGivenNumberWhereNumberIsGreaterThenZero() {
		int a = 3;
		double expected = 28.27;
		double result = calculator.getArea(a);
		Assertions.assertEquals(expected, result);
	}

	@Test
	void getAreaOfAGivenNumberWhereNumberIsLessThenZero() {
		int a = -1;
		double expected = Double.NaN;
		double result = calculator.getArea(a);
		Assertions.assertEquals(expected, result);

	}

	@Test
	void getCircumferenceOfAGivenNumberWhereNumberIsGreaterThenZero() {
		int a = 2;
		double expected = 12.57;
		double result = calculator.getCircumference(a);
		Assertions.assertEquals(expected, result);

	}

	@Test
	void getCircumferenceOfAGivenNumberWhereNumberIsLessThenZero() {
		int a = -2;
		double expected = Double.NaN;
		double result = calculator.getCircumference(a);
		Assertions.assertEquals(expected, result);

	}

	@Test
	void contextLoads() {
		Assertions.assertTrue(true);
	}

}



