package com.ar.builderComplex;

public abstract class Drink implements _ItemProduct  {

	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public _InterfacePacking packing() {
		return new Bottle();
	}

}
