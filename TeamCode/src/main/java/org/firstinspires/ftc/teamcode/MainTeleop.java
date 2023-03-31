package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.DcMotor;
//import the MechanumDrive class

@TeleOp(name="MainTeleop", group="teleop")
public class MainTeleop extends LinearOpMode {
    Telemetry telemetry;
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        //make the MechanumDrive
        DcMotor FR_motor = hardwareMap.get(DcMotor.class, "FR_motor");
        DcMotor FL_motor = hardwareMap.get(DcMotor.class, "FL_motor");
        DcMotor BR_motor = hardwareMap.get(DcMotor.class, "BR_motor");
        DcMotor BL_motor = hardwareMap.get(DcMotor.class, "BL_motor");
        FR_motor.setDirection(DcMotor.Direction.REVERSE);
        BR_motor.setDirection(DcMotor.Direction.REVERSE);

//        MechanumDrive

        FL_motor.setDirection(DcMotor.Direction.REVERSE);
        BL_motor.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        telemetry.addData("Status", "Running");
        telemetry.update();
        while(opModeIsActive()) {
            
        }

    }
}




