package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.Subsystems.Movement;
import org.firstinspires.ftc.teamcode.Subsystems.SampleMotorSubsystem;
import org.firstinspires.ftc.teamcode.Subsystems.SampleServoSubsystem;

public class SampleOpMode extends OpMode {
    Movement movement;
    SampleMotorSubsystem sampleMotorSubsystem;
    SampleServoSubsystem sampleServoSubsystem;

    @Override
    public void init() {
        movement = new Movement(hardwareMap);
        sampleMotorSubsystem = new SampleMotorSubsystem(hardwareMap);
        sampleServoSubsystem = new SampleServoSubsystem(hardwareMap);
    }

    @Override
    public void loop() {
        sampleMotorSubsystem.reset();

        // First Player
        if (gamepad1.a) {
            sampleMotorSubsystem.goUp();
        }
        if (gamepad1.x) {
            sampleMotorSubsystem.goDown();
        }

        // Second Player
        if (gamepad2.dpad_up) {
            sampleServoSubsystem.pos1();
        }
        if (gamepad2.dpad_up) {
            sampleServoSubsystem.pos2();
        }

        // update
        movement.robotCentricMove(gamepad1);
    }
}
