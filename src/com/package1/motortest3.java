package com.package1;

import lejos.nxt.Battery;
import lejos.nxt.Button;

public class motortest3 {

	public static void main(String[] args) {
		Button.waitForAnyPress();
		myRobot robot = new myRobot();
		robot.go2(600);
		robot.go2(700);
		robot.go2(800);
		robot.go2(900);
		robot.go2(1000);
		System.out.println(Battery.getVoltage());
		Button.waitForAnyPress();
	}
}
