package utils;

import entity.Elevator;
import frame.MainFrame;

import javax.swing.*;

public class GetElements {
    public static MainFrame mainFrame;

    public static Elevator[] getElevators(){
        return mainFrame.elevatorsPanel.getElevators();
    }

    public static JButton[] getUpBtn(){
        return mainFrame.floorBtnPanel.getUpBtn();
    }

    public static JButton[] getDownBtn(){
        return mainFrame.floorBtnPanel.getDownBtn();
    }

    public static JLabel[] getStatusLabel() {
        return mainFrame.eleBtnPanel.getStatusLabel();
    }

    public static JLabel[] getFloorLabel() {
        return mainFrame.eleBtnPanel.getFloorLabel();
    }

    public static JButton[][] getButtons() {
        return mainFrame.eleBtnPanel.getButtons();
    }
}
