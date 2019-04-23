package com.ar.command;


/*ESTE ES EL RECEIVER*/
/*ESTA NUESTRA CALSE RECEIVER QUE CONTIENE LAS ACCIONES 
 * A REALIZAR INVOCADAS POR EL CONCRETECOMMAND */

public class FIle {

	
	private String name;

	
	public FIle(String s){
		this.name=s;
	}
	
	/*OPEACIONES DEL FILE*/
	public void open(){
		System.out.println("Open file..");
	}
	
	public void close(){
		System.out.println("Close file..");
	}
	
	public void save(){
		System.out.println("Save file..");
	}

	public void getName(){
		System.out.println("Name of file.." + name);
	}

}
