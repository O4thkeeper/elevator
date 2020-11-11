package frame;

import entity.EleBtn;

import javax.swing.*;
import java.awt.*;

public class EleBtnPanel extends JPanel {

    /*所有控件的大小参数*/
    /*整体宽高、页面偏移*/
    private final int panelWidth = 270;
    private final int panelHeight = 600;
    private final int offsetX = 420;
    private final int offsetY = 40;

    /*一套按钮*/
    private final int btnWidth = 120;
    private final int btnHeight = 600;

    private final int eleNum = 2;
    private final int floors = 10;

    private JLabel[] statusLabel = new JLabel[eleNum];
    private JLabel[] floorLabel = new JLabel[eleNum];
    private JButton[][] buttons = new JButton[eleNum][floors];

    public JLabel[] getStatusLabel() {
        return statusLabel;
    }

    public JLabel[] getFloorLabel() {
        return floorLabel;
    }

    public JButton[][] getButtons() {
        return buttons;
    }

    public EleBtnPanel() {
        setSize(panelWidth, panelHeight);
        setLayout(null);
        setBounds(offsetX, offsetY, panelWidth, panelHeight);
        setBackground(Color.white);

        for (int i = 0; i < eleNum; i++) {
            EleBtn eleBtn = new EleBtn(btnWidth, btnHeight, 50, 300, 20, floors, (char) ('A' + i) + "");
            statusLabel[i] = eleBtn.getStatusLabel();
            floorLabel[i] = eleBtn.getFloorLabel();
            buttons[i] = eleBtn.getButtons();
            eleBtn.setBounds((btnWidth + 20) * i, 0, btnWidth, btnHeight);
            add(eleBtn);
        }
    }
}
