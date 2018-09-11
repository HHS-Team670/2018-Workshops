package org.usfirst.frc.team670.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * @author vsharma
 */
public class RobotMap {
		
	//DriveBase
	public static final int rightMotor1 = 3;
    public static final int rightMotor2 = 4;
    public static final int leftMotor1 = 1;
    public static final int leftMotor2 = 2;
	    
    //CAN Systems
    public static final int pdp = 0;
	public static final int PCModule = 9;
    
    //Joysticks
    public final static int leftDriveStick = 0;
    public final static int rightDriveStick = 1;
    public final static int operatorStick = 2;
    public final static int arcadeStick = 3;
    
}