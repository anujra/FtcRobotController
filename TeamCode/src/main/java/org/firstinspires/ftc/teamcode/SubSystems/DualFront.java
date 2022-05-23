package org.firstinspires.ftc.teamcode.SubSystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.Config;

public class DualFront implements SubSystem {

    private Config config = null;
    private DcMotor rightFrontTestMotor = null;
    private DcMotor leftFrontTestMotor = null;
    double medPower = 0.2;
    double maxPower = 0.5;

    public DualFront(Config cfg) {
        this.config = cfg;
    }

    public void init() {

        // Initialize the hardware variables. Note that the strings used here must correspond
        // to the names assigned during the robot configuration step on the DS or RC devices.
        rightFrontTestMotor = config.hardwareMap.get(DcMotor.class, Config.rightFrontTest);
        leftFrontTestMotor = config.hardwareMap.get(DcMotor.class, Config.leftFrontTest);
    }

    public void runOnce() {
        if (config.gamePad1.right_bumper)
            rightFrontTestMotor.setPower(maxPower);
        else if (config.gamePad1.left_bumper)
            rightFrontTestMotor.setPower(medPower);
        else
            rightFrontTestMotor.setPower(0);

        config.telemetry.addData("Right/Left Bumper", "%b, %b",
                    config.gamePad1.right_bumper, config.gamePad1.left_bumper);

    }
}