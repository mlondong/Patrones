package com.ar.factoryMethod;

public class CircleCreator extends FigureCreator{

	@Override
	public Figure createFigure() {
		// TODO Auto-generated method stub
		return new Circle();
	}

}
