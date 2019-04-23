package com.ar.visitor;

public class Baz implements Component {
	
	private String name;
	
	
	public Baz(String n){
		this.name=n;	
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitor(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Baz [name=" + name + "]";
	}

}
