package frc.robot.drive;

//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import com.ctre.phoenix.motorcontrol.ControlMode;
import com.revrobotics.CANSparkMax;
//import com.revrobotics.ControlType;

//import frc.robot.subsystems.drivetrainSubsystem;

//All the drivetrain code was taken from https://www.instructables.com/id/2019-FRC-Writing-a-Simple-Drive-Train-Java/

public final class driveRobot {
    // TODO - Add mecanum drive, holonomic drive

    CANSparkMax driveFrontleftMotor, driveFrontrightMotor, driveRearleftMotor, driveRearrightMotor, motor5, motor6;
    DriveMode driveMode;

    public static enum DriveMode {
        TWO, FOUR, SIX;
    }

    // This constructor is for 2 motors without follower or with follower

    public driveRobot(CANSparkMax left, CANSparkMax right) {
        driveMode = DriveMode.TWO;

        driveFrontleftMotor = right;
        driveFrontrightMotor = left;
    }

    // This constructor is for 4 motors without follower

    public driveRobot(CANSparkMax leftFront, CANSparkMax leftBack, CANSparkMax rightFront, CANSparkMax rightBack) {
        driveMode = DriveMode.FOUR;
        driveFrontleftMotor = rightFront;
        driveFrontrightMotor = rightBack;
        driveRearleftMotor = leftFront;
        driveRearrightMotor = leftBack;
    }

    // This constructor is for 6 motors without follower

    public driveRobot(CANSparkMax leftFront, CANSparkMax leftMiddle, CANSparkMax leftBack, CANSparkMax rightFront,
            CANSparkMax rightMiddle, CANSparkMax rightBack) {
        driveMode = DriveMode.SIX;
        driveFrontrightMotor = rightFront;
        motor5 = rightMiddle;
        driveRearrightMotor = rightBack;
        driveFrontleftMotor = leftFront;
        motor6 = leftMiddle;
        driveRearleftMotor = leftBack;
    }

    // This method is used for driving arcade style

    public void driveArcade(double moveValue, double rotateValue) {
        double leftMotorSpeed;
        double rightMotorSpeed;

        moveValue = limitValue(moveValue);
        rotateValue = limitValue(rotateValue);

        if (moveValue >= 0.0) {
            if (rotateValue >= 0.0) {
                leftMotorSpeed = moveValue - rotateValue;
                rightMotorSpeed = Math.max(moveValue, rotateValue);
            } else {
                leftMotorSpeed = Math.max(moveValue, -rotateValue);
                rightMotorSpeed = moveValue + rotateValue;
            }
        } else {
            if (rotateValue >= 0.0) {
                leftMotorSpeed = -Math.max(-moveValue, rotateValue);
                rightMotorSpeed = moveValue + rotateValue;
            } else {
                leftMotorSpeed = moveValue - rotateValue;
                rightMotorSpeed = -Math.max(-moveValue, -rotateValue);
            }
        }
        // setMotorOutputs(-rightMotorSpeed, -leftMotorSpeed);

    }

    // This method will write the motor percent output to both the right and the
    // left
    /*public void setMotorOutputs(double left, double right) {
        if (driveMode == DriveMode.TWO) {
            talon1.set(ControlMode.PercentOutput, right);
			talon2.set(ControlMode.PercentOutput, left);
		}
		if (driveMode == DriveMode.FOUR)
		{
			talon1.set(ControlMode.PercentOutput, right);
			talon2.set(ControlMode.PercentOutput, right);
			talon3.set(ControlMode.PercentOutput, left);
			talon4.set(ControlMode.PercentOutput, left);
		}
		if (driveMode == DriveMode.SIX)
		{
			talon1.set(ControlMode.PercentOutput, right);
			talon2.set(ControlMode.PercentOutput, right);
			talon3.set(ControlMode.PercentOutput, right);
			talon4.set(ControlMode.PercentOutput, left);
			talon5.set(ControlMode.PercentOutput, left);
			talon6.set(ControlMode.PercentOutput, left);
		}
	}*/

  //This method is to limit the stick imputs to make sure that they dont go above or below 1 or -1
	private double limitValue(double value)
	{
		if (value > 1.0)
			value = 1.0;
		if (value < -1.0)
			value = -1.0;
		return value;
    }
}