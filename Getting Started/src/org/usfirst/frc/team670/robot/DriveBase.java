package org.usfirst.frc.team670.robot;
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

import org.usfirst.frc.team670.robot.Robot;
import org.usfirst.frc.team670.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBase extends Subsystem {
	private TalonSRX left1, right1, left2, right2;
	public static final double DRIVEBASE_TICKS_PER_ROTATION = 4096.0;

	// PID VALUES
	/**
	 * Creates the drivetrain, assuming that there are four talons.
	 * 
	 * @param fl
	 *            Front-left Talon ID
	 * @param fr
	 *            Front-right Talon ID
	 * @param bl
	 *            Back-left Talon ID
	 * @param br
	 *            Back-right Talon ID
	 */
	public DriveBase() {

	}

	/**
	 * Gets the Talon based on the ID.
	 * 
	 * @param id
	 *            The device ID of the Talon.
	 * @return The Talon bound to the ID port, or {@code null} if no drivetrain
	 *         Talon was found.
	 * 
	 * @see CAN RobotMap.CAN
	 */
	public TalonSRX getTalon(int id) {
		return null;
	}

	public void initJoystickDrive() {
		left1.setNeutralMode(NeutralMode.Coast);
		left2.setNeutralMode(NeutralMode.Coast);
		right1.setNeutralMode(NeutralMode.Coast);
		right2.setNeutralMode(NeutralMode.Coast);
	}

	public void drive(double left, double right) {

	}

	public void resetEncoders() {
		
	}

	/**
	 * Stops the motors by zeroing the left and right Talons.
	 */
	public void stop() {

	}

	public void initDefaultCommand() {

	}

	
	public void singleStickDrive(Joystick joy) {

	}

	public void singleStickDrive(double x, double y) {

	}

	public void singleDrive(Joystick joy) {

	}

	public void singleStickEther(Joystick joy) {


	}

}