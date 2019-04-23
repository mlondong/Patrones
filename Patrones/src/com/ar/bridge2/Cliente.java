package com.ar.bridge2;

public class Cliente {

	
		public static void main(String []arg){
			
			/*implementacion O CLASES CONCRETAS */
			_Figura circulo = new Circle();
			_Figura cuadrado = new Cuadrado();
			
	
			/*clases abstracta QUE MANTIENEN REFERENCIA A LAS IMPLEMENTACIONES*/			

			Rojo rojo = new Rojo();
			rojo.drawColor(circulo);
			System.out.println(circulo);
			
			Blue blue  = new Blue();
			blue.drawColor(cuadrado);
			System.out.println(cuadrado);
			
			
		}
}
