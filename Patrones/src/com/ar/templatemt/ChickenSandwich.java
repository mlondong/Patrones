package com.ar.templatemt;

public class ChickenSandwich  extends AbstractSandwich{

	
	public ChickenSandwich (){
		System.out.println("Creando Sandwich de Pollo....");	
	} 
	
	
	@Override
	public void addMeat() {
		System.out.println("Pollo adicionado....");	
	}

	@Override
	public void addBreath() {
		System.out.println("Pan adicionado....");	
	}

	@Override
	public void addCheese() {
		if(this.wannaCheese==true){
				System.out.println("Con Queso adicionado....");	
		}else{
				System.out.println("Sin Queso adicionado....");	
			
			}
	}

	
	
	@Override
	public void addTomate() {
		if(this.wannaTomate==true){
			System.out.println("Con Tomate adicionado....");	
	}else{
			System.out.println("Sin Tomate  adicionado....");	
		}
	}

	@Override
	public boolean doyouWantChesse(boolean b) {
		return this.wannaCheese=b;
	}

	@Override
	public boolean doyouWantTomate(boolean b) {
		// TODO Auto-generated method stub
		return this.wannaTomate=b;
	}

}
