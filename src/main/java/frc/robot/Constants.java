// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */

public final class Constants {
  public static final class DriveConstants {
    // Motor controller IDs for drivetrain motors
    public static final int LEFT_LEADER_ID = 15;
    public static final int LEFT_FOLLOWER_ID = 25;
    public static final int RIGHT_LEADER_ID = 11;
    public static final int RIGHT_FOLLOWER_ID = 17;

    // Current limit for drivetrain motors
    public static final int DRIVE_MOTOR_CURRENT_LIMIT = 60;

    // ── PathPlanner / Odometry constants ──────────────────────────────
    // KitBot default wheels are 6 inches (0.1524 m)
    public static final double WHEEL_DIAMETER_METERS = 0.1524;
    public static final double WHEEL_CIRCUMFERENCE_METERS = Math.PI * WHEEL_DIAMETER_METERS;

    // KitBot default gearbox is 8.45:1 — change if you swapped it
    public static final double DRIVE_GEAR_RATIO = 8.45;

    // Distance between the left and right wheels — MEASURE YOUR ROBOT in meters
    // A standard KitBot is roughly 0.56 m (22 inches) but measure yours to be
    // accurate
    public static final double TRACK_WIDTH_METERS = 0.56;

    // Max free speed of the drivetrain in m/s — used to normalize wheel speeds
    // Tune this by driving full speed and checking encoder velocity
    public static final double MAX_DRIVE_SPEED_MPS = 3.0;
  }

  public static final class FuelConstants {
    public static final int FEEDER_MOTOR_ID = 4;
    public static final int INTAKE_LAUNCHER_MOTOR_ID = 9;

    public static final int FEEDER_MOTOR_CURRENT_LIMIT = 60;
    public static final int LAUNCHER_MOTOR_CURRENT_LIMIT = 60;

    public static final double INTAKING_FEEDER_VOLTAGE = -12;
    public static final double INTAKING_INTAKE_VOLTAGE = 10;
    public static final double LAUNCHING_FEEDER_VOLTAGE = 9;
    public static final double LAUNCHING_LAUNCHER_VOLTAGE = 10.6;
    public static final double SPIN_UP_FEEDER_VOLTAGE = -6;
    public static final double SPIN_UP_SECONDS = 1;
  }

  public static final class OperatorConstants {
    public static final int DRIVER_CONTROLLER_PORT = 0;
    public static final int OPERATOR_CONTROLLER_PORT = 0;

    public static final double DRIVE_SCALING = .7;
    public static final double ROTATION_SCALING = .8;
  }
}