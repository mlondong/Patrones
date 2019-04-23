package com.ar.builderSimple;

public class Cliente {

	/*
	 * ESTE EJEMPLO ES SIMPLE SE CREA UN PHONEBUILDER A PARTIR DE PHONE ESTE BUILDER CONTIENE LA MSICA CANTIDAD DE 
	 * METODOS PERO SETEADOS Y AL FINAL IMPLEMENTA UN METODO QUE REGRESA UN PHONE CON
	 * LOS PARAMETROS INSTANCIADOS EN EL BUILDER
	 * SU OBJETIVO ES EL MISMO CREAR UN OBJETO A PARTIR DE OTRO
	 * Where to use? 
	 * Following are the conditions which we can easily handle using builder design pattern-
	 * 1. When multiple representation of objects are required.
	 * 2. Too many argument to pass from client.
	 * 3. Object creation contains optional parameter.
	 * */
	
	
	public static void main(String []arg){
		
		Phone p = new Phone("IOs", 25, "Intel", 1925);
		System.out.println(p);
		
		
		PhoneBuilder p2 = new PhoneBuilder().setOs("XP").setRam(100);
		System.out.println(p2.getPhone());
		
	
		
	
	}
	
	
}
