package com.ar.proxy;

import java.util.Iterator;

public class Cliente {

	public static void main(String [] arg){
		
		Enginner en1 = new Enginner("Mauricio", "Ingeniero");
		en1.addCursos(new Cursos("HTML", 60, 6));
		en1.addCursos(new Cursos("PHP", 5, 10));
			
		//Envio por el proxy Enginner en1 y pregunto si tiene el curso de java
		InterfaceProfesion enginer = new ProxyEnginner(en1);
		String a= enginer.isACurso("PHP");
		
		//imprimo si tiene el algun curso al proxy
		System.out.println("El Enginner usando el proxy " + enginer.getNameEnginner() + "tiene el curso " +  a);
		
		}
	
	
}
