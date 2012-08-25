package com.package1;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class myRobot {
	public void go(){
		Button.waitForAnyPress();
		//helper(700,6000);
		//helper(350,6000);
		helper(700,20000);
		helper(350,20000);
		Button.waitForAnyPress();
	}
	public void helper(int speed, int acc){
		Motor.A.setAcceleration(acc);
		Motor.A.setSpeed(speed);
		Motor.A.forward();
		while (Motor.A.getTachoCount()<720){}
		System.out.println("Count "+Motor.A.getTachoCount());
		Motor.A.stop();
		System.out.println("Count "+Motor.A.getTachoCount());
		Motor.A.resetTachoCount();
	}
	public void go2(int speed){
		Motor.A.setSpeed(speed);
		Motor.A.forward();
		Delay.msDelay(2000);
		System.out.println("Count "+Motor.A.getTachoCount());
		Motor.A.stop();
		Motor.A.resetTachoCount();
	}
	public void go3(){
		Motor.A.rotate(720,true);
		Motor.B.rotate(720);
		System.out.println("A: " + Motor.A.getTachoCount());
		System.out.println("B: " + Motor.B.getTachoCount());
		
	}
}
