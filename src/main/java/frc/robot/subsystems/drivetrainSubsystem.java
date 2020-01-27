/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//All the drivetrain code was taken from https://www.instructables.com/id/2019-FRC-Writing-a-Simple-Drive-Train-Java/

package frc.robot.subsystems;

//Default Imports

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

//import java.sql.Driver;

//Spark Imports

import com.revrobotics.CANSparkMax;
//import com.revrobotics.SparkMax;
//import edu.wpi.first.wpilibj.Spark;
//import com.revrobotics.CANSparkMaxLowLevel;

public class drivetrainSubsystem extends Subsystem {

  CANSparkMax fl, fr, rl, rr;
   

  public drivetrainSubsystem() {

    // Reasigns the motor values

    fl = new CANSparkMax(RobotMap.driveFrontleftMotor, null);
    fr = new CANSparkMax(RobotMap.driveFrontrightMotor, null);
    rl = new CANSparkMax(RobotMap.driveRearleftMotor, null);
    rr = new CANSparkMax(RobotMap.driveRearrightMotor, null);

    // Makes the left motors inverted 

    fl.setInverted(true);
    rl.setInverted(true);

    

  }

  public void initDefaultCommand() {
    
  
   
  }
}
