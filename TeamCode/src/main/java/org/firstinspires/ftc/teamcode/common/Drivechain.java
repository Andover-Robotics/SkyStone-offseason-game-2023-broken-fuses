package org.firstinspires.ftc.teamcode.common;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.Motor;

public class Drivechain extends MecanumDrive {
    public Drivechain(){
        super(hardwareMap.get(Motor.class, "FR_motor"), hardwareMap.get(Motor.class, "FL_motor"), hardwareMap.get(Motor.class, "BR_motor"), hardwareMap.get(Motor.class, "BL_motor");
    }
}
