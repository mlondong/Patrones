package com.ar.builderSimple;

public class PhoneBuilder {

	
	private String os;
	private int ram;
	private String processor;
	private int screenSize;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public PhoneBuilder setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(os,ram,processor,screenSize);
	}
	
}
