package com.ar.state;

public class UpState implements _StateAscensor{

	private Ascensor ascensor;
	
	
		
	@Override
	public void uP(Ascensor as ,Pedido p) {
		this.ascensor=as;
		//this.ascensor.setState(new UpState());
		this.ascensor.setLevel(p.getPiso());
		this.ascensor.setDirection(p.getDireccion());
		System.out.println("Info..: " + as.toString());			
		
	}

	public void idle(Ascensor as ,Pedido p) {
	}

	
	@Override
	public void doWn(Ascensor as ,Pedido p) {
	}

	@Override
	public String toString() {
		return "UpState ";
	}

}
