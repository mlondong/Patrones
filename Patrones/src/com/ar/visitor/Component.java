package com.ar.visitor;


/*INTERFACE COMUN PARA TODAS LAS CLASES CONCRETAS QUE ACCEPTAN EL VISITOR*/

public interface Component {
	public void accept(Visitor v);
}
