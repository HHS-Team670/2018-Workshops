/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

/**
 * Drives the robot using Joystick input
 * @author shaylandias
 */
public class Joystick_TankDrive extends InstantCommand {
  
  public Joystick_TankDrive() {
    super();
    requires(Robot.driveBase);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.driveBase.tankDrive(Robot.m_oi.getLeftJoystick().getY(), Robot.m_oi.getRightJoystick().getY());
  }
}
