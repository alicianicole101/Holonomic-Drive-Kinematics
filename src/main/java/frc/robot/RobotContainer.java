// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.TeleOpControl;
import frc.robot.subsystems.HolonomicChassisSim;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer
{
    private final Joystick joystick;
    private final HolonomicChassisSim chassisSim;
    public RobotContainer()
    {
        joystick = new Joystick(0);
        chassisSim = new HolonomicChassisSim();
        chassisSim.setDefaultCommand(new TeleOpControl(
                chassisSim,
                () -> joystick.getRawAxis(0),
                () -> -joystick.getRawAxis(1),
                () -> joystick.getRawAxis(2)
        ));
        configureBindings();
    }
    
    
    /** Use this method to define your trigger->command mappings. */
    private void configureBindings()
    {

    }
    
    
    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand()
    {
        // TODO: Implement properly
        return null;
    }
}
