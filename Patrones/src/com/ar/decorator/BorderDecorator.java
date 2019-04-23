package com.ar.decorator;

public class BorderDecorator extends Decorator { // concrete decorator
	
	public BorderDecorator (VisualComponent vc) {
		super(vc); 
	}
	
	public void draw() {
		System.out.println("Print desde BorderedDecorator");
		super.draw();
		drawBorder();
	}
	
	public void drawBorder() { 
	}
}
