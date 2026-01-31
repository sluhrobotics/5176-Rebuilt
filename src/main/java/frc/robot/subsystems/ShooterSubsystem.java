package frc.robot.subsystems;

import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.config.SparkFlexConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
    
    SparkFlex shooterCW = new SparkFlex(12, MotorType.kBrushless);
    SparkFlex shooterCCW = new SparkFlex(11, MotorType.kBrushless);


    public ShooterSubsystem()
    {

        SparkFlexConfig shooterLeaderConfig = new SparkFlexConfig();
        SparkFlexConfig shooterFollowerConfig = new SparkFlexConfig();
        
        shooterLeaderConfig.closedLoop.pid(0.1, 0., 0);
        
        shooterLeaderConfig.idleMode(IdleMode.kBrake);
        shooterLeaderConfig.voltageCompensation(12);
        shooterLeaderConfig.smartCurrentLimit(40);
        shooterLeaderConfig.closedLoopRampRate(0.01);
        
        shooterFollowerConfig = shooterLeaderConfig;

        shooterFollowerConfig.follow(11, true);


        shooterCW.configure(shooterLeaderConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
        shooterCCW.configure(shooterFollowerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

    }

    /** This is a method that makes the roller spin */
    public void runRoller(double speed) {
    shooterCW.set(speed);
  }

}
