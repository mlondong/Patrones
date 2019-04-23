package com.ar.builderComplex;

public class Coke extends Drink {

	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Coke";
	}

	@Override
	public _InterfacePacking packing() {
		// TODO Auto-generated method stub
		return super.packing();
	}

	@Override
	public String toString() {
		return "Coke [getName()=" + getName() + ", packing()=" + packing().pack() + "]";
	}

	
}
