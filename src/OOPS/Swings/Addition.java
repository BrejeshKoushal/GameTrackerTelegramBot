package OOPS.Swings;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition {
    JFrame jframe;
    public Addition(){
        jframe = new JFrame();
        jframe.setSize(500,500);
        JLabel lbl1 =  new JLabel("Enter 1st number");
        lbl1.setBounds(100,100,150,40);
        JTextField text1 = new JTextField();
        text1.setBounds(100,150,50,30);
        JLabel lbl2 =  new JLabel("Enter 2nd number");
        lbl2.setBounds(100,200,150,40);
        JTextField text2 = new JTextField();
        text2.setBounds(100,250,50,30);
        JButton btn = new JButton("Add");
        btn.setBounds(100,290,80,30);
        JLabel result = new JLabel("Result");
        result.setBounds(100,330,150,40);
        JTextField res = new JTextField();
        res.setBounds(100,380,50,30);
        jframe.add(res);
        jframe.add(result);
        jframe.add(text1);
        jframe.add(text2);
        jframe.add(lbl1);
        jframe.add(lbl2);
        jframe.add(btn);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null);
        jframe.setVisible(true);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(text1.getText());
                int num2 = Integer.parseInt(text2.getText());
                int value = num1+num2;
                res.setText(Integer.toString(value));
            }
        });

    }

    public static void main(String[] args) {
        Addition obj = new Addition();

    }
}
