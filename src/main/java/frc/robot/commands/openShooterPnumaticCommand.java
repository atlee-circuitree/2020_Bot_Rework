/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
//import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
//import frc.robot.subsystems.shooterPnumaticSubsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
//import frc.robot.subsystems.*;

/**
 * Add your docs here.
 */
public class openShooterPnumaticCommand extends InstantCommand {
  /**
   * Add your docs here.
   */
  public openShooterPnumaticCommand() {
    super();
    requires(Robot.m_climbPnumaticSubsystem);
    shooter();
  }

  DoubleSolenoid shooterPnumatic = null;

  public void shooter() {

    shooterPnumatic = new DoubleSolenoid(RobotMap.leftClimbPnumatic_Deploy, RobotMap.leftClimbPnumatic_Retract);

  }

  public void openShooter() {

    shooterPnumatic.set(Value.kForward);
    
  }
  public void closeShooter() {

    shooterPnumatic.set(Value.kReverse);

  }

  @Override
  public void initialize() {

    openShooter();
    
  }

}
