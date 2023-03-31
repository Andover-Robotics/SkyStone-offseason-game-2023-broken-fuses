package org.firstinspires.ftc.teamcode;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw{
    private final ServoEx claw;
    private final double close=1;
    private final double open=0;
    private boolean isOpen=false;

    public Claw(OpMode opMode){
        claw = (ServoEx) opMode.hardwareMap.servo.get("claw");
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
