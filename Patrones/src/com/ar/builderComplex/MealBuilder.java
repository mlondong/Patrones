package com.ar.builderComplex;

import java.util.ArrayList;

public class MealBuilder {

	private ArrayList<_ItemProduct> items = new ArrayList<_ItemProduct>();

	
	
	/*CONSTRUCTOR 1*/
	public MealBuilder setItems(ArrayList<_ItemProduct> p) {
		items=p;
		return this;
	}
	
	
	/*CONSTRUCTOR 2*/	
	public MealBuilder setItems(_ItemProduct p) {
		items.add(p);
		return this;
	}
	
	public Meal build(){
		Meal m = new Meal();
		m.setItems(items);
		return m;
	}
	
}
