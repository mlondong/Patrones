package com.ar.composite2;

import java.util.Date;

public class Auto extends Prenda{

	
	private int kilometros;
	private int antiguedad; //esto serian los años
	private float precio;
	
	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int a) {
		this.antiguedad = a;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public float valorprendario() {
		return (float) (this.valorprenda()*0.7);
	}

	@Override
	public float valorprenda() {
		return (float) (this.precio- (this.precio*(this.getAntiguedad() * 0.10)) );
	}

	
}
