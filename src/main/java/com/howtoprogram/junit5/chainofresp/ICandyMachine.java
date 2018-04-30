package com.howtoprogram.junit5.chainofresp;

public interface ICandyMachine {
	void setNextChain(ICandyMachine nextChain);
	void dispense(ProductosMachine productsMachine);
}
