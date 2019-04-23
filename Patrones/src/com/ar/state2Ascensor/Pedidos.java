package com.ar.state2Ascensor;

public class Pedidos {

	private int pisoDePedido;
	private String direccion;
	
	
	public Pedidos(int pisoDePedido, String dir) {
		this.pisoDePedido=pisoDePedido;
		this.direccion=dir;
	}
	
	public int getPisoPedido() {
		return pisoDePedido;
	}
	public void setPisoPedido(int pisoPedido) {
		this.pisoDePedido = pisoPedido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
