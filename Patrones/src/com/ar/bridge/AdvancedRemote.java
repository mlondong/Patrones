package com.ar.bridge;

public class AdvancedRemote implements _RemoteBridge{

	private _Device device;
	
	
	
	public AdvancedRemote(_Device d){
		this.device=d;
	}
	
	@Override
	public void volumeDown() {
		this.device.setVolume(5);
	}

	@Override
	public void volumeUp() {
		this.device.setVolume(100);
	}

}
