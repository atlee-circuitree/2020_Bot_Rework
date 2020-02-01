/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import frc.robot.commands.shootMotorsCommand;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;



  public class shooterMotorsSubsystem extends Subsystem{
  
  CANSparkMax leftmotorshooter = null;
  CANSparkMax rightmotorshooter = null;


 public void shooter() 
  {      
    leftmotorshooter = new CANSparkMax(RobotMap.shooterleftMotor, null);
    rightmotorshooter = new CANSparkMax(RobotMap.shooterrightMotor, null);
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
  public void initDefaultCommand() {

    
  }
}
