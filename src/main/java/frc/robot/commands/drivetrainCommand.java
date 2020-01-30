/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//All the drivetrain code was taken from https://www.instructables.com/id/2019-FRC-Writing-a-Simple-Drive-Train-Java/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.drive.driveRobot;
import frc.robot.Robot;
//import frc.robot.subsystems.drivetrainSubsystem;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class drivetrainCommand extends Command {
  public drivetrainCommand() {

    requires(Robot.m_subsystem);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

   // Assigns the drive code to the stick

    ((driveRobot) Robot.driveRobot).driveArcade(Robot.m_oi.driver.getY(Hand.kLeft),Robot.m_oi.driver.getX(Hand.kRight));
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    ((driveRobot) Robot.driveRobot).driveArcade(0, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
