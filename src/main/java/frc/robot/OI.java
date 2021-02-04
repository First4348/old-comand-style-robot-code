// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator interface to the commands
 * and command groups that allow control of the robot.
 */
public class OI {

  Joystick driverStick = new Joystick(0);
  Joystick operatorStick = new Joystick(1);



public Joystick getDriverStick(){
  return driverStick;
}
public Joystick getOperatorStick(){
  return operatorStick;
}

}