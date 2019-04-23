package com.ar.stateSimple;

public class StateRobotWalk implements _StateRobot{

	
	
	private Robot robot;
	
	public StateRobotWalk(Robot c){
		this.robot=c;
	}
	
	@Override
	public void walk() {
		System.out.println("State Walk Robot Walk..");
		this.robot.setState(new StateRobotCook(robot));
	}

	@Override
	public void cook() {
		System.out.println("State Walk Robot Cooking...");
		this.robot.setState(new StateRobotCook(robot));
	}

	@Override
	public void off() {
		System.out.println("State Walk Robot is switched off");
		this.robot.setState(new StateRobotCook(this.robot));
	}

	
	@Override
	public void on() {
		System.out.println("State Walk Robot On..");
	}

	

}
