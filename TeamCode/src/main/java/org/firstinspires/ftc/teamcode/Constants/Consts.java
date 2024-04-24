package org.firstinspires.ftc.teamcode.Constants;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.Servo;

public class Consts {
    private final HardwareMap hardwareMap;
    public IMU imu;

    public DcMotor frontLeft, frontRight, backLeft, backRight;
    public DcMotor sampleMotor;

    public Servo sampleServo;

    public Consts(HardwareMap _hardwareMap) {
        hardwareMap = _hardwareMap;

        setMotors();

        setServos();

        setImu();
    }

    private void setMotors() {
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        sampleMotor = hardwareMap.dcMotor.get("sampleMotor");

        frontLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        frontRight.setDirection(DcMotorSimple.Direction.FORWARD);
        backLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        backRight.setDirection(DcMotorSimple.Direction.FORWARD);
        sampleMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    private void setServos() {
        sampleServo = hardwareMap.servo.get("sampleServo");

        sampleServo.setDirection(Servo.Direction.FORWARD);
    }

    private void setImu() {
        imu = hardwareMap.get(IMU.class, "imu");
        IMU.Parameters parameters = new IMU.Parameters(new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.LEFT,
                RevHubOrientationOnRobot.UsbFacingDirection.BACKWARD));
        imu.initialize(parameters);
        imu.resetYaw();
    }

    public void init() {
        sampleServo.setPosition(0);
    }
}
