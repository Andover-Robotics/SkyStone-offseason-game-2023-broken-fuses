package org.firstinspires.ftc.teamcode;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class FourBar {
    private double height;
    private Motor fourBarMotor;
    public FourBar(double height){
        this.height = height;
        fourBarMotor = new Motor(hardwareMap, "motorTwo", Motor.GoBILDA.RPM_312);
        fourBarMotor.setRunMode(Motor.RunMode.RawPower);
    }

    public void LiftBar(double target, double speed){
        while(height < target){
            fourBarMotor.set(speed);
        }
    }

    public void DropBar(double target, double speed){
        while(height>target){
            fourBarMotor.set(speed);
        }
    }


}
