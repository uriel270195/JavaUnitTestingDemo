package com.howtoprogram.junit5.fizzbuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class fizzBuzzTest {
	int num1,num2;
	@Test
	@DisplayName("validate fizz buzz")
	void ValidateFizzBuzz() {
		num1=1;
		num2=15;
		String[] Expected = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
		String[] result= fizzBuzz.fb(num1,num2);
		assertArrayEquals(Expected,result);
	}
	@Test
	@DisplayName("validate numbers")
	void validateNumbers() {
		num1=1;
		num2=15;
		boolean Expected = true;
		boolean result= fizzBuzz.validate(num1,num2);
		assertEquals(Expected,result);
	}
	@Test
	@DisplayName("validate numbers Error")
	void validateNumbersError() {
		num1=0;
		num2=15;
		boolean Expected = false;
		boolean result= fizzBuzz.validate(num1,num2);
		assertEquals(Expected,result);
	}
	@Test
	@DisplayName("validate fizz buzz Error")
	void ValidateFizzBuzzError() {
		num1=0;
		num2=15;
		String[] Expected = {"Error"};
		String[] result= fizzBuzz.fb(num1,num2);
		assertArrayEquals(Expected,result);
	}
}
