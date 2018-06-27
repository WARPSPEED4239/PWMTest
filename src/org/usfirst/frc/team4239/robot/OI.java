/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4239.robot;

import org.usfirst.frc.team4239.robot.commands.MotorForward;
import org.usfirst.frc.team4239.robot.commands.MotorReverse;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public XboxController xbox = new XboxController(0);
	
	public JoystickButton
				xButtonBL,
				xButtonBR;
	
	public OI () {
		xButtonBL = new JoystickButton(xbox, 5);
		xButtonBR = new JoystickButton(xbox, 6);
		
		xButtonBL.whileHeld(new MotorReverse());
		xButtonBR.whileHeld(new MotorForward());
	}
	
	public XboxController getController() {
		return xbox;
	}
}
