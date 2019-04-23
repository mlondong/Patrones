package com.ar.visitor;

public class Cliente {

		public static void main(String [] arg){
			
		
			ConcreteVisitor  visitor = new ConcreteVisitor();
			ConcreteVisitor2  visitor2 = new ConcreteVisitor2();
			
			
			Bar b = new Bar("MOE","Manizales");
			b.accept(visitor);
			b.accept(visitor2);
			
			
			Baz baz = new Baz("Fruta");
			baz.accept(visitor);	
			
			Foo foo = new  Foo();
			foo.accept(visitor);
			
			
			
			
		}
}
