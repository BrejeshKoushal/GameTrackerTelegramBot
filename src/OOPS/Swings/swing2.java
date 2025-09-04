package OOPS.Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing2 {
    public JFrame jframe;
    Checkbox checboxone,checkboxtwo,checkboxthree;
    public swing2(){
        JButton jButton = new JButton("Click me");
        jButton.setBounds(100,40,100,30);
        jframe = new JFrame("This is JFrame 1");
        jframe.add(jButton);
        jframe.setLayout(null);
        jframe.setSize(400,800);
        JLabel jLabel = new JLabel("This is a Jlabel");
        jLabel.setBounds(100,90,250,30);
        jframe.add(jLabel);
        JTextField textField = new JTextField();
        textField.setBounds(100,150,250,30);
        jframe.add(textField);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(100,190,100,30);
        JButton jbtn = new JButton("Word count");
        jbtn.setBounds(100,230,150,40);
        jframe.add(jbtn);
        textArea.setBackground(Color.cyan);
        textArea.setForeground(Color.red);
        jframe.add(textArea);
        JLabel lbl = new JLabel(" ");
        lbl.setBounds(100,280,250,20);
        jframe.add(lbl);
        checboxone = new Checkbox("Pizza 100");
        checboxone.setBounds(100,280,150,20);
        checkboxtwo = new Checkbox("Burger 40");
        checkboxtwo.setBounds(100,310,150,20);
        checkboxthree = new Checkbox("tea 35");
        checkboxthree.setBounds(100,350,150,20);
        jframe.add(checboxone);
        jframe.add(checkboxtwo);
        jframe.add(checkboxthree);
        JButton bt = new JButton("total");
        bt.setBounds(100,380,80,30);
        JRadioButton radio = new JRadioButton("Radio1");
        radio.setBounds(100,430,100,30);
        JRadioButton radio2 = new JRadioButton("Radiobutton2");
        radio2.setBounds(100,470,100,30);
        jframe.add(radio);
        jframe.add(radio2);
        JButton bn = new JButton("click me");
        bn.setBounds(100,530,80,30);
        jframe.add(bn);
        ButtonGroup group = new ButtonGroup();
        group.add(radio);
        group.add(radio2);
        bn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radio.isSelected()){
                    JOptionPane.showMessageDialog(jframe,"you click 1");

                }

                else if(radio2.isSelected()){
                    JOptionPane.showMessageDialog(jframe,"you click 2");
                }
            }
        });
        jframe.add(bt);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            float amount =0;
            if(checboxone.isValid()) {
                amount+=100;
            }
            if(checkboxtwo.isValid()){
                amount+=45;
            }
            if(checkboxthree.isValid()){
                amount+=35;
            }
            JOptionPane.showMessageDialog(jframe,"hi"+amount);
            }

        }
        );




        jbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String text = textArea.getText();
                String[] word = text.split(" ");
                lbl.setText("Total char " + text.length() + "Total word " + word.length);

            }
        });
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Hi there its an action listener");
                textField.setText("Hi there its an action listener");
            }
        });

        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        swing2 obj = new swing2();

    }
}
