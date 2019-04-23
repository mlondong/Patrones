package com.ar.state;

public interface _StateAscensor {

	/*CREO LOS METODOS QUE MANIPULAN MI ESTADOS Y CON ESTA
	 * INTERFAZ CREO UN OBETO POR CADA ESTADO*/
	public void idle(Ascensor as,Pedido p);
	public void uP(Ascensor as ,Pedido p);
	public void doWn(Ascensor as,Pedido p);
	
	
	
	
}
