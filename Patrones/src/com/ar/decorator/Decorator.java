package com.ar.decorator;

public abstract class Decorator extends VisualComponent { // decorator
	
	protected VisualComponent _component;
	
	public Decorator (VisualComponent vc) {
		System.out.println("Print desde constructor  Decorator");
		_component = vc; 
	}
	
	public void draw () {
		System.out.println("Print desde draw Decorator");
		_component.draw(); 
	}
}