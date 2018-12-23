package frc.robot;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.SerialPort.Port;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * @author shaylandias
 */
public class RobotMap {

    //DriveBase
    public static final int rightMotor1 = 4;
    public static final int rightMotor2 = 5;
    public static final int rightMotor3 = 6;
    public static final int leftMotor1 = 1;
    public static final int leftMotor2 = 2;
    public static final int leftMotor3 = 3;
    
    //Shooter
    public static final int shooter1 = 9;
    public static final int shooter2 = 10;
    public static final int shooterRotator = 11;
 
    //Intake
        //Solenoids
        public static final int intakeDeployer1 = 0;
        public static final int intakeDeployer2 = 2;
        
        //Motors
        public static final int intakeLeftTalon = 7;
        public static final int intakeRightTalon = 8;

    //Sensor Ports
    public final static Port navXPort = SerialPort.Port.kUSB;
        
    //CAN Systems
    public static final int pdp = 0;
    public static final int PCModule = 12;
    
    //Joysticks
    public final static int leftDriveStick = 0;
    public final static int rightDriveStick = 1;
    public final static int operatorStick = 2;
    public final static int arcadeStick = 3;


}