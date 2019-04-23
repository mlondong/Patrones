package com.ar.composite;

public class Cliente {

	
	public static void main(String [] arg){
		
		
		Component hd= new Leaf(300,"Hd");
		Component mouse= new Leaf(100,"Mouse");
		Component screen= new Leaf(600,"Screen");
		Component keyboard= new Leaf(3000,"keyboard");
		Component cpu= new Leaf(8000,"CPU");
		
		
		Composite perifericos = new Composite("perifericos");
		Composite cabinet = new Composite("cabinet");
		Composite pc = new Composite("PC");
		
		perifericos.addComponents(mouse);
		perifericos.addComponents(keyboard);
		perifericos.getComponents();
		
		
		
	}
	
	
}
