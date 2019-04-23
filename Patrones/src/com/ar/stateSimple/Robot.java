package com.ar.stateSimple;

public class Robot {

	
	/*
	 * DIRECTIVAS
	 * SI ROBOT ES COOK SU ESTADO ES ON Y SU TAREA COCINAR
	 * SI ROBOT ES WALK ENTONCES SU ESTADO ES ON Y SU TAREA WALK
	 * 
	 * */
	
	
	
	private _StateRobot state;
	
	
	
	/*CONSTRUCTOR*/
	public Robot(){
		state = new StateRobotOn(this);
		/*stateW = new StateRobotWalk();
		stateO = new StateRobotOn();
		stateC = new StateRobotCook();*/
	}
	
	
	public void setState(_StateRobot s){
		this.state=s;
	}
	
	public _StateRobot getState(){
		return this.state;
	}
	
	
	public void walk(){
		this.state.walk();
	}
	
	public void cook(){
		this.state.cook();
	}
	public void off(){
		this.state.off();
	}
	public void on() {
		this.state.on();
	}


	@Override
	public String toString() {
		return "Robot [state=" + state +  "]";
	}

	
}
