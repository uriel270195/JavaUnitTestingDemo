package com.howtoprogram.junit5.observablepractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DemoObservablesTest {
	int[] arrNumbers = {1,5,10,20};
	int[] testList = {};
	@Test
	@DisplayName("should Greater Than Ten")
	void shouldGreaterThanTen() {
		int[] listExpected = {20};
		int[] result= DemoObservables.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	@Test
	@DisplayName("should Duplicate")
	void shouldDuplicate() {
		int[] listExpected = {2,10,20,40};
		int[] result= DemoObservables.getDuplicateNumbers(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	@Test
	@DisplayName("should Validate Empty Duplicate")
	void shouldValidateEmptyDuplicate() {
		int[] listExpected = {};
		int[] result= DemoObservables.getDuplicateNumbers(testList);
		assertArrayEquals(listExpected,result);
	}
	@Test
	@DisplayName("should Validate Empty Greater Than Ten")
	void shouldValidateEmptyGreaterThanTen() {
		int[] listExpected = {};
		int[] result= DemoObservables.getGreaterThanTen(testList);
		assertArrayEquals(listExpected,result);
	}
}
