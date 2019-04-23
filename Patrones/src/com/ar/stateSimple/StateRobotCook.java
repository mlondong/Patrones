package com.ar.stateSimple;

public class StateRobotCook implements _StateRobot{

	
	private Robot robot;
	
	public StateRobotCook(Robot c){
		this.robot=c;
	}
	
	
	@Override
	public void walk() {
		System.out.println("State Cook Robot walk...");
	}

	@Override
	public void cook() {
		System.out.println("State Cook Robot Cooking...");
	}

	@Override
	public void off() {
		System.out.println("State Cook Robot Off...");
		this.robot.setState(new StateRobotOff(robot));	
	}

	@Override
	public void on() {
		System.out.println("Robot On..");
	}

}
