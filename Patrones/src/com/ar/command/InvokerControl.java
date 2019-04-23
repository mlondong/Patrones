package com.ar.command;

public class InvokerControl {
	
	private FileCommand fileCommand;
	
	
	public void setCommand(FileCommand f){
		this.fileCommand=f;
	}
	
	
	
	public void execute(){
		this.fileCommand.execute();
	}
	
	public void undo(){
		this.fileCommand.undo();
	}
	

	
	
	@Override
	public String toString() {
		return "InvokerControl [fileCommand=" + fileCommand + "]";
	}
	
	
	
	
}
