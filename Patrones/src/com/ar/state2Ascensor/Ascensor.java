package com.ar.state2Ascensor;

import java.util.ArrayList;
import java.util.Map;

public class Ascensor {

	private int piso;
	private StateAscensor estado;
	private ArrayList<Pedidos> pedidos;
	private String direccion;
	
	


	public Ascensor(int piso, StateAscensor estadoDown) {
		this.piso=piso;
		this.estado=estadoDown;
		this.estado.setEstado(this);
	}
	
	
	
	public int getPiso() {
		return piso;
	}
	public void setPiso(int pisoActual) {
		this.piso = pisoActual;
	}
	
	public StateAscensor getEstado() {
		return estado;
	}
	public void setEstado(StateAscensor estado) {
		this.estado = estado;
	}

	public void addPedidos(Pedidos p) {
		this.pedidos.add(p);
	}
	
	
	public int calcularDistance(Pedidos p) {
		return estado.distancia(p);
	}
	

	@Override
	public String toString() {
		return "Ascensor [piso=" + piso + ", estado=" + estado + "]";
	}
	
		
	
}
