package com.howtoprogram.junit5.chainofresp2;

public class LollipopImpl extends ICandyMachine{
	
	private  ICandyMachine chain;
	private double price=5;

	@Override
	public void setNextChain(ICandyMachine nextChain) {
		// TODO Auto-generated method stub
		this.chain = nextChain;
		
	}

	@Override
	public void dispense(ProductosMachine productsMachine) {
		// TODO Auto-generated method stub
		double money=productsMachine.getMoney();
		productsMachine.setPaletas(ICandyMachine.addProducts(productsMachine, money, this.price));
		if(this.chain != null) {
			this.chain.dispense(productsMachine);
		}
		
	}

}
