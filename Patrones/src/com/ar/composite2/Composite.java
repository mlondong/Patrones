package com.ar.composite2;

import java.util.ArrayList;



/*ESTA ESS LA CLASE COMPOSITE */


public class Composite extends Prenda{

	private Prenda prenda;
	private ArrayList<Prenda> ar = new ArrayList<Prenda>();
	
	
	public void addComponentes(Prenda p) {
		ar.add(p);
	}


	@Override
	public float valorprendario() {
		return (float) (this.valorprenda()*0.5);
	}


	@Override
	public float valorprenda() {
		int valPrenda=0;
		for(Prenda p : ar  )
			valPrenda+=p.valorprenda();
			
		return valPrenda;
	}
	
	
}
