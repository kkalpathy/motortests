package com.package1;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class motortest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button.waitForAnyPress();
		Motor.A.forward();
		Delay.msDelay(2000);
		Motor.A.stop();
		System.out.println("Count "+Motor.A.getTachoCount());
		Motor.A.backward();
		Delay.msDelay(2000);
		Motor.A.stop();
		System.out.println("Count "+Motor.A.getTachoCount());
		Motor.A.rotate(360);
		System.out.println("Count "+Motor.A.getTachoCount());
		Button.waitForAnyPress();
	}

}
