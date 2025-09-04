package OOPS.paperpractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingsss {
    JFrame jframe;
    public swingsss(){
        jframe = new JFrame("Fact and square");
        jframe.setSize(400,400);
        JLabel jLabel = new JLabel("Enter number");
        jLabel.setBounds(30,100,100,30);
        JTextField field = new JTextField();
        field.setBounds(150,100,50,30);
        JButton fact = new JButton("Factorial");
        fact.setBounds(100,150,100,40);
        JButton square = new JButton("Square");
        square.setBounds(210,150,100,40);
        JTextField ans = new JTextField();
        ans.setBounds(150,200,100,40);
        fact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(field.getText());
                int answ = 1;
                for(int i = 1 ;i<=num ;i++ ){
                     answ*=i;
                }
                ans.setText(String.valueOf(answ));
            }
        });
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int num = Integer.parseInt(field.getText());
                int result = num*num;
                ans.setText(String.valueOf(result));
            }
        });



        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(field);
        jframe.setLayout(null);
        jframe.add(fact);
        jframe.add(jLabel);
        jframe.add(square);
        jframe.add(ans);
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        swingsss sw = new swingsss();
    }
}
