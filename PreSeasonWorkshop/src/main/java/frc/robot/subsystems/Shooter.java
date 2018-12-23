/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.RobotConstants;

/**
 * Add your docs here.
 */
public class Shooter extends Subsystem implements PIDSource {
  
  private WPI_TalonSRX shooter1, shooter2, turret;
  private PIDController turretController;
  private PIDSourceType pidType = PIDSourceType.kDisplacement;

  public Shooter() {
    shooter1 = new WPI_TalonSRX(RobotMap.shooter1);
    shooter2 = new WPI_TalonSRX(RobotMap.shooter2);
    turret = new WPI_TalonSRX(RobotMap.shooterRotator);
    turretController = new PIDController(0.5, 0, 0, this, turret);
    turretController.setContinuous();
    turretController.setInputRange(0, 360);
  }

  public void setTurretSetpoint(double angle) {
    turretController.setSetpoint(angle);
  }

  public void runShooter(double power) {
    shooter1.set(ControlMode.PercentOutput, power);
    shooter2.set(ControlMode.PercentOutput, power);
  }

@Override
public PIDSourceType getPIDSourceType() {
  return pidType;
}

@Override
public void setPIDSourceType(PIDSourceType pidSource) {
  pidType = pidSource;
}

@Override
public double pidGet() {
  double quadPosition = turret.getSensorCollection().getQuadraturePosition();
  double degrees = ((quadPosition / RobotConstants.TICKS_PER_ROTATION) * 360) % 360;
  if(quadPosition >= 0)
    return degrees;
  else
    return 360 + degrees;
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
