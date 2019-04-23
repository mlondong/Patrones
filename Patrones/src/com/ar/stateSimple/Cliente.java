package com.ar.stateSimple;

public class Cliente {
	
	
	public static void main(String [] arg){
		Robot r = new Robot();	
		r.on();
		r.walk();
		r.cook();
		r.off();
		r.walk();
		r.on();
		r.off();
		r.walk();
		r.cook();
		r.off();
		r.on();
		r.off();
		r.on();
		r.cook();
		System.out.println("Estado actual.. " + r.toString());
		/*r.cook();
		System.out.println("Estado actual.. " + r.getState().toString());
		*/
	}
}
