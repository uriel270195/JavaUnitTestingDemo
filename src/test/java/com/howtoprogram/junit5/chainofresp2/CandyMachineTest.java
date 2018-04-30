package com.howtoprogram.junit5.chainofresp2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CandyMachineTest {
	@Test
	void validateCandyMachineChains() {
		ICandyMachine c1=new GansitoImpl();
		ICandyMachine c2=new NitoImpl();
		ICandyMachine c3=new LollipopImpl();
		
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		
		ProductosMachine productsMachine= new ProductosMachine();
		productsMachine.setMoney(1119);
		c1.dispense(productsMachine);
		System.out.println(String.format("Gansitos %d", productsMachine.getGansitos()));
		System.out.println(String.format("Nitos %d", productsMachine.getNitos()));
		System.out.println(String.format("Paletas %d", productsMachine.getPaletas()));
		System.out.println(String.format("Money %f", productsMachine.getMoney()));
		assertEquals(93,productsMachine.getGansitos());
		assertEquals(0,productsMachine.getNitos());
		assertEquals(0,productsMachine.getPaletas());
		assertEquals(3,productsMachine.getMoney());
	}
}
