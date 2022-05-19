package RealHomework2.Week31;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddPanel extends JPanel {
    private JPanel addPanel;
    private JComboBox comboBox;
    private JTextField nameField;
    private JTextField yearField;
    private JTextField priceField;
    private JTextField characterField;
    private JLabel characterLabel;
    private JButton addButton;
    private JButton backButton;

    public AddPanel(ArrayList<Film> list) {
        add(addPanel);

        comboBox.addItemListener(e -> {
            characterLabel.setVisible(comboBox.getSelectedIndex() == 1);
            characterField.setVisible(comboBox.getSelectedIndex() == 1);
        });

        addButton.addActionListener(e -> {
            try {
                if (nameField.getText().isBlank())
                    throw new Exception();

                if (comboBox.getSelectedIndex() == 0) {
                    list.add(new Film(list.size(), nameField.getText(), Integer.parseInt(yearField.getText()),
                            Double.parseDouble(priceField.getText())));
                } else {
                    if (characterField.getText().isBlank())
                        throw new Exception();
                    list.add(new CartoonFilm(list.size(), nameField.getText(), Integer.parseInt(yearField.getText()),
                            Double.parseDouble(priceField.getText()), characterField.getText()));
                }

                nameField.setText("");
                yearField.setText("");
                priceField.setText("");
                characterField.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input.");
            }
        });
    }

    public void addBackButtonListener(ActionListener actionListener) {
        backButton.addActionListener(actionListener);
    }
}
