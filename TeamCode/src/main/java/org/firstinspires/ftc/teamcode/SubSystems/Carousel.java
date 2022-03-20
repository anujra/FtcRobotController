package org.firstinspires.ftc.teamcode.SubSystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.Config;

public class Carousel implements SubSystem {

    private Config config = null;
    private DcMotor carouselMotor = null;
    double medPower = 0.5;
    double maxPower = 1.0;

    public Carousel(Config cfg) {
        this.config = cfg;
    }

    public void init() {

        // Initialize the hardware variables. Note that the strings used here must correspond
        // to the names assigned during the robot configuration step on the DS or RC devices.
        carouselMotor = config.hardwareMap.get(DcMotor.class, Config.carouselMotor);
    }

    public void runOnce() {
        if (config.gamePad1.right_bumper)
            carouselMotor.setPower(medPower);
        else if (config.gamePad1.left_bumper)
            carouselMotor.setPower(maxPower);
        else
            carouselMotor.setPower(0);
    }
}