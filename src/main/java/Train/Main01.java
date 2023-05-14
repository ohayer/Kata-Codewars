package Train;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main01 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Application");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
        jFrame.setBackground(Color.GRAY);
        jFrame.setLayout(null);

        JLabel lbl = new JLabel();
        lbl.setText("Hello");
        lbl.setSize(jFrame.getSize());
        lbl.setHorizontalTextPosition(JLabel.CENTER);
        lbl.setVerticalTextPosition(JLabel.CENTER);
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setVerticalAlignment(JLabel.CENTER);
        lbl.setFont(new Font("Arial", Font.BOLD,50));

        JButton btn = new JButton();
        btn.setText("Click me");
        btn.addActionListener(e -> System.out.println("clicked"));
        btn.setBounds(200,400,100,50);


        jFrame.add(lbl);
        jFrame.add(btn);
    }
}
