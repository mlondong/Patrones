package com.ar.bridge;

public class TV implements _Device{


	private int volumen;

	@Override
	public int getVolume() {
		return volumen;
	}

	@Override
	public void setVolume(int percent) {
		this.volumen=percent;	
	}

	@Override
	public String toString() {
		return "TV [volumen=" + volumen + "]";
	}

}
