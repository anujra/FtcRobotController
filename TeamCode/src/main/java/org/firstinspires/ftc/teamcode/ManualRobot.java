package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.SubSystems.DualFront;
import org.firstinspires.ftc.teamcode.SubSystems.Drive;
import org.firstinspires.ftc.teamcode.SubSystems.SubSystem;

import java.util.LinkedList;
import java.util.List;

public class ManualRobot {

    // Config class to all hardware controls
    Config config;
    List<SubSystem> subSystems = new LinkedList<SubSystem>();

    // Constructor
    public ManualRobot(Config cfg) {
        config = cfg;
        subSystems.add(new Drive(config));
        subSystems.add(new DualFront(config));
    }

    //
    public void init() {
        for (SubSystem sub : subSystems) {
            sub.init();
        }
    }

    public void runOnce() {
        for (SubSystem sub : subSystems) {
            sub.runOnce();
        }
    }
}
