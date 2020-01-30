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
//import frc.robot.subsystems.climbPnumaticSubsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
//import frc.robot.subsystems.*;

/**
 * Add your docs here.
 */
public class climbdownPnumaticCommand extends InstantCommand {
  /**
   * Add your docs here.
   */
  public climbdownPnumaticCommand() {
    super();
    requires(Robot.m_climbPnumaticSubsystem);
    climber();
  }

  DoubleSolenoid leftClimbPnumatic = null;
  DoubleSolenoid rightClimbPnumatic = null;

  public void climber() {

    leftClimbPnumatic = new DoubleSolenoid(RobotMap.leftClimbPnumatic_Deploy, RobotMap.leftClimbPnumatic_Retract);
    rightClimbPnumatic = new DoubleSolenoid(RobotMap.rightClimbPnumatic_Deploy, RobotMap.rightClimbPnumatic_Retract);

  }

  public void climbUp() {

    leftClimbPnumatic.set(Value.kForward);
    rightClimbPnumatic.set(Value.kForward);


  }
  public void climbDown() {

    leftClimbPnumatic.set(Value.kReverse);
    rightClimbPnumatic.set(Value.kReverse);

  }

  @Override
  public void initialize() {

    climbDown();
    
  }

}
