package com.ar.stateSimple;

public class StateRobotOn implements _StateRobot{

	
	private Robot robot;
	
	public StateRobotOn(Robot c){
		this.robot=c;
	}
		
	
	@Override
	public void walk() {
		System.out.println("State On Robot Walk..");
		this.robot.setState(new StateRobotWalk(robot));
	}

	@Override
	public void cook() {
		System.out.println("State On Robot Cooking...");
		this.robot.setState(new StateRobotCook(robot));
	}

	@Override
	public void off() {
		System.out.println("State On Robot is switched off");
		this.robot.setState(new StateRobotOff(robot));
	}

	@Override
	public void on() {
		System.out.println("State On Robot On..");
	}

	
}
