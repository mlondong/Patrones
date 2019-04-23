package com.ar.decorator;

public class Test { // client

	public static void main (String args[]) {
		
		BorderDecorator vc = new BorderDecorator(new TextView()); 
		vc.draw();
		
	}
}