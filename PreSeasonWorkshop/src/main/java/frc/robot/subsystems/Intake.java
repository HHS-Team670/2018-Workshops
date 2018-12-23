/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Intake for the robot
 */
public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private WPI_TalonSRX intake1, intake2;
  private Solenoid sol1, sol2;
  private Compressor compressor;

  public Intake() {
    compressor = new Compressor(RobotMap.PCModule);
    compressor.setClosedLoopControl(true);
    sol1 = new Solenoid(RobotMap.intakeDeployer1);
    sol2 = new Solenoid(RobotMap.intakeDeployer2);

    intake1 = new WPI_TalonSRX(RobotMap.intakeLeftTalon);
    intake2 = new WPI_TalonSRX(RobotMap.intakeRightTalon);
    intake2.setInverted(true);
  }

  public void deployIntake(){
    setSolenoids(true);
  }

  public void undeployIntake(){
    setSolenoids(false);
  }

  private void setSolenoids(boolean on){
    sol1.set(on);
    sol2.set(on);
  }

  /**
   * 
   * Runs the intake based on input power
   * 
   * @param power Motor input [-1, 1]
   */
  public void runIntake(double power) {
    intake1.set(ControlMode.PercentOutput, power);
    intake2.set(ControlMode.PercentOutput, power);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
