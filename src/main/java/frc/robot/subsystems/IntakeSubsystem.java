package frc.robot.subsystems;

import com.revrobotics.spark.config.SparkMaxConfig;

import java.nio.channels.Pipe;

import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.config.SparkFlexConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkMax;

public class IntakeSubsystem extends SubsystemBase
{
    SparkFlex pickUpMotor = new SparkFlex(33,MotorType.kBrushless);
    SparkMax tiltMotor = new SparkMax(32, MotorType.kBrushed);
    
    public IntakeSubsystem()
    {
        SparkFlexConfig pickUpMotorConfig = new SparkFlexConfig();
        SparkMaxConfig tiltMotorConfig = new SparkMaxConfig();
    
        pickUpMotorConfig.idleMode(IdleMode.kBrake);
        pickUpMotorConfig.voltageCompensation(12);
        pickUpMotorConfig.smartCurrentLimit(40);



        tiltMotorConfig.idleMode(IdleMode.kBrake);
    }
}
