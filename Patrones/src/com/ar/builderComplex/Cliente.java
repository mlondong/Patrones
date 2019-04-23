package com.ar.builderComplex;

import java.util.ArrayList;

public class Cliente {

	public static void main(String [] arg){
		
		
		ArrayList<_ItemProduct> items = new ArrayList<_ItemProduct>();
		
		_ItemProduct c = new CHBurguer("Gengbre",true,false,true,true);
		_ItemProduct v = new VBurger("Arabe",false,false,false,true);
		_ItemProduct ck = new Coke();
		_ItemProduct pp = new Pepsi();
		
		items.add(c);
		items.add(v);
		items.add(ck);
		items.add(pp);
		
		/*se construye objeto por objeto y se adiciona uego se pasa por parametros al constructor */
		MealBuilder constructor1 = new MealBuilder();
		constructor1.setItems(items);
		
		System.out.println(constructor1);//aca es objeto MealBuilder
		System.out.println(constructor1.build());//aca es objeto Meal
		System.out.println(constructor1.build().getItems());
		
		
		System.out.println();
		
		/*DE LA OTRA FORMA pasando al 	/*CONSTRUCTOR 2*/
		MealBuilder constructor2 =
				new MealBuilder().setItems( new CHBurguer("Gengbre",true,false,true,true)).setItems(new VBurger("Arabe",false,false,false,true));  
		System.out.println(constructor2.build());
		System.out.println(constructor2.build().getItems());
	
		
		
		/*
		System.out.println(c);	
		System.out.println();	
		System.out.println(v);	*/
		
				
	
	
	}
	
	
}
