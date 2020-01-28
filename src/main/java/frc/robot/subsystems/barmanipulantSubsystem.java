/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class barmanipulantSubsystem extends Subsystem {

  CANSparkMax bar;

public barmanipulantSubsystem() {

  bar = new CANSparkMax(RobotMap.barmotor, null);
  
}
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
