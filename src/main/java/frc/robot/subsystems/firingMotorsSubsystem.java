/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class firingMotorsSubsystem extends Subsystem{
  
  public static CANSparkMax leftmotorshooter = new CANSparkMax(Constants. rightmotorshooterMotorPort);
  public static CANSparkMax rightmotorshooter = new CANSparkMax(Constants. leftmotorshooterPort);
 
  public void shooter() 
  {      
    
  }

  public void motorsfire() {

    leftmotorshooter.set(-1);
    rightmotorshooter.set(1);
  
  }

  public void motorsStop() {

    leftmotorshooter.set(0);
    rightmotorshooter.set(0);

  }

  @Override
  public void periodic() {

  }
  
  public void setConveyorBeltSpeed(){
    leftmotorshooter.set(Constants.conveyorBeltSpeed);
    rightmotorshooter.set(Constants.conveyorBeltSpeed);
  }
}
