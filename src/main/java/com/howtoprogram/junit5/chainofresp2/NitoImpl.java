package com.howtoprogram.junit5.chainofresp2;

public class NitoImpl extends ICandyMachine{

	private  ICandyMachine chain;
	private double price=8;
	@Override
	public void setNextChain(ICandyMachine nextChain) {
		// TODO Auto-generated method stub
		this.chain = nextChain;
	}

	@Override
	public void dispense(ProductosMachine productsMachine) {
		// TODO Auto-generated method stub
		double money=productsMachine.getMoney();
		productsMachine.setNitos(ICandyMachine.addProducts(productsMachine, money, this.price));
		if(this.chain != null) {
			this.chain.dispense(productsMachine);
		}
	}

}
