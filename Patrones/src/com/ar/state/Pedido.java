package com.ar.state;

public class Pedido {
	
	private int piso;
	private String direccion;
	private int distancia;
	
	public Pedido(int piso, String dir){
		this.piso=piso;
		this.direccion=dir;
	}

	public int getPiso(){
		return this.piso;
	}
	
	public String getDireccion(){
		return this.direccion;
	}

	public void setDistancia(int d){
		this.distancia=d;
	}
	
	public int getDistancia(){
		return this.distancia;
	}
	
}
