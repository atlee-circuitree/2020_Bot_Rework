/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;
import frc.robot.subsystems.climbPnumaticSubsystem;

/**
 * Add your docs here.
 */
public class climbPnumaticCommand extends InstantCommand {
  /**
   * Add your docs here.
   */
  public climbPnumaticCommand() {
    super();
    requires(Robot.m_climbPnumaticSubsystem);

  }

  // Called once when the command executes
  private void requires(Command m_climbPnumaticSubsystem) {
  }

@Override
  protected void initialize() {

    Robot.climbPnumaticCommand.climbUp();
    
  }

}
