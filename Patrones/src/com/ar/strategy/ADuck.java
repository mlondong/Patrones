package com.ar.strategy;

public class ADuck extends Duck {

	


	@Override
	public void display() {
		System.out.println("Soy Aduck..");
	}

	@Override
	public void setformQuack(_QuackBehavior q) {
		super.setformQuack(q);
	}


	@Override
	public void performFly() {
		super.performFly();
	}

	@Override
	public void setformFly(_FlyBehavior fly) {
		super.setformFly(fly);
	}

	
	@Override
	public void swim() {
		super.swim();
	}
	

}
