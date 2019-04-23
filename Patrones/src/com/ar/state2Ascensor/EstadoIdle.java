package com.ar.state2Ascensor;

public class EstadoIdle implements StateAscensor{

	private Ascensor asecnsor;
	
	
	public void setEstado(Ascensor c) {
		this.asecnsor=c;
	}
	
	
	@Override
	public void up(Ascensor c) {
		this.asecnsor=c;
	}

	@Override
	public void down(Ascensor c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int distancia(Pedidos p) {
	
		int piso;
		piso = Math.abs( p.getPisoPedido() - this.asecnsor.getPiso()   );	
		System.out.println("EstadoIdle");	
		return 0;
	}

	

	
	

}
