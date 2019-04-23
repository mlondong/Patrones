package com.ar.strategy;

public class Quack implements _QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack...");
	}

}
