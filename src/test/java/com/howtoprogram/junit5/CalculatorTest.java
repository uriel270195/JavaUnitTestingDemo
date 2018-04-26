package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
	private static Calculator calculator, calculatorMok;
	private static int testNormalNumber1,testNormalNumber2,testNormalDiv1,testNormalDiv2,testNormalDivCeroNull1,testNormalDivCeroNull2;
	@BeforeAll
	  static void setUpAll() {//siempre
		calculator=new Calculator();
		calculatorMok = mock(Calculator.class);
		testNormalNumber1=5;
		testNormalNumber2=6;
		testNormalDiv1=10;
		testNormalDiv2=5;
		testNormalDivCeroNull1=0;
		testNormalDivCeroNull2=5;
	  }
	@Test
	  @DisplayName("suma")
	  void suma() {
		int res=testNormalNumber1+testNormalNumber2;
		assertEquals(calculator.suma(testNormalNumber1, testNormalNumber2), res);
	}
	
	@Test
	  @DisplayName("resta")
	  void resta() {
		int res=testNormalNumber1-testNormalNumber2;
		assertEquals(calculator.resta(testNormalNumber1, testNormalNumber2), res);
	}
	
	@Test
	  @DisplayName("multiplicacion")
	  void multiplicacion() {
		int res=testNormalNumber1*testNormalNumber2;
		assertEquals(calculator.multiplicacion(testNormalNumber1, testNormalNumber2), res);
	}
	
	@Test
	  @DisplayName("division")
	  void division() {
		int res=testNormalDiv1/testNormalDiv2;
		assertEquals(calculator.division(testNormalDiv1, testNormalDiv2),res);
	}
	@Test
	  @DisplayName("division cero")
	  void divisionCero() {
		assertEquals(calculator.division(testNormalDivCeroNull1, testNormalDivCeroNull2), 0);
	}
	@Test
	  @DisplayName("division null")
	  void divisionNull() {
		assertEquals(calculator.division(testNormalDivCeroNull2, testNormalDivCeroNull1), 0);
	}
	/////////////////////////////////////////
	@Test
	  void sumaMockito() {
		when(calculatorMok.suma(20, 20)).thenReturn(80);
		int res=calculatorMok.suma(20, 20);
		assertEquals(res, 80);
	}
	
	@Test
	  void restaMockito() {
		when(calculatorMok.resta(10, 5)).thenReturn(30);
		int res=calculatorMok.resta(10, 5);
		assertEquals(res, 30);
	}
	
	@Test
	  void multiplicacionMockito() {
		when(calculatorMok.multiplicacion(6, 10)).thenReturn(200);
		int res=calculatorMok.multiplicacion(6, 10);
		assertEquals(res, 200);
	}
	
	@Test
	  void divisionMockito() {
		when(calculatorMok.division(10, 5)).thenReturn(100);
		int res=calculatorMok.division(10, 5);
		assertEquals(res, 100);
	}
}
