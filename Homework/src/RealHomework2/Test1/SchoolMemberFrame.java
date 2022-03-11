package RealHomework2.Test1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class SchoolMemberFrame extends JFrame {
    private JRadioButton administratorRadioButton;
    private JRadioButton teacherRadioButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton showScoreButton;
    private JButton addButton;
    private JTextArea textArea1;
    private JPanel mainPanel;
    private JLabel label1;
    private ButtonGroup buttonGroup = new ButtonGroup();
    private LinkedList<SchoolMember> list = new LinkedList<>();
    private boolean teacher = true;

    public SchoolMemberFrame() {
        textArea1.setEditable(false);

        teacherRadioButton.addActionListener(e -> {
            label1.setText("Months Internship: ");
            teacher = true;
        });

        administratorRadioButton.addActionListener(e -> {
            label1.setText("Monthly Salary: ");
            teacher = false;
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SchoolMember member;
                if (teacher) {
                    member = new Teacher(textField1.getText(), textField2.getText(),
                            Integer.parseInt(textField3.getText()));
                } else {
                    member = new Administrator(textField1.getText(), textField2.getText(),
                            Double.parseDouble(textField3.getText()));
                }
                list.add(member);
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                showList();
            }
        });

        showScoreButton.addActionListener(e -> textArea1.setText(String.valueOf(SchoolMember.sumScore(list))));

        buttonGroup.add(administratorRadioButton);
        buttonGroup.add(teacherRadioButton);
        add(mainPanel);
    }

    public void showList() {
        textArea1.setText("");
        for (SchoolMember member : list) {
            textArea1.append(member.toString());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new SchoolMemberFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
