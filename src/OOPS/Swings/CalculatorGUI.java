package OOPS.Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField numField1, numField2, resultField;
    private JComboBox<String> operatorBox;

    public CalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        numField1 = new JTextField(10);
        numField2 = new JTextField(10);
        operatorBox = new JComboBox<>(new String[]{"+", "-", "*", "/"});
        resultField = new JTextField(10);
        resultField.setEditable(false);

        JButton calculateButton = new JButton("=");
        calculateButton.addActionListener(this);

        panel.add(new JLabel("Number 1:"));
        panel.add(numField1);
        panel.add(new JLabel("Operator:"));
        panel.add(operatorBox);
        panel.add(new JLabel("Number 2:"));
        panel.add(numField2);
        panel.add(calculateButton);
        panel.add(resultField);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(numField1.getText());
        double num2 = Double.parseDouble(numField2.getText());
        String operator = (String) operatorBox.getSelectedItem();
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    resultField.setText("Error: Division by zero");
                    return;
                }
                break;
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
