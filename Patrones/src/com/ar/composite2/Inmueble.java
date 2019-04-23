package com.ar.composite2;

public class Inmueble extends Prenda{

	
	private int superficie;
	private float precio;	
	
	
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float p) {
		this.precio = p;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	@Override
	public float valorprendario() {
		return (float) (this.valorprenda()*0.2);
	}

	@Override
	public float valorprenda() {
		return this.precio*this.superficie;
	}


}
