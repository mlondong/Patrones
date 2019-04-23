package com.ar.stateSimple;

public class StateRobotOff implements _StateRobot{

	
	private Robot robot;
	
	
	public StateRobotOff(Robot c){
		this.robot=c;
	}
	
	@Override
	public void walk() {
		System.out.println("State Off Robot ..put State On");
	}

	@Override
	public void cook() {
		System.out.println("State Off Robot .. put state On");
	}

	@Override
	public void off() {
		System.out.println("State Off is switched off.");
		this.robot.setState(new StateRobotOff(robot));	
	}

	@Override
	public void on() {
		System.out.println("State Off Robot On");
		this.robot.setState(new StateRobotOn(robot));	
		
	}

}
