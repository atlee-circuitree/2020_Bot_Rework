/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;


public class conveyorbeltSubsystem extends Subsystem {


  private CANSparkMax leftmotor = null;
  private CANSparkMax rightmotor = null;

 public conveyorbeltSubsystem() {
    
 leftmotor = new CANSparkMax(RobotMap.conveyorbeltBackleftMotor, null);
 rightmotor = new CANSparkMax(RobotMap. conveyorbeltBackrightMotor, null);

  }

  public void conveyorbeltup() {

    leftmotor.set(1);
    rightmotor.set(-1);
  
  }

  public void conveyorbeltdown() {

    leftmotor.set(-1);
    rightmotor.set(1);

  }

  public void conveyorbeltstop() {

    leftmotor.set(0);
    rightmotor.set(0);
}
  @Override
  public void initDefaultCommand() {
  }
}
