// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.math.kinematics.DifferentialDriveWheelSpeeds;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix6.hardware.TalonFX;

public class DriveTrain extends SubsystemBase {
TalonFX m_leftrear;
TalonFX m_rightrear;
TalonFX m_leftfront;
TalonFX m_rightfront; 
MotorControllerGroup m_left;
MotorControllerGroup m_right;
DifferentialDrive m_drive;
E

  public DriveTrain() {
    m_leftrear = new TalonFX(Constants.k_leftrearPort);
    m_rightrear= new TalonFX(Constants.k_rightrearPort);
    m_leftfront = new TalonFX(Constants.k_leftfrontPort);
    m_rightfront  = new TalonFX(Constants.k_rightfrontPort);
    m_right = new MotorControllerGroup(m_rightfront, m_rightrear);
    m_left = new MotorControllerGroup(m_leftfront,  m_leftrear);
    m_drive = new DifferentialDrive(m_right, m_left);
    
  
 

  }
  public void move(double x , double y){
    m_drive.arcadeDrive(x,y);
    
  }
  

  


   
  
 

 
 




  



  


