package com.ar.command;

/*INTERFACE COMMAND DONDE SE EJECUTAN LAS ACCIONES Y UNDO*/
public interface FileCommand {

	public void execute();
	public void undo();

}
