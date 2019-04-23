package com.ar.templatemt;

public abstract class AbstractSandwich {

	public  boolean wannaTomate=true; // NO ESTOY SEGURO SI SE DEBAN IMPLEMANTAR ACA O EN LAS SUBCLASES
	public  boolean wannaCheese=true; // NO ESTOY SEGURO SI SE DEBAN IMPLEMANTAR ACA O EN LAS SUBCLASES

	
	public abstract void addMeat(); 
	public abstract void addBreath(); 
	public abstract void addCheese(); 
	public abstract void addTomate(); 

	public abstract boolean doyouWantChesse(boolean b);
	public abstract boolean doyouWantTomate(boolean b);

	
	//TEMPLATE METHOD DE LA CLASE ABSTRACTSANDWICH****************
	//EL METODO TEMPLATE ES EL QUE SOPORTA EL ALGORITMO, POR EJEMPLO SI SE QUIERE CON PAN
	public final void makeSandwich(){
		addBreath(); 
		addTomate(); 
		addCheese();
		addMeat(); 
	} 
	//FIN TEMPLATE METHOD
	
}
