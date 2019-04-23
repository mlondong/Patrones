package com.ar.factoryMethod;

public class FigureManager {

	
	/*SIEMPRE DEBO RECIBIR UN FIGURECREATOR POR SETTER O CONSTRUCTOR
	 * PARA QUE PUEDA GENERAR FIGURAS A PARTIR DE EL
	 * 
	 * NO ES NECESARIO UB CODIGO ESPAGUETTI PARA CREAR OBJETOS TODO FUNCIONA POLIMOFICAMENTE
	 * */
	
	private Figure figure;
	private FigureCreator creator; 
	
	
	/*METODO IMPORTANTE*/
	public void setCretor(FigureCreator fc){
		this.creator=fc;
	}
	
	/*CON ESTE METODO ESCOJO LA FIGURA QUE REQUIERO SIN SABER QUE SON*/
	public void crearFigure(){
		this.figure=creator.createFigure();
	}
	
	public Figure getFigure() {
		return figure;
	}

		
}
