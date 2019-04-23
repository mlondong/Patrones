package com.ar.state2Ascensor;

public class EstadoUp implements StateAscensor{


	private Ascensor asecnsor; 
	
	
	public void setEstado(Ascensor a) {
		this.asecnsor=a;
	}
	
	
	@Override
	public void up(Ascensor c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void down(Ascensor c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Up";
	}

	@Override
	public int distancia(Pedidos p) {
		int piso;
			
			if(p.getDireccion().equals("DOWN")) {
				piso = Math.abs( 10 - this.asecnsor.getPiso()   + 10  - p.getPisoPedido() );	
			}else {
					if(p.getPisoPedido() > this.asecnsor.getPiso()) {
						piso = Math.abs(  10 - this.asecnsor.getPiso() + 10 + p.getPisoPedido() );  
					}else {
						piso= Math.abs( p.getPisoPedido() - this.asecnsor.getPiso() );	
					}
			}
			System.out.println("EstadoUp");			
		return piso;
	}

	

		
}
