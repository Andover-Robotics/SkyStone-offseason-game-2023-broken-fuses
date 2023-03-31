package org.firstinspires.ftc.teamcode;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw{
    private final double close=1;
    private final double open=0;
    private final ServoEx claw;

    private boolean isOpen=false;

    public Claw(OpMode opMode){
         claw= new SimpleServo (
                hardwareMap, "servo_name", close, open);
        claw.setPosition(open);
    }
    public void open(){
        claw.setPosition(open);
        isOpen = true;
    }

    public void close(){
        claw.setPosition(close);
        isOpen = false;
    }

}
