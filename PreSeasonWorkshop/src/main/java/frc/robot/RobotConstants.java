package frc.robot;

/**
 * Various constants pertaining to elements of the robot to be used throughout the code.
 * @author shaylandias
 */
public class RobotConstants {

	// All PID Variables
	public static final int kSlotIdx = 0;
	public static final int kPIDLoopIdx = 0;
	public static final int kTimeoutMs = 10;
	public static final double KU = 0.275; //Original P value
	public static final double TU = 4.46; //Oscillation in seconds
	public static final double PROPORTION = 0.2*KU;
	public static final double INTEGRAL = 0;//0.05*KU/TU;
	public static final double DERIVATIVE = 5*KU*TU/40;
	public static final double F = 0.02;//0.03

	public static final double ROBOT_WIDTH = 33.25, ROBOT_LENGTH = 38; // LENGTH AND WIDTH WITH BUMPERS

	// Ticks for one rotation of a drivebase wheel
	public static final double TICKS_PER_ROTATION = 4096.0;

	// Pivot radius of the robot in degrees
	public static final double PIVOT_RADIUS = 17.51;

	// Distance from the front of the robot to the elevator
	public static final double FRONT_TO_ELEVATOR = 12.5;

	// Diameter of wheels in drivebase in inches
	public static final double DRIVEBASE_WHEEL_DIAMETER = 6;
	public static final double DRIVEBASE_GEAR_RATIO = 1.0;
	// Diameter of wheel in elevator in inches
	public static final double TURRET_DIAMETER = 18; //Not sure if this is correct
}