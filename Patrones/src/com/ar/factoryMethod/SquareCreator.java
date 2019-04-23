package com.ar.factoryMethod;

public class SquareCreator extends FigureCreator{

	@Override
	public Figure createFigure() {
		// TODO Auto-generated method stub
		return new Square();
	}

}
