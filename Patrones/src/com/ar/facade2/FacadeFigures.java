package com.ar.facade2;

public class FacadeFigures {
	
	private Shape triangle;
	private Shape circle;
	
	public  FacadeFigures(){
		triangle = new Triangle();
		circle = new Circle();
	}
	
	
	public void drawCircle(){
		circle.draw();
	}
	

	public void drawTriangle(){
		triangle.draw();
	}

	
}
