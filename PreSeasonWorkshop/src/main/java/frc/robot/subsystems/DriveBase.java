/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.Joystick_TankDrive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Add your docs here.
 * @author shaylandias
 */
public class DriveBase extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private WPI_TalonSRX left1, left2, left3, right1, right2, right3;
  private SpeedControllerGroup left, right;
  private DifferentialDrive drivetrain;
  private List<WPI_TalonSRX> leftMotors = Arrays.asList(left1, left2, left3), rightMotors = Arrays.asList(right1, right2, right3);
  private List<WPI_TalonSRX> allMotors;

  public DriveBase() {

    allMotors = new ArrayList<WPI_TalonSRX>(leftMotors);
    allMotors.addAll(rightMotors);

    left1 = new WPI_TalonSRX(RobotMap.leftMotor1);
    left2 = new WPI_TalonSRX(RobotMap.leftMotor2);
    left3 = new WPI_TalonSRX(RobotMap.leftMotor3);
    right1 = new WPI_TalonSRX(RobotMap.rightMotor1);
    right2 = new WPI_TalonSRX(RobotMap.rightMotor2);
    right3 = new WPI_TalonSRX(RobotMap.rightMotor3);

    left2.set(ControlMode.Follower, left1.getDeviceID());
    left3.set(ControlMode.Follower, left1.getDeviceID());
    right2.set(ControlMode.Follower, right1.getDeviceID());
    right3.set(ControlMode.Follower, right1.getDeviceID());

    left = new SpeedControllerGroup(left1, left2, left3);
    right = new SpeedControllerGroup(right1, right2, right3);
    
    right.setInverted(true);

    drivetrain = new DifferentialDrive(left, right);
  }

  public void setBrake(){
    for(WPI_TalonSRX m : allMotors){
      setNeutralMode(m, NeutralMode.Brake);
    }
  }

  public void setCoast(){
    for(WPI_TalonSRX m : allMotors){
      setNeutralMode(m, NeutralMode.Coast);
    }
  } 

  private void setNeutralMode(WPI_TalonSRX talon, NeutralMode mode){
    talon.setNeutralMode(mode);
  }

  /**
   * Runs tank drive on the drive base
   * 
   * @param leftSpeed speed for left motor
   * @param rightSpeed speed for right motor
   */
  public void tankDrive(double leftSpeed, double rightSpeed){
    drivetrain.tankDrive(leftSpeed, rightSpeed);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new Joystick_TankDrive());
  }
}
