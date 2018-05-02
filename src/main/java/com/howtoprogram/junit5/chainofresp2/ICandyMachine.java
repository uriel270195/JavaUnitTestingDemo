package com.howtoprogram.junit5.chainofresp2;

public abstract class ICandyMachine {
	abstract void setNextChain(ICandyMachine nextChain);
	abstract void dispense(ProductosMachine productsMachine);
	static int addProducts(ProductosMachine productsMachine, double money, double price) {
		int producto=0;
		while(money >= price) {
			money-=price;
			
			producto++;
		}
		productsMachine.setMoney(money);
		return producto;
	};
}
