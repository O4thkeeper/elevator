package entity;

import javax.swing.*;
import java.awt.*;

public class EleBtn extends JPanel {


    private int width;
    private int height;
    private int labelHeight;
    private int btnHeight;
    private int interval;

    private int floors;
    private String name;

    private JButton[] buttons;
    private JLabel statusLabel;
    private JLabel floorLabel;

    public JButton[] getButtons() {
        return buttons;
    }

    public JLabel getStatusLabel() {
        return statusLabel;
    }

    public JLabel getFloorLabel() {
        return floorLabel;
    }

    public EleBtn(int width, int height, int labelHeight, int btnHeight, int interval, int floors, String name) {
        this.width = width;
        this.height = height;
        this.labelHeight = labelHeight;
        this.btnHeight = btnHeight;
        this.interval = interval;
        this.floors = floors;
        buttons = new JButton[floors];
        this.name = name;
        init();
    }

    private void init() {

        setSize(width, height);
        setLayout(null);
        setBackground(Color.white);

        JLabel nameLabel = new JLabel(name, JLabel.CENTER);
        nameLabel.setSize(width, labelHeight);
        nameLabel.setLocation(0, 0);
        nameLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(nameLabel);

        statusLabel = new JLabel("电梯状态：停靠", JLabel.CENTER);
        statusLabel.setSize(width, labelHeight);
        statusLabel.setLocation(0, labelHeight + interval);
        statusLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(statusLabel);

        floorLabel = new JLabel("当前楼层：1层", JLabel.CENTER);
        floorLabel.setSize(width, labelHeight);
        floorLabel.setLocation(0, 2 * (labelHeight + interval));
        floorLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(floorLabel);

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(null);
        btnPanel.setSize(width, btnHeight);
        btnPanel.setBackground(Color.white);
        btnPanel.setLocation(0, 3 * (labelHeight + interval));
        for (int i = 0; i < floors; i++) {
            JButton btn = new JButton((i+1) + "");
            btn.setSize(45, 45);
            btn.setLocation(12 + i % 2 * 50, i / 2 * 50 + 25);
            btnPanel.add(btn);
            buttons[i] = btn;
        }
        add(btnPanel);

    }

}
