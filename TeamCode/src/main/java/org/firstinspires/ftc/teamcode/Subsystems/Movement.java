package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Constants.Consts;

public class Movement {
    Consts consts;
    public Movement(HardwareMap _hardwareMap) {
        consts = new Consts(_hardwareMap);

        consts.init();
    }

    public void robotCentricMove(Gamepad gamepad) {
        double y = -gamepad.left_stick_y; // Remember, Y stick value is reversed
        double x = gamepad.left_stick_x * 1.1; // Counteract imperfect strafing
        double rx = gamepad.right_stick_x;

        // Denominator is the largest motor power (absolute value) or 1
        // This ensures all the powers maintain the same ratio,
        // but only if at least one is out of the range [-1, 1]
        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
        double frontLeftPower = (y + x + rx) / denominator;
        double backLeftPower = (y - x + rx) / denominator;
        double frontRightPower = (y - x - rx) / denominator;
        double backRightPower = (y + x - rx) / denominator;

        consts.frontLeft.setPower(frontLeftPower);
        consts.backLeft.setPower(backLeftPower);
        consts.frontRight.setPower(frontRightPower);
        consts.backRight.setPower(backRightPower);
    }
}
