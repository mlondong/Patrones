package com.ar.state2Ascensor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Controlador {

	private ArrayList<Pedidos> pedidos;
	private ArrayList<Ascensor> asensores;


	public Controlador() {	
		pedidos = new ArrayList<Pedidos>(); 
		asensores= new ArrayList<Ascensor>(); 
	}

	public void addPedido(Pedidos p) {
		pedidos.add(p);
	}

	public ArrayList<Pedidos> getPedido() {
		return pedidos;
	}


	public void addAsensores(Ascensor a) {
		asensores.add(a);
	}

	public ArrayList<Ascensor> getAsecnsores() {
		return asensores;
	}

	public void asignarAsensor() {
		SortedMap <Integer, Ascensor> map = new TreeMap<Integer, Ascensor>();

		for(Ascensor a : asensores ) {
			int i = a.calcularDistance(pedidos.get(0));
			map.put(i, a);
		}


		this.asignarEstado(map.get(0), pedidos.get(0));
	
	}


		public void asignarEstado(Ascensor a, Pedidos p) {
			
			if(p.getDireccion()== "UP") {
				System.out.println("Entroa aca");
				a.setEstado(new EstadoUp());
				a.setPiso(p.getPisoPedido());
			
			}else if(p.getDireccion()== "DOWN") {
				a.setEstado(new EstadoUp());
				a.setPiso(p.getPisoPedido());
			}else {
				a.setEstado(new EstadoUp());
				a.setPiso(p.getPisoPedido());
			}
			
		
		}


	}






