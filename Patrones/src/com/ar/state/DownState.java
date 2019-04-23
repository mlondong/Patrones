package com.ar.state;

public class DownState implements _StateAscensor{


	private Ascensor ascensor;

	@Override
	public void idle(Ascensor as, Pedido p) { }

	@Override
	public void uP(Ascensor as, Pedido p) { }

	@Override
	public void doWn(Ascensor as ,Pedido p) {
		this.ascensor=as;
		this.ascensor.setLevel(p.getPiso());
		this.ascensor.setDirection(p.getDireccion());
		System.out.println("Info..: " + as.toString());			
		
	}

	@Override
	public String toString() {
		return "DownState ";
	}

}
