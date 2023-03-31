package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;

@TeleOp(name="MainTeleop", group="teleop")
public class MainTeleop extends LinearOpMode {
    Telemetry telementry;
    @Override
    public void runOpMode() {
        telementry.addData("Status", "Initialized");
        telementry.update();

        waitForStart();
        telementry.addData("Status", "Running");
        telementry.update();
        while(opModeIsActive()) {
            
        }
    }
}




