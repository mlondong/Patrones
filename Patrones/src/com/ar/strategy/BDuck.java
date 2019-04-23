package com.ar.strategy;

public class BDuck extends Duck {

	@Override
	public void swim() {
		super.swim();
	}

	@Override
	public void display() {
		System.out.println("Soy Bduck..");
	}

	@Override
	public void performFly() {
		// TODO Auto-generated method stub
		super.performFly();
	}

	@Override
	public void setformFly(_FlyBehavior fly) {
		// TODO Auto-generated method stub
		super.setformFly(fly);
	}

	@Override
	public void performQuack() {
		// TODO Auto-generated method stub
		super.performQuack();
	}

	@Override
	public void setformQuack(_QuackBehavior q) {
		// TODO Auto-generated method stub
		super.setformQuack(q);
	}

	
}
