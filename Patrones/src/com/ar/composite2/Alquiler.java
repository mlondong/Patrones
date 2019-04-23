package com.ar.composite2;

import java.util.Date;

public class Alquiler extends Prenda{

	private float precio;
	private Date f_fin;
	
	
	
	@Override
	public float valorprendario() {
		return (float) (this.valorprenda()*0.9);
	}

	
	public int restaFechas() {
		//return (int) ( this.f_fin.getMonth() - new Date().getMonth()      ); 
		return (int) ( 12 - new Date().getMonth()      );  //harcodeamos esta shit
		
	}
	
	
	@Override
	public float valorprenda() {
		return (float) (this.getPrecio()*this.restaFechas());
	}
	
	
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	

	public Date getF_fin() {
		return f_fin;
	}

	public void setF_fin(Date f_fin) {
		this.f_fin = f_fin;
	}

	

}
