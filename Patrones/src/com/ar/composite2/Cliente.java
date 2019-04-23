package com.ar.composite2;

import java.util.Date;

public class Cliente {

	public static void main(String [] arg) {
			
		Inmueble _inmueble = new Inmueble();
		_inmueble.setSuperficie(30);
		_inmueble.setPrecio(100);
		
		
		Inmueble _inmueble2 = new Inmueble();
		_inmueble2.setSuperficie(1000);
		_inmueble2.setPrecio(80);
		
		//System.out.println(_inmueble.valorprenda() + " "+ _inmueble .valorprendario());
		
		Auto _auto = new Auto();
		_auto.setKilometros(100);
		_auto.setAntiguedad(9);
		_auto.setPrecio(10000);
		
			
		
		Alquiler _alq = new  Alquiler();
		_alq.setPrecio(500);
		_alq.setF_fin(new Date(2018, 30, 12));
		System.out.println("fecha in " + _alq.getF_fin()+ " meses " +_alq .restaFechas());
		
		System.out.println("valor prenda " + _alq.valorprenda() + " \"valor prendario \""+ _alq .valorprendario());
		
		
		
		
		Composite c = new Composite();
		c.addComponentes(_inmueble);
		c.addComponentes(_inmueble2);
		c.addComponentes(_auto);
		c.addComponentes(_alq);
		
		
		
		System.out.println("Valor Composite prenda " + c.valorprenda());
		System.out.println("Valor Composite  prendario " + c.valorprendario());
		
		
	}
	
}
