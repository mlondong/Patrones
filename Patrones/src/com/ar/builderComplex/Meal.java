package com.ar.builderComplex;

import java.util.ArrayList;

public class Meal {

	
	private ArrayList<_ItemProduct> items  = new ArrayList<_ItemProduct>();
	
	
	public Meal(){	}
	
	public void addItem(_ItemProduct b){
		items.add(b);
	}

	
	public ArrayList<_ItemProduct> getItems() {
		return items;
	}

	public void setItems(ArrayList<_ItemProduct> items) {
		this.items = items;
	}

	
	
	
	
}
