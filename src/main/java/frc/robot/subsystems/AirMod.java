// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.PneumaticsControlModule;

public class AirMod extends SubsystemBase {
  /** Creates a new AirMod. */

  private final PneumaticsControlModule m_Compressor = new PneumaticsControlModule(Constants.PCM_CAN_ID); 
  public AirMod() {


  }
public Command Start(){
m_Compressor.enableCompressorDigital();
  return null;
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
