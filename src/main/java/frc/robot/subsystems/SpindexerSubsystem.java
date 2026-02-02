package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SpindexerSubsystem extends SubsystemBase { 

    SparkMax spindexer = new SparkMax(0, MotorType.kBrushless);

    public SpindexerSubsystem() {

        SparkMaxConfig spindexerConfig  = new SparkMaxConfig();

        spindexerConfig.idleMode(IdleMode.kBrake);
        spindexerConfig.smartCurrentLimit(40);
        spindexerConfig.voltageCompensation(12);

        spindexer.configure(spindexerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }
    
    public void runSpindexer(double speed) {
        spindexer.set(speed);
    }
}
