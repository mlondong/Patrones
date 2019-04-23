package com.ar.adapter;

public class Cliente {

	
	public static void main(String []arg){
		 
		WallardDuck duck = new WallardDuck();
		WildTurkey turkey = new WildTurkey(); 
		Duck adapter = new TurkeyAdapted(turkey);  ///este es el turkey adaptado a duck
		
		duck.fly();
		duck.quack();
		
		System.out.println("");
		
		turkey.fly();
		turkey.grobbe();
		
		System.out.println("");
		adapter.fly();
		adapter.quack();
		
		
	}

	public static void test(){
		
	}

}
