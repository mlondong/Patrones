package com.ar.visitor;

import java.util.ArrayList;

public class Foo implements Component {

	private ArrayList colection= new ArrayList<>() ;
	
	
	public Foo(){
		this.colection.add(1);
		this.colection.add(2);
		this.colection.add(56);
		
	}
		
	@Override
	public void accept(Visitor v) {
		v.visitor(this);
	}

	@Override
	public String toString() {
		return "Foo [colection=" + colection + "]";
	}

}
