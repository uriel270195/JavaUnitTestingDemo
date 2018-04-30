package com.howtoprogram.junit5.chainofresp;

public class NitoImpl implements ICandyMachine{

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
		int nitos=0;
		double money=productsMachine.getMoney();
		while(money >= this.price) {
			money-=this.price;
			nitos++;
		}
		productsMachine.setNitos(nitos);
		productsMachine.setMoney(money);
		if(this.chain != null) {
			this.chain.dispense(productsMachine);
		}
	}

}
