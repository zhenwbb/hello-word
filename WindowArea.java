package shiyan10;

import javax.swing.*;
import java.awt.*;

public class WindowArea extends JFrame {
    JTextField one,two,three;
    JButton button;
    JTextArea textArea;
    AreaListener area;

    public WindowArea(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        one = new JTextField(5);
        two = new JTextField(5);
        three = new JTextField(5);
        button = new JButton("计算面积");
        textArea = new JTextArea(9,30);
        area = new AreaListener();
        area.setOne(one);
        area.setTwo(two);
        area.setThree(three);
        area.setTextArea(textArea);
        button.addActionListener(area);
        panel.add(new JLabel("边A："));
        panel.add(one);
        panel.add(new JLabel("边B："));
        panel.add(two);
        panel.add(new JLabel("边C："));
        panel.add(three);
        panel.add(button);
        panel.add(textArea);
        add(panel,BorderLayout.NORTH);
        add(textArea,BorderLayout.CENTER);
    }
}
