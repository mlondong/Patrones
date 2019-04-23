package com.ar.templatemt;

public class Cliente {

	public static void main(String[] args) {
		AbstractSandwich it = new ItalianSandwich();
		it.doyouWantTomate(false);
		it.doyouWantChesse(false);
		it.makeSandwich();
		System.out.println(it);
		
		System.out.println();
	
		
		AbstractSandwich vg = new VeggieSandwich();
		vg.doyouWantChesse(false);
		vg.makeSandwich();
		System.out.println(vg);
		
		System.out.println();
				
		
		AbstractSandwich ch= new ChickenSandwich();
		ch.doyouWantChesse(false);
		ch.makeSandwich();
		System.out.println(ch);
	
		
	}

}
