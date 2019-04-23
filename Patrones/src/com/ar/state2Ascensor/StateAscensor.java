package com.ar.state2Ascensor;

public interface StateAscensor {


		public void up(Ascensor c);
		public void down(Ascensor c);
		public String getName();
		public int distancia(Pedidos p);
		public void setEstado(Ascensor c);
	
}
