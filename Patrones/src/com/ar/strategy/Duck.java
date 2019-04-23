package com.ar.strategy;

public abstract class Duck {
	
	public _FlyBehavior flybehavior;
	public _QuackBehavior quackbehavior;
	
	public abstract void display();

	
	
	 /*ACA HAGO EL MANEJO DEL POLIMORFSMO DE UNA VEZ, PARA LOS OBJETOS  flybehavior Y quackbehavior
	 * SI NO TOCARIA HACERLO ENTODAS LAS INSTANCIAS DE LAS 
	 * SUBCLASES*/
	public  void performFly(){
		flybehavior.fly();
	}
	
	public void setformFly(_FlyBehavior fly){
		this.flybehavior=fly;
	}
		
	public void performQuack(){
		quackbehavior.quack();	
	}	
	
	public void setformQuack( _QuackBehavior q){
		this.quackbehavior=q;
	}

	public void swim(){
		System.out.println("Todos los patos nadan...");
	}

	
}
