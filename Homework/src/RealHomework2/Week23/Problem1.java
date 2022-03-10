package RealHomework2.Week23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.LinkedList;

public class Problem1 extends JFrame {
    private JTextField textField1;
    private JButton sortButton;
    private JButton reverseButton;
    private JButton shuffleButton;
    private JLabel label;
    private JPanel mainPanel;
    private JScrollPane pane;
    private JTextArea textArea1;
    private LinkedList<Integer> list = new LinkedList<>();

    public Problem1() {
        add(mainPanel);
        textArea1.setEditable(false);

        textField1.addActionListener(e -> {
            try {
                list.add(Integer.valueOf(textField1.getText()));
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(textField1, "Invalid input.");
            }
            textField1.setText("");
            refreshTextArea();
        });

        sortButton.addActionListener(e -> {
            Collections.sort(list);
            refreshTextArea();
        });

        shuffleButton.addActionListener(e -> {
            Collections.shuffle(list);
            refreshTextArea();
        });

        reverseButton.addActionListener(e -> {
            Collections.reverse(list);
            refreshTextArea();
        });
    }

    private void refreshTextArea() {
        StringBuilder str = new StringBuilder();
        for (Integer i : list) {
            str.append(i).append(" ");
        }
        textArea1.setText(str.toString());
    }

    public static void main(String[] args) {
        Problem1 frame = new Problem1();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
