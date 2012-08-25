package com.package1;

import lejos.nxt.Button;
import lejos.nxt.Motor;

public class motortest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button.waitForAnyPress();
		myRobot rob = new myRobot();
		rob.go3();
		Button.waitForAnyPress();
	}
	

}
