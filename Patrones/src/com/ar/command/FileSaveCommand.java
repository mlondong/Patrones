package com.ar.command;


/*CONCRETE COMMANDS QUE ENVIAN PETICIONES A RECEIVER FILE*/
public class FileSaveCommand implements FileCommand{
    
	
	private FIle file;
	
	
	public FileSaveCommand(FIle f){
		this.file=f;
	}
	
	
	@Override
	public void execute() {
		this.file.save();
		this.file.getName();
	}

	@Override
	public void undo() { }

}
