/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.Constants;

public class intakeSubsystem extends Subsystem {

  ublic static CANSparkMax intakeMotor = new CANSparkMax(Constants.intakeMotorPort, MotorType.kBrushless);

  public intakeSubsystem() {

}

public void takeinballs() {

  intakeMotor.set(1);

}

public void spitoutballs() {

  intakeMotor.set(-1);
  
}

public void setIntakeSpeed(){
  intakeMotor.set(Constants.intakeSpeed);
}

@Override
public void periodic() {
  // This method will be called once per scheduler run
}
}
