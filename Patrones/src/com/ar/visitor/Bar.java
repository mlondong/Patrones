package com.ar.visitor;

public class Bar implements Component {


	public String name;
	public String diretion;
	
	
	public Bar(String n, String d){
		this.name=n;
		this.diretion=d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getDiretion() {
		return diretion;
	}


	public void setDiretion(String diretion) {
		this.diretion = diretion;
	}


	@Override
	public void accept(Visitor v) {
		
		v.visitor(this);
		
	}

	@Override
	public String toString() {
		return "Bar [name=" + name + ", diretion=" + diretion + "]";
	}
}
