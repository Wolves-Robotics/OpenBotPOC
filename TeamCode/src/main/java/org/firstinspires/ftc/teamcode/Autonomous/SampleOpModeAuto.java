package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.Constants.AutoConsts;

public class SampleOpModeAuto extends OpMode {
    AutoConsts.AutoEnum autoEnum;


    @Override
    public void init() {
        autoEnum = AutoConsts.AutoEnum.FORWARD;
    }

    @Override
    public void loop() {
        switch (autoEnum) {
            case START:
                break;
            case FORWARD:
                break;
            case RIGHT:
                break;
            case UPLEFT:
                break;
            case UPRIGHT:
                break;
            case TURNRIGHT:
                break;
            case TURNLEFT:
                break;
            case IDLE:
                break;
        }
    }
}
