package com.howtoprogram.junit5.chainofresp2;

public abstract class ICandyMachine {
	abstract void setNextChain(ICandyMachine nextChain);
	abstract void dispense(ProductosMachine productsMachine);
	int addProducts(ProductosMachine productsMachine, double money) {
		int gansitos=0;
		while(money >= this.price) {
			money-=this.price;
			gansitos++;
		}
		return 0;
	};
}
