package com.ar.strategy;

public class CDuck extends Duck{

	@Override
	public void display() {
		System.out.println("Soy CDUCk...");

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

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		super.swim();
	}



}
