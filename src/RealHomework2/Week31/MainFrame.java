package RealHomework2.Week31;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JButton newButton;
    private JButton deleteButton;
    private JButton viewButton;
    private JButton exitButton;
    private ArrayList<Film> list = new ArrayList<>();
    private File data;

    public MainFrame() throws FileNotFoundException {
        add(mainPanel);

        File data = new File("src\\RealHomework2\\Week31\\data.txt");
        try (Scanner scanner = new Scanner(data)) {

        }

        addActionListeners();

        setLocationRelativeTo(null);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void addActionListeners() {
        newButton.addActionListener(e -> {

        });

        deleteButton.addActionListener(e -> {

        });

        viewButton.addActionListener(e -> {

        });

        exitButton.addActionListener(e -> dispose());
    }

    public static void main(String[] args) throws FileNotFoundException {
        MainFrame frame = new MainFrame();
    }
}
