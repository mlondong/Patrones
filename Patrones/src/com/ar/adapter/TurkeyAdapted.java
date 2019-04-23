package com.ar.adapter;


/*CLASE ADAPTER  LA UAL CONTIENE LA INTERFAZ DEL ANIMAL A SER ADAPTADO EN ESTE CASO DUCK
 * Y LUEGO CONTIENE EL OBJETO DE LA CLASE ADAPTADA QUE SERIA TURKEY
 * 
 * 
 DUCK ---> TURKEYADAPTER -- > TURKEY    
 *
 *  LUEGO IMPLEMENTO LOS METODOS DEL OBJJETO ADAPTEE
 *  * */


public class TurkeyAdapted implements Duck {

	Turkey adapter;
	
	public TurkeyAdapted (Turkey t){
			this.adapter = t;
	}
	
	
	@Override
	public void quack() {
	  //METODOS DEL OBJETO ADAPTEE EN TURKEY
		this.adapter.grobbe();
	}

	@Override
	public void fly() {
		//METODOS DEL OBJETO ADAPTEE EN TURKEY
		for(int i=0 ;i <=5; i++){
				this.adapter.fly();
		}
	}

}
