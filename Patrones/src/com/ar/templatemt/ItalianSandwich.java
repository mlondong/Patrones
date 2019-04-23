package com.ar.templatemt;

public class ItalianSandwich extends AbstractSandwich{


	
	
	public ItalianSandwich(){
		System.out.println("Creando Sandwich Italiano...");	
	}
	
	//Metodos de comprtamiento
	@Override
	public void addMeat() {
		System.out.println("Bolognesa adicionada...");	
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
			System.out.println("Sin adicion de queso...");	
	}

	@Override
	public void addTomate() {
        if(this.wannaTomate==true){    
        	System.out.println("Tomate adicionado...");	
        }else{
         		System.out.println("Sin adicion de tomate...");	
             }	
    }

	

	
	@Override
	public  boolean doyouWantChesse(boolean b) {
		this.wannaCheese=b;
		return wannaCheese;
	}
		

	@Override
	public boolean doyouWantTomate(boolean b) {
		return this.wannaTomate=b;
	}


			
}
