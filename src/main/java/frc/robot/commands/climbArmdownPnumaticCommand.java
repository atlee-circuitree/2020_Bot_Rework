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
public class climbArmdownPnumaticCommand extends InstantCommand {
  /**
   * Add your docs here.
   */
  public climbArmdownPnumaticCommand() {
    super();
    requires(Robot.m_climbPnumaticSubsystem);
    armClimber();
  }

  DoubleSolenoid leftClimbArmPnumatic = null;
  DoubleSolenoid rightClimbArmPnumatic = null;

  public void armClimber() {

    leftClimbArmPnumatic = new DoubleSolenoid(RobotMap.leftClimbPnumatic_Deploy, RobotMap.leftClimbPnumatic_Retract);
    rightClimbArmPnumatic = new DoubleSolenoid(RobotMap.rightClimbPnumatic_Deploy, RobotMap.rightClimbPnumatic_Retract);

  }

  public void climbArmUp() {

    leftClimbArmPnumatic.set(Value.kForward);
    rightClimbArmPnumatic.set(Value.kForward);


  }
  public void climbArmDown() {

    leftClimbArmPnumatic.set(Value.kReverse);
    rightClimbArmPnumatic.set(Value.kReverse);

  }

  @Override
  public void initialize() {

    climbArmDown();
    
  }

}
