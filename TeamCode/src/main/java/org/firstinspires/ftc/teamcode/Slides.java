package org.firstinspires.ftc.teamcode;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.arcrobotics.ftclib.controller.PIDFController;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class Slides {
    double p=1;
    double i=1;
    double d= 1;
    double f=1;
    private final PIDFController controller = new PIDFController(p, i, d, f);;
    private final double positionCoefficent=0.05;
    private final Motor slides;
    public Slides(OpMode opMode) {
        slides = new Motor(hardwareMap, "motorTwo", Motor.GoBILDA.RPM_312);
        slides.setPositionTolerance(2);
        slides.setRunMode(Motor.RunMode.PositionControl);
        slides.setPositionCoefficient(positionCoefficent);
        slides.setZeroPowerBehavior(Motor.ZeroPowerBehavior.BRAKE);
    }
    public void runTo(int position){
        slides.setTargetPosition(position);
        while (!slides.atTargetPosition()) {
            slides.set(position);
        }
        slides.stopMotor();
    }



}
