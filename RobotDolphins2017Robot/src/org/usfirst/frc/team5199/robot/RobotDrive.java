package org.usfirst.frc.team5199.robot;

import edu.wpi.first.wpilibj.Talon;

public class RobotDrive {
	public static Talon rightMotor;
	public static Talon leftMotor;

	public RobotDrive(Talon right, Talon left) {
		rightMotor = right;
		leftMotor = left;
	}

	public static void drive(double Y, double X, double driveMod){
		leftMotor.set((((Y*-1)* driveMod)+X));
		rightMotor.set(((Y* driveMod)+X));
	}
	

	public static void driveJS(double J1, double J2, double driveMod){
		leftMotor.set(J1);
		rightMotor.set(J2);
	}

	public static void deadTurn(double X, double driveMod) {
		leftMotor.set(driveMod * (X));
		rightMotor.set(driveMod * X);

	}
	public static void stop(){
		leftMotor.set(0);
		rightMotor.set(0);
	}
}
