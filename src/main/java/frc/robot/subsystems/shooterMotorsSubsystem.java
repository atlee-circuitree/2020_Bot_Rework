/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.CANDigitalInput;
import com.revrobotics.CANEncoder;
import com.revrobotics.EncoderType;
import frc.robot.RobotMap;


  public class shooterMotorsSubsystem extends Subsystem{
  
  CANSparkMax lmr, rm;
  private CANDigitalInput m_forwardLimit;
  private CANDigitalInput m_reverseLimit;
  private CANEncoder m_leftencoder;
  private CANEncoder m_rightencoder;

 public shooterMotorsSubsystem() 
  {      
    lmr = new CANSparkMax(RobotMap.shooterleftMotor, null);
    rm = new CANSparkMax(RobotMap.shooterrightMotor, null);
  }
@Override
    public void periodic() {
      
      m_forwardLimit.enableLimitSwitch(SmartDashboard.getBoolean("Forward Limit Enabled", false));
      m_reverseLimit.enableLimitSwitch(SmartDashboard.getBoolean("Reverse Limit Enabled", false));  
      
      SmartDashboard.putBoolean("Forward Limit Switch", m_forwardLimit.get());
      SmartDashboard.putBoolean("Reverse Limit Switch", m_reverseLimit.get());

    }
  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }
  }
