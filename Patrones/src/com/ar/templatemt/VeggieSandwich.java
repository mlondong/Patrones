package com.ar.templatemt;

public class VeggieSandwich extends AbstractSandwich {


	public VeggieSandwich(){
		System.out.println("Creando Veggie Sandwich");
	}
	
	@Override
	public void addMeat() {
	}

	@Override
	public void addBreath() {
		System.out.println("Pan adicionado...");
	}

	@Override
	public void addCheese() {
		if(this.wannaCheese==true)	
			System.out.println("Queso adicionado...");		
		else
			System.out.println("Queso NO adicionado...");		

	}

	@Override
	public void addTomate() {
		if(this.wannaTomate==true)
			System.out.println("Tomate adicionado...");
		else
			System.out.println("Tomate No adicionado...");
		
	}


	@Override
	public boolean doyouWantChesse(boolean b) {
		return this.wannaCheese=b;
	}

	@Override
	public boolean doyouWantTomate(boolean b) {
		return this.wannaTomate=b;
		
	}

}
