package com.ar.proxy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class Enginner implements InterfaceProfesion{

	
	private String name;
	private String rol;
	private Collection<Cursos> cursos= new ArrayList<>();
	
	public Enginner(String na, String rol) {
		this.name=na;
		this.rol=rol;
	}


	@Override
	public String getNameEnginner() {
		return name;
	}

	
	public void addCursos(Cursos cur){
		this.cursos.add(cur);
	}
	
	public Collection<Cursos> getCursos(){
		return this.cursos;
	}


	@Override
	public String isACurso(String nameCurso) {
		
		String info=null;
		
		//Recorro los cursos y veifico si esta el que preguntan
		
		for(Cursos dato : this.getCursos()) {
		  if(nameCurso.equals(dato.getNombreCurso()) ){
				info=nameCurso;
		  }
	   }
		return info;
	}


	
}
