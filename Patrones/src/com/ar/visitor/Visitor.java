package com.ar.visitor;


/*INTERFACE VISITOR QE MANEJA LOS METODOS PARA ACCEDER A TODOS LOS OBJETOS CONCRETOS*/
public interface Visitor {

	public void visitor(Bar bar);
	public void visitor(Baz baz);
	public void visitor(Foo foo);
	
}
