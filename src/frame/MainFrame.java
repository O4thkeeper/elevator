package frame;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public ElevatorsPanel elevatorsPanel;
    public FloorBtnPanel floorBtnPanel;
    public EleBtnPanel eleBtnPanel;

    public MainFrame() throws HeadlessException {
        setSize(730,630);
        setTitle("Elevators");
        setLayout(null);
        getContentPane().setBackground(Color.white);

        elevatorsPanel = new ElevatorsPanel();
        add(elevatorsPanel);

        floorBtnPanel=new FloorBtnPanel();
        add(floorBtnPanel);

        eleBtnPanel=new EleBtnPanel();
        add(eleBtnPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
