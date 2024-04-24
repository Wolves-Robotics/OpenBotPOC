package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Constants.Consts;

public class SampleMotorSubsystem {
    Consts consts;
    public SampleMotorSubsystem(HardwareMap _hardwareMap) {
        consts = new Consts(_hardwareMap);
    }

    public void goUp() {
        consts.sampleMotor.setPower(1);
    }

    public void goDown() {
        consts.sampleMotor.setPower(-1);
    }

    public void reset() {
        consts.sampleMotor.setPower(0);
    }
}
