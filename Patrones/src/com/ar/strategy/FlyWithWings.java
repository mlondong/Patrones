package com.ar.strategy;

public class FlyWithWings implements _FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Estoy volando...");
	}

}
