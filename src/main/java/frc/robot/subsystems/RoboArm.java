// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;


public class RoboArm extends SubsystemBase {
  /** Creates a new RoboArm. */

  private final WPI_TalonFX m_ArmMotor = new WPI_TalonFX(Constants.Arm_Motor);

  
  public RoboArm() {

    
  }
public Command Arm_Motor_Forward(){

  m_ArmMotor.set(Constants.Arm_Motor_Speed);

return null;

}
public Command Arm_Motor_Reverse(){

  m_ArmMotor.set(Constants.Arm_Motor_Speed*(-1));

  return null;
}
public Command Arm_Motor_Stop(){
  m_ArmMotor.stopMotor();

  return null;
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
