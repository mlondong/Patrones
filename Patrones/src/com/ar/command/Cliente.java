package com.ar.command;

public class Cliente {

	public static void main(String [] arg){

		/*NUESTRO CONTROLER ES EL INVOKER QUIEN MANEJA TODAS LAS PETICIONES Y AL QUE LE PASAMOS EL FILE*/
		FIle _file = new FIle("Mauricio.text");
		InvokerControl invoker = new InvokerControl();


		invoker.setCommand(new FileOpenCommand(_file));
		invoker.execute();	
		invoker.undo();	

		System.out.println();

		invoker.setCommand(new FileSaveCommand(_file));
		invoker.execute();		
		invoker.undo();	

		System.out.println();

		
		invoker.setCommand(new FileCloseCommand(_file));
		invoker.execute();		
		//invoker.undo();	

		
	}
}
