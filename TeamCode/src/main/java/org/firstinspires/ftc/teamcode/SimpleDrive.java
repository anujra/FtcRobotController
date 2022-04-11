package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Basic: SimpleDrive", group="Linear Opmode")
public class SimpleDrive extends LinearOpMode {
    // Config
    Config config = null;
    ManualRobot manualRobot = null;

    @Override
    public void runOpMode() {

        config = new Config(telemetry, hardwareMap, gamepad1, gamepad2);
        manualRobot = new ManualRobot(config);

        manualRobot.init();
        waitForStart();

        while (opModeIsActive()) {
            config.updateTelemetry();

            // runs each sub-system once
            manualRobot.runOnce();

            // Show the elapsed game time and wheel power.
            telemetry.update();
        }
    }
}

