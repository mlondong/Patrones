package com.ar.builderComplex;

public class Pepsi extends Drink{

	@Override
	public _InterfacePacking packing() {
		// TODO Auto-generated method stub
		return super.packing();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Pepsi";
	}

	@Override
	public String toString() {
		return "Pepsi [packing()=" + packing().pack() + ", getName()=" + getName() + "]";
	}

	
}
