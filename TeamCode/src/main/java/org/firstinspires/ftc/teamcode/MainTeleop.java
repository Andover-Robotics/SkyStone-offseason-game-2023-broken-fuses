package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
//import the MechanumDrive class

@TeleOp(name="MainTeleop", group="teleop")
public class MainTeleop extends LinearOpMode {
    Telemetry telemetry;
    Gamepad gp2= new Gamepad();
    Slides slides = new Slides();
    Claw claw= new Claw();
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
            if(gp2.dpad_down){
                slides.runTo(10);
            }
            else if(gp2.dpad_up){
                slides.runTo(20);
            }
            else if(gp2.dpad_right){
                slides.runTo(15);
            }
            else if(gp2.dpad_left){
                slides.runTo(5);
            }
            else if(gp2.x){
                claw.close();
            }
            else if(gp2.y){
                claw.open();
            }

        }

    }
}




