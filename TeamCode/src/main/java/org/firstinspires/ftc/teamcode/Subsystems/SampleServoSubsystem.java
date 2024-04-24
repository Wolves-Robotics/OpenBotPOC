package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Constants.Consts;

public class SampleServoSubsystem {
    Consts consts;

    public SampleServoSubsystem(HardwareMap _hardwareMap) {
        consts = new Consts(_hardwareMap);
    }

    public void pos1() {
        consts.sampleServo.setPosition(1);
    }

    public void pos2() {
        consts.sampleServo.setPosition(0);
    }
}
