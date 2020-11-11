package entity;

import javax.swing.*;
import java.awt.*;

public class Elevator extends JPanel {

    /*电梯通道宽高*/
    private final int width;
    private final int height;
    /*通道和标题的距离*/
    private final int bufDis;
    /*楼层数*/
    private final int floors;
    /*电梯名称*/
    private final String name;
    /*标题宽高*/
    private final int boxWidth;
    private final int boxHeight;

    /*电梯，可以改变参数来控制上下行*/
    private JPanel elevator;

    public JPanel getElevator() {
        return elevator;
    }

    public Elevator(int width, int height, int bufDis, int floors, String name, int boxWidth, int boxHeight) {
        this.width = width;
        this.height = height;
        this.bufDis = bufDis;
        this.floors = floors;
        this.name = name;
        this.boxWidth = boxWidth;
        this.boxHeight = boxHeight;
        init();
    }

    private void init() {
        setSize(width, height + boxHeight + bufDis);
        setLayout(null);
        setBackground(Color.white);

        JLabel label = new JLabel(name, JLabel.CENTER);
        label.setBounds(0, 0, boxWidth, boxHeight);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        add(label);

        JLabel path = new JLabel();
        path.setBounds(0, boxHeight + bufDis, width, height);
        path.setBorder(BorderFactory.createLineBorder(Color.black));
        add(path);

        elevator = new JPanel(new BorderLayout());
        elevator.add(new JLabel("电梯",JLabel.CENTER),BorderLayout.CENTER);
        elevator.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        elevator.setSize(width, height / floors);
        elevator.setBackground(Color.GREEN);
        elevator.setLocation(0, height-bufDis);
        add(elevator);

    }
}
