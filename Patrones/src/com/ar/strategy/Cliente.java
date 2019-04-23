package com.ar.strategy;

public class Cliente {

	public static void main(String[] args) {
		ADuck ad = new ADuck();
		ad.display();
		ad.setformFly(new NoFlyWithWings());
		ad.performFly();
		ad.setformQuack(new  Squeak());
		ad.performQuack();;
		
		System.out.println();
		
		CDuck ad2 = new CDuck();
		ad2.display();
		ad2.setformFly(new NoFlyWithWings());
		ad2.performFly();
		ad2.setformQuack(new  Mute());
		ad2.performQuack();;
	
		System.out.println();
		
		BDuck ad3 = new BDuck();
		ad3.display();
		ad3.setformFly(new FlyWithWings());
		ad3.performFly();
		ad3.setformQuack(new  Quack());
		ad3.performQuack();;
	
	
	
	}

}
