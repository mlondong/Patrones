package com.ar.state2Ascensor;

public class Cliente {

	public static void main(String arg []) {
	
		Ascensor uno = new Ascensor(5, new EstadoIdle());
		Ascensor dos = new Ascensor(10, new EstadoUp());
		Ascensor tres = new Ascensor(5, new EstadoUp());
			
		Controlador c = new Controlador();
		c.addAsensores(tres);
		c.addAsensores(uno);
		c.addAsensores(dos);

		System.out.println("Ascensores ini " + c.getAsecnsores().toString());

		
		
		c.addPedido(new Pedidos(3, "UP"));
		

		c.asignarAsensor();
		
		System.out.println("Ascensores cambiados" + c.getAsecnsores().toString());
		
		
		
		
		
		
	}
	
}
