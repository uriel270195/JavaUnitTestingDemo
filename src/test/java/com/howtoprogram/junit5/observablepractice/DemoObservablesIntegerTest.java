package com.howtoprogram.junit5.observablepractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DemoObservablesIntegerTest {
	Integer[] arrNumbers = {1,5,10,20};
	Integer[] testList = {};
	@Test
	@DisplayName("should Greater Than Ten")
	void shouldGreaterThanTen() {
		Integer[] listExpected = {20};
		Integer[] result= DemoObservablesInteger.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	@Test
	@DisplayName("should Duplicate")
	void shouldDuplicate() {
		Integer[] listExpected = {2,10,20,40};
		Integer[] result= DemoObservablesInteger.getDuplicateNumbers(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	@Test
	@DisplayName("should Validate Empty Duplicate")
	void shouldValidateEmptyDuplicate() {
		Integer[] listExpected = {};
		Integer[] result= DemoObservablesInteger.getDuplicateNumbers(testList);
		assertArrayEquals(listExpected,result);
	}
	@Test
	@DisplayName("should Validate Empty Than Ten")
	void shouldValidateEmptyGreaterThanTen() {
		Integer[] listExpected = {};
		Integer[] result= DemoObservablesInteger.getGreaterThanTen(testList);
		assertArrayEquals(listExpected,result);
	}
}
