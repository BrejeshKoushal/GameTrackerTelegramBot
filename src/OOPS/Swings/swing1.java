package OOPS.Swings;

import javax.swing.*;

public class swing1{
    public swing1(){
        JFrame jframe = new JFrame("Swings");
        JButton btn = new JButton("click me");
        btn.setBounds(40,40,100,30);
        JLabel label = new JLabel("Hey there");
        label.setBounds(100,90,250,30);
        jframe.add(label);
        jframe.add(btn);
        jframe.setLayout(null);
        jframe.setSize(400,400);
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
       new swing1();
    }
}
