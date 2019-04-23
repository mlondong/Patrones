package com.ar.state2Ascensor;

public class EstadoDown implements StateAscensor {

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
		return null;
	}

	@Override
	public int distancia(Pedidos p) {
	    int piso;
	    
		if(p.getDireccion().equals("UP")) {
			piso = Math.abs( this.asecnsor.getPiso() - 1  + p.getPisoPedido());	
		}else {
				if(p.getPisoPedido() < this.asecnsor.getPiso()) {
					piso = Math.abs( (this.asecnsor.getPiso() - 1) + (10 -1) + (10 - p.getPisoPedido()) );  
				}else {
					piso= Math.abs( this.asecnsor.getPiso() - p.getPisoPedido());	
				}
		}
		System.out.println("EstadoDown");
		return piso;
	}


}
