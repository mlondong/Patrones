package com.ar.composite;

import java.awt.List;
import java.util.Collection;

public class Composite implements Component {


	private Collection<Component> components;
	
	
	public Composite(String n){
		System.out.println(n);
	}
	
	public void addComponents(Component cop){
			components.add(cop);
	}
	
	public  Collection<Component> getComponents(){
		return this.components;
	}
	
	public void deleteComponent(Component cop){
		this.components.remove(cop);
	}

	@Override
	public void geValues() {
		// TODO Auto-generated method stub
		
	}

	
	
}
