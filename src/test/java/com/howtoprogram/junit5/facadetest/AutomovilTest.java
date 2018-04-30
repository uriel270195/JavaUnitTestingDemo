package com.howtoprogram.junit5.facadetest;

import org.junit.jupiter.api.Test;

import com.howtoprogram.junit5.facade.AutomovilFacade;


public class AutomovilTest {
	@Test
	void encenderAuto() {
		AutomovilFacade.arrancar();
	}
}
