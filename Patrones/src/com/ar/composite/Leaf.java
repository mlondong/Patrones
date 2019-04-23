package com.ar.composite;

public class Leaf implements Component {

	
	private  int price;
	private String name;
	
	
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}


	@Override
	public void geValues() {
		System.out.println("Name: " + this.name +" Precio:"+ this.price);
	}

		

}
