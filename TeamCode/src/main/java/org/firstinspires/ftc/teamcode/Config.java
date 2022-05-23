package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Config {
    public Telemetry telemetry = null;
    public HardwareMap hardwareMap = null;
    public Gamepad gamePad1 = null;
    public Gamepad gamePad2 = null;

    // Drive system
    public static final String rightFrontDrive = "rightFrontDrive";
    public static final String rightBackDrive = "rightBackDrive";
    public static final String leftFrontDrive = "leftFrontDrive";
    public static final String leftBackDrive = "leftBackDrive";

    public static final String rightFrontTest = "rightFrontTest";
    public static final String leftFrontTest = "leftFrontTest";
    public static final String armMotor = "armMotor";

    //public static final String carouselMotor = "eyeballmotor";

    private ElapsedTime runtime = new ElapsedTime();

    // Constructor
    Config(Telemetry tlm, HardwareMap hwm, Gamepad gmp1, Gamepad gmp2) {
        this.telemetry = tlm;
        this.hardwareMap = hwm;
        this.gamePad1 = gmp1;
        this.gamePad2 = gmp2;
    }

    void updateTelemetry() {
        telemetry.addData("Status", "Run Time: " + runtime.toString());

        telemetry.addData("G1: bumper", "%b %b", gamePad1.left_bumper, gamePad1.right_bumper);
        telemetry.addData("G1: trigger", "%4.2f, %4.2f", gamePad1.left_trigger, gamePad1.right_trigger);
    }
}
