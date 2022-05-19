package RealHomework2.Week31;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JButton newButton;
    private JButton deleteButton;
    private JButton viewButton;
    private JButton exitButton;
    private CardLayout cardLayout = new CardLayout();
    private ArrayList<Film> list = new ArrayList<>();
    private File data;

    public MainFrame() throws FileNotFoundException {
        super("Film List");

        File data = new File("src\\RealHomework2\\Week31\\data.txt");
        try (Scanner scanner = new Scanner(data)) {
            while (scanner.hasNext()) {
                int type = scanner.nextInt();
                scanner.nextLine();

                if (type == 1)
                    list.add(new Film(list.size(), scanner.nextLine(), scanner.nextInt(), scanner.nextDouble()));
                else if (type == 2)
                    list.add(new CartoonFilm(list.size(), scanner.nextLine(), scanner.nextInt(), scanner.nextDouble(), scanner.next()));
                else
                    throw new RuntimeException("Invalid file content.");
            }
        }

        setLayout(cardLayout);
        AddPanel addPanel = new AddPanel(list);
        DeletePanel deletePanel = new DeletePanel(list);
        ViewPanel viewPanel = new ViewPanel(list);

        addPanel.addBackButtonListener(e -> cardLayout.show(getContentPane(), "main menu"));
        deletePanel.addBackButtonListener(e -> cardLayout.show(getContentPane(), "main menu"));
        viewPanel.addBackButtonListener(e -> cardLayout.show(getContentPane(), "main menu"));

        add(mainPanel, "main menu");
        add(addPanel, "new");
        add(deletePanel, "delete");
        add(viewPanel, "view");

        newButton.addActionListener(e -> cardLayout.show(getContentPane(), "new"));
        deleteButton.addActionListener(e -> cardLayout.show(getContentPane(), "delete"));

        viewButton.addActionListener(e -> {
            viewPanel.refresh(list);
            cardLayout.show(getContentPane(), "view");
        });

        exitButton.addActionListener(e -> {
            try (PrintWriter printWriter = new PrintWriter(data)) {
                StringBuilder stringBuilder = new StringBuilder();

                for (Film film : list) {
                    stringBuilder.append(film.toFileString());
                }

                printWriter.print(stringBuilder);
            } catch (FileNotFoundException ignored) {}

            dispose();
        });

        setLocationRelativeTo(null);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws FileNotFoundException {
        MainFrame frame = new MainFrame();
    }
}
