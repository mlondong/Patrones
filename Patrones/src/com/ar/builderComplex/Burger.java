package com.ar.builderComplex;

public abstract class Burger  implements _ItemProduct{

	private String name;
	private int precio;
	private String Pan;
	
	private boolean queso;
	private boolean tomate;
	private boolean lechuga;
	private boolean cebolla;
	
	private _InterfacePacking packing; 
	
	
	
	public _InterfacePacking getPacking() {
		packing = new Wrapper(); 
		return packing;
	}



	public Burger(String pan, boolean queso, boolean tomate, boolean lechuga, boolean cebolla) {
		super();
		Pan = pan;
		this.queso = queso;
		this.tomate = tomate;
		this.lechuga = lechuga;
		this.cebolla = cebolla;
	}






	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getPan() {
		return Pan;
	}
	public void setPan(String pan) {
		Pan = pan;
	}
	public boolean isQueso() {
		return queso;
	}
	public void setQueso(boolean queso) {
		this.queso = queso;
	}
	public boolean isTomate() {
		return tomate;
	}
	public void setTomate(boolean tomate) {
		this.tomate = tomate;
	}
	public boolean isLechuga() {
		return lechuga;
	}
	public void setLechuga(boolean lechuga) {
		this.lechuga = lechuga;
	}
	public boolean isCebolla() {
		return cebolla;
	}
	public void setCebolla(boolean cebolla) {
		this.cebolla = cebolla;
	}


	
	
	
}
