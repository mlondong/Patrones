package com.ar.proxy;

import java.util.Collection;

public class ProxyEnginner implements InterfaceProfesion {

	private Enginner en;
	
	
	public ProxyEnginner(Enginner e){
		this.en=e;
	}
	
	@Override
	public String getNameEnginner() {
		return en.getNameEnginner();
	}

	@Override
	public Collection<Cursos> getCursos() {
		return en.getCursos();
	}

	@Override
	public String isACurso(String nameCurso) {
		return en.isACurso(nameCurso);
	}

}
