package com.ar.factoryMethod;

public class TriangleCreator extends FigureCreator{

	@Override
	public Figure createFigure() {
		// TODO Auto-generated method stub
		return new Triangle();
	}

}
