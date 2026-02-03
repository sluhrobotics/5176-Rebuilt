package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkFlexConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase  {

    
    SparkFlex intakeRoller = new SparkFlex(0, MotorType.kBrushless);

    public IntakeSubsystem(){ 

        SparkFlexConfig intakeRollerConfig = new SparkFlexConfig();
        

        intakeRollerConfig.idleMode(IdleMode.kCoast);
        intakeRollerConfig.smartCurrentLimit(40);
        intakeRollerConfig.voltageCompensation(12);

        intakeRoller.configure(intakeRollerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }  

    public void spinIntake(double speed) {

        intakeRoller.set(speed);
    } 
}