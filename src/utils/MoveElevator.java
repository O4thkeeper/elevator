package utils;

import entity.Elevator;

import javax.swing.*;

public class MoveElevator {

    public static void move(Elevator elevator, boolean up, int offset) {
        JPanel elevatorPanel = elevator.getElevator();
        offset = up ? offset : -offset;
        elevatorPanel.setLocation(elevatorPanel.getX(), elevatorPanel.getY() + offset);
    }
}
