package com.ar.command;



/*CONCRETE COMMANDS QUE ENVIAN PETICIONES A RECEIVER FILE
 * CUANDO EL ARCHIVO ARCHIVO SE DESEA CERRAR ESTE LO GUARDA Y LUEGO LO CIERRA
 * * */

public class FileOpenCommand implements FileCommand{

	private FIle file;
	
	public FileOpenCommand(FIle f){
		this.file=f;
	}
	
	@Override
	public void execute() {
		file.getName();
		file.open();
	}

	@Override
	public void undo() {
		file.save();
		file.close();
		file.getName();
	}

}
