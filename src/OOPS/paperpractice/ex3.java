package OOPS.paperpractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex3 extends JFrame implements ActionListener {
    private JComboBox<String> colorListBox;
    private JButton changeColorButton;
    private JPanel colorPanel;

    public ex3() {
        setTitle("Color Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize components
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        colorListBox = new JComboBox<>(colors);
        colorListBox.setSelectedIndex(0); // Default selection
        changeColorButton = new JButton("Change Color");
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.RED); // Default color

        // Add components to the frame
        JPanel controlPanel = new JPanel();
        controlPanel.add(colorListBox);
        controlPanel.add(changeColorButton);
        add(controlPanel, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);

        // Add action listeners
        colorListBox.addActionListener(this);
        changeColorButton.addActionListener(this);

        // Set frame size and visibility
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == changeColorButton) {
            String selectedColor = (String) colorListBox.getSelectedItem();
            Color newColor;
            switch (selectedColor) {
                case "Red":
                    newColor = Color.RED;
                    break;
                case "Green":
                    newColor = Color.GREEN;
                    break;
                case "Blue":
                    newColor = Color.BLUE;
                    break;
                case "Yellow":
                    newColor = Color.YELLOW;
                    break;
                default:
                    newColor = Color.RED;
            }
            colorPanel.setBackground(newColor);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ex3::new);
    }
}
