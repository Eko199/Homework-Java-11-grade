package RealHomework2.Week31;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DeletePanel extends JPanel {
    private JPanel deletePanel;
    private JTextField textField;
    private JButton deleteButton;
    private JButton backButton;

    public DeletePanel(ArrayList<Film> list) {
        add(deletePanel);

        deleteButton.addActionListener(e -> {
            int initialSize = list.size();
            try {
                list.removeIf(film -> (film.getId() == Integer.parseInt(textField.getText())));
            } catch (Exception ignored) {}

            textField.setText("");
            JOptionPane.showMessageDialog(this, (initialSize != list.size()) ? "Delete successful." : "Invalid input.");
        });
    }

    public void addBackButtonListener(ActionListener actionListener) {
        backButton.addActionListener(actionListener);
    }
}
