package com.ar.command;


/*CONCRETE COMMANDS QUE ENVIAN PETICIONES A RECEIVER FILE*/
public class FileCloseCommand implements FileCommand{

	private FIle file;
	
	public FileCloseCommand(FIle f){
		this.file=f;
	}
	
		
	@Override
	public void execute() {
		this.file.save();
		this.file.close();
		this.file.getName();
	}

	@Override
	public void undo() {
		this.file.open();
		this.file.getName();
	}

}
