// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/** Add your docs here. */
public class Drive_System extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // creat moter controller objects to use in the program
  VictorSP front_right = new VictorSP(RobotMap.f_right);
  VictorSP back_right = new VictorSP(RobotMap.b_right);
  VictorSP front_left = new VictorSP(RobotMap.f_left);
  VictorSP back_left = new VictorSP(RobotMap.b_left);

  SpeedControllerGroup left = new SpeedControllerGroup(front_left, back_left);
  SpeedControllerGroup right = new SpeedControllerGroup(front_right, back_right);

  public DifferentialDrive drive;

  public drive_system(){
    front_right.setInverted(false);
    back_right.setInverted(false);
    front_left.setInverted(false);
    back_left.setInverted(false);

    drive = new DifferentialDrive(left, right)
  };

public void driveJoyStick(Joystick joystick,double speed){

  drive.arcadeDrive(joystick.getY()*speed,joystick.getX()*speed);

}
public void drive(double speed, double rotationSpeed){
  drive.arcadeDrive(speed,rotationSpeed);
}
public void stop(){
  drive.stop();
}
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

public void stop() {
}


}
