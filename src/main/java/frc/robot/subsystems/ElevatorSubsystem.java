/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


public class ElevatorSubsystem extends Subsystem {

  CANSparkMax elevator;
 

  public ElevatorSubsystem() {

    elevator = new CANSparkMax(RobotMap.ElevatorMotor, null);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }
}
