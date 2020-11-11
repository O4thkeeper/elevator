package frame;

import entity.Elevator;

import javax.swing.*;
import java.awt.*;

public class ElevatorsPanel extends JPanel {

    /*所有控件的大小参数*/
    /*整体宽高、页面偏移*/
    private final int panelWidth = 180;
    private final int panelHeight = 600;
    private final int offsetX=20;
    private final int offsetY=20;

    /*一个电梯*/
    private final int elePathWidth = 70;
    private final int elePathHeight = 500;
    private final int boxWidth = 70;
    private final int boxHeight = 30;
    private final int bufDis = 10;

    /*楼层*/
    private final int floors = 10;
    private final int floorHeight = elePathHeight / floors;

    /*电梯个数*/
    private final int eleNum = 2;

    /*向外暴露电梯数组，可以控制相应电梯*/
    private final Elevator[] elevators = new Elevator[eleNum];

    public Elevator[] getElevators() {
        return elevators;
    }

    public ElevatorsPanel() {
        setSize(panelWidth, panelHeight);
        setLayout(null);
        setBounds(offsetX,offsetY,panelWidth,panelHeight);
        setBackground(Color.white);
//        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        for (int i = 0; i < eleNum; i++) {
            Elevator elevator = new Elevator(elePathWidth, elePathHeight, bufDis, floors, (char) ('A' + i) + "", boxWidth, boxHeight);
            elevator.setLocation(i * (elePathWidth) + (i + 1) * 10, 20);
            add(elevator);
            elevators[i] = elevator;
        }
    }
}
