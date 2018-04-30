package com.howtoprogram.junit5.chainofresp2;

public class LollipopImpl implements ICandyMachine{
	
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
		int lillipop=0;
		double money=productsMachine.getMoney();
		while(money >= this.price) {
			money-=this.price;
			lillipop++;
		}
		productsMachine.setPaletas(lillipop);
		productsMachine.setMoney(money);
		if(this.chain != null) {
			this.chain.dispense(productsMachine);
		}
		
	}

}
