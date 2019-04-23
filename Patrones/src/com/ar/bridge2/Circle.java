package com.ar.bridge2;

public class Circle implements _Figura{

	
	private String color;
    private double area;

	@Override
	public void draw(String color) {
		this.color=color;
	}
	
	
	@Override
	public String toString() {
		return "Circle [color=" + color + "]";
	}
	
	
}
