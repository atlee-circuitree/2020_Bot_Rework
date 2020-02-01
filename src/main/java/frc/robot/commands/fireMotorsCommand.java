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
import frc.robot.subsystems.shooterMotorsSubsystem;

public class shootMotorsCommand extends Command {
  public shootMotorsCommand() {
 requires(Robot.m_shooterMotorsSubsystem);

  }

private void requires(Command shooterMotorsSubsystem){
}
  
  @Override
  protected void initialize() {

    Robot.m_shootMotorsCommand.motorsfire();
    
   }

  @Override
  protected boolean isFinished() {
    // TODO Auto-generated method stub
    return false;
  }

  }
