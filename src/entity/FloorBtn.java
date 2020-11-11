package entity;

import javax.swing.*;
import java.awt.*;

public class FloorBtn extends JPanel {

    private int num;
    private int height;
    private int numWidth;
    private int btnWidth;

    private JButton upBtn;
    private JButton downBtn;

    public JButton getUpBtn() {
        return upBtn;
    }

    public JButton getDownBtn() {
        return downBtn;
    }

    public FloorBtn(int num, int height, int numWidth, int btnWidth) {
        this.num = num;
        this.height = height;
        this.numWidth = numWidth;
        this.btnWidth = btnWidth;
        init();
    }

    private void init() {
        setSize(numWidth + 2 * btnWidth, height);
        setLayout(null);
        setBackground(Color.white);

        JLabel label = new JLabel(num + "", JLabel.CENTER);
        label.setBounds(0, 0, numWidth, height);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        add(label);

        upBtn = new JButton("上");
        upBtn.setBounds(numWidth, 0, btnWidth, height);
        upBtn.setBackground(Color.white);
        add(upBtn);

        downBtn = new JButton("下");
        downBtn.setSize(btnWidth, height);
        downBtn.setLocation(numWidth+btnWidth, 0);
        downBtn.setBackground(Color.white);
        add(downBtn);

    }
}
