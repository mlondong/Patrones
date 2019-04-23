package com.ar.bridge;

public class BasicRemote implements _RemoteBridge {

	private _Device device;
	
	
	public BasicRemote(_Device d){
		this.device=d;
	}
	
	@Override
	public void volumeDown() {
		this.device.setVolume(2);
	}

	@Override
	public void volumeUp() {
		this.device.setVolume(50);		
	}

}
