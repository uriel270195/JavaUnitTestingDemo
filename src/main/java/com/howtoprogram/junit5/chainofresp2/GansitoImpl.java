package com.howtoprogram.junit5.chainofresp2;

public class GansitoImpl extends ICandyMachine{

	private  ICandyMachine chain;
	private double price=12;
	public void setNextChain(ICandyMachine nextChain) {
		// TODO Auto-generated method stub
		this.chain = nextChain;
	}

	public void dispense(ProductosMachine productsMachine) {
		// TODO Auto-generated method stub
		double money=productsMachine.getMoney();
		productsMachine.setGansitos(ICandyMachine.addProducts(productsMachine, money, this.price));
		if(this.chain != null) {
			this.chain.dispense(productsMachine);
		}
	}

}
