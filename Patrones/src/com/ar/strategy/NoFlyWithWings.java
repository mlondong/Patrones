package com.ar.strategy;

public class NoFlyWithWings implements _FlyBehavior {

	@Override
	public void fly() {
		System.out.println("NO puedo volar...");
	}

}
