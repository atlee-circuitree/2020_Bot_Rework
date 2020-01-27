/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

 // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  // Map all the motors / pnumatics here

  public static int driveFrontleftMotor = 0;
  public static int driveFrontrightMotor = 1;
  public static int driveRearleftMotor = 2;
  public static int driveRearrightMotor = 3;

<<<<<<< HEAD
  // Solenoids

  public static final int leftClimbPnumatic_Deploy = 0;
  public static final int leftClimbPnumatic_Retract = 1;
  public static final int rightClimbPnumatic_Deploy = 0;
  public static final int rightClimbPnumatic_Retract = 1;
=======
  public static int conveyorbeltFrontrightMotor = 4;
  public static int conveyorbeltFrontleftMotor = 5;
  public static int conveyorbeltBackrightMotor = 6;
  public static int conveyorbeltBackleftMotor = 7;

  public static int shooterrightMotor = 8;
  public static int shooterleftMotor = 9;

  public static int ElevatorMotor = 10;
  
  public static int intakeMotor = 11;

  public static int colorwheelmotor = 12;

  public static int barmotor = 13;



>>>>>>> 5b116b9602670a535a690d522534a4f69dc47437
   
}
