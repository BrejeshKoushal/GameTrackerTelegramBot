package OOPS.Swings;

import javax.print.attribute.standard.JobStateReasons;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class greetings {
    JFrame frame;
    public greetings(){
       frame = new JFrame();
       JLabel label = new JLabel("Enter your name please");
       label.setBounds(100,0,100,35);
       JTextField field = new JTextField();
       field.setBounds(140,170,150,30);
       JRadioButton btn1= new JRadioButton("Mr.");
       btn1.setBounds(100,210,100,40);
        JRadioButton btn2= new JRadioButton("Ms.");
        btn2.setBounds(100,250,100,40);
        ButtonGroup grp = new ButtonGroup();
        JButton btn = new JButton("Greet");
        btn.setBounds(100,300,100,30);
        JTextField output = new JTextField();
        output.setBounds(100,350,100,40);




        frame.add(btn);
        frame.add(output);
        grp.add(btn1);
        grp.add(btn2);
        frame.add(btn2);
       frame.add(btn1);
       frame.add(field);
       frame.add(label);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,400);
       frame.setVisible(true);
       frame.setLayout(null);
       btn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String Person = field.getText();
               if(btn1.isSelected()){
                   output.setText("Good Morning"+"Mr"+Person);
               }
             else if(btn2.isSelected()) {
                   output.setText("Good Morning"+"Ms"+Person);
               }           }
       });
    }



    public static void main(String[] args) {
        greetings greet = new greetings();
    }
}
