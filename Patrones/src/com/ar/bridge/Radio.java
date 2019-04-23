package com.ar.bridge;

public class Radio implements _Device{

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
		return "Radio [volumen=" + volumen + "]";
	}

}
