package com.ar.visitor;

public class ConcreteVisitor2 implements Visitor{

	@Override
	public void visitor(Bar bar) {
		System.out.println("ConcreteVisitor2 :" + bar.toString());
	}

	@Override
	public void visitor(Baz baz) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitor(Foo foo) {
		// TODO Auto-generated method stub
		
	}

}
