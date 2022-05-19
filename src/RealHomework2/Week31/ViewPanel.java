package RealHomework2.Week31;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ViewPanel extends JPanel {
    private JPanel viewPanel;
    private JTextArea textArea;
    private JButton backButton;

    public ViewPanel(ArrayList<Film> list) {
        add(viewPanel);
        refresh(list);
    }

    public void refresh(ArrayList<Film> list) {
        textArea.setText("");
        for (Film film : list) {
            textArea.append(film.toString() + "\n");
        }
    }

    public void addBackButtonListener(ActionListener actionListener) {
        backButton.addActionListener(actionListener);
    }
}
