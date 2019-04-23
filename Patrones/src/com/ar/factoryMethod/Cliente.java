package com.ar.factoryMethod;

public class Cliente {

	
	public static void main(String [] arg){

		FigureManager f = new FigureManager();
		f.setCretor(new TriangleCreator());
		f.crearFigure();
		System.out.println(" Fugura creada.. "  + f.getFigure().name());
	
		
		f.setCretor(new SquareCreator());
		f.crearFigure();
		System.out.println(" Fugura creada.. "  + f.getFigure().name());
	
		
		f.setCretor(new CircleCreator());
		f.crearFigure();
		System.out.println(" Fugura creada.. "  + f.getFigure().name());
	
		
		
		
		
	}
}