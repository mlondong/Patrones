package com.ar.state;

import java.util.ArrayList;

public class Cliente {

	public static void main(String [] arg){
	
		
		/*
		 * 1. PRIMERO SETEO EL ASCENSOR EN ALGUN PISO DIRECCIONY ESTADO
		 * 2. ADICIONO LA COLECCION DE PEDIDOS
		 * 3. CARGO PEDIDOS
		 * 4. START ASCENSOR
		 * */
		
		Ascensor as = new Ascensor();
		System.out.println("Info..ini Dir: " + as.toString());
		
		as.addPedidos(1, "idle");// el primer piso debe ser siempre 1 en los pedidos
		as.addPedidos(10, "Up");
		as.addPedidos(8, "Up");
		as.addPedidos(26, "Down");
		as.addPedidos(32, "Down");
		as.addPedidos(1, "Down");
		as.addPedidos(12, "Down");
		as.addPedidos(22, "Down");
		as.addPedidos(42, "Down");
		
		
		
		
		
		ArrayList<Pedido> pp = as.getPedidos();
		for(Pedido p : pp){
			System.out.println("Pedidos sin Orden: " + "D:"+p.getDireccion() + " P:"+p.getPiso() +" DT:"+ p.getDistancia());
		}
		System.out.println();
		
		//System.out.println("Pedidos sin ordenados: " + as.getPedidos());
		as.cargarPedidos();
		
		ArrayList<Pedido> pp2 = as.getPedidos();
		for(Pedido p : pp2){
			System.out.println("Pedidos sin Orden: " + "D:"+p.getDireccion() + " P:"+p.getPiso() +" DT:"+ p.getDistancia());
		}
		
		
		//System.out.println("Pedidos ordenados: " + as.getPedidos());
		
		as.start();
		System.out.println("Info..Fin Dir: " + as.toString());			
		
		//System.out.println("Info.. Dir: " + as.getDirection() + ", level: " +as.getLevel()  + ", Estado: " + as.getState());
		//as.setState(new UpState());
		//System.out.println("Info.. Dir: " + as.getDirection() + ", level: " +as.getLevel()  + ", Estado: " + as.getState());
		
	}

}
