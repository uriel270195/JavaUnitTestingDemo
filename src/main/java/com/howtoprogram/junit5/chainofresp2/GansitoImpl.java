package com.howtoprogram.junit5.chainofresp2;

public class GansitoImpl implements ICandyMachine{

	private  ICandyMachine chain;
	private double price=12;
	public void setNextChain(ICandyMachine nextChain) {
		// TODO Auto-generated method stub
		this.chain = nextChain;
	}

	public void dispense(ProductosMachine productsMachine) {
		// TODO Auto-generated method stub
		ICandyMachine icm;
		double money=productsMachine.getMoney();
		icm.addProducts(productsMachine, money);
		int gansitos=0;
		while(money >= this.price) {
			money-=this.price;
			gansitos++;
		}
		productsMachine.setGansitos(gansitos);
		productsMachine.setMoney(money);
		if(this.chain != null) {
			this.chain.dispense(productsMachine);
		}
	}

}
