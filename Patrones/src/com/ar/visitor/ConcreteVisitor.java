package com.ar.visitor;

public class ConcreteVisitor implements Visitor{

	
	/*MICLASE VISITOR ES LA ENCARGADA DE HACER CALULOS sin intervenir suss clases concretas*/
	
	@Override
	public void visitor(Bar bar) {
		/*en esta clase altero los valores desde mi visitor sin alterar mi clase concreta*/
		int cost=0;
		bar.setDiretion(bar.diretion.concat("-VistorBar 1"));
		bar.setName(bar.name.concat("-VistorBar 1"));
		System.out.println("ConcreteVisitor :" + bar.toString());
	}

	@Override
	public void visitor(Baz baz) {
		System.out.println("Visitor :" + baz.toString());	
	}

	@Override
	public void visitor(Foo foo) {
		System.out.println("Visitor :" + foo.toString());	
		
	}

}
