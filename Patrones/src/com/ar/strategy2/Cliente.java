package com.ar.strategy2;

public class Cliente {

	public static void main(String[] args) {

		Context c = new Context(10000,2);
		c.setChoseOperation(new Suma());
		int a = c.result();
		System.out.println("Valor " + a);
		
		c.setChoseOperation(new Multipicacion());
		int b = c.result();
		System.out.println("Valor " + b);
		
	
		c.setChoseOperation(new Resta());
		int z = c.result();
		System.out.println("Valor " + z);
	
		
		
	}

}
