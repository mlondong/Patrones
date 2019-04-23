package com.ar.bridge2;

public class Cuadrado implements _Figura {


	private String color;

	@Override
	public void draw(String color) {
		this.color=color;
	}


	@Override
	public String toString() {
		return "Cuadrado [color=" + color + "]";
	}

}
