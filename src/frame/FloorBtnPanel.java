package frame;

import entity.Elevator;
import entity.FloorBtn;

import javax.swing.*;
import java.awt.*;

public class FloorBtnPanel extends JPanel {

    /*所有控件的大小参数*/
    /*整体宽高、页面偏移*/
    private final int panelWidth = 200;
    private final int panelHeight = 600;
    private final int offsetX = 200;
    private final int offsetY = 0;

    private final int floors = 10;
    private final int floorHeight = 50;
    private final int floorOffsetY = 80;

    private final int numWidth = 30;
    private final int btnWidth = 80;

    private final JButton[] upBtn = new JButton[floors];
    private final JButton[] downBtn = new JButton[floors];

    public JButton[] getUpBtn() {
        return upBtn;
    }

    public JButton[] getDownBtn() {
        return downBtn;
    }

    public FloorBtnPanel() {
        setSize(panelWidth, panelHeight);
        setLayout(null);
        setBounds(offsetX, offsetY, panelWidth, panelHeight);
        setBackground(Color.white);
//        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        for (int i = floors; i > 0; i--) {
            FloorBtn btn = new FloorBtn(i, floorHeight, numWidth, btnWidth);
            btn.setLocation(0, floorOffsetY + (floors - i) * floorHeight);
            add(btn);
            upBtn[i - 1] = btn.getUpBtn();
            downBtn[i - 1] = btn.getDownBtn();
        }
    }
}
