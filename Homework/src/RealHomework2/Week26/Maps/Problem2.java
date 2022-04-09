package RealHomework2.Week26.Maps;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Problem2 extends JFrame {
    private JTextArea questionArea;
    private JLabel questionLabel;
    private JLabel pointsLabel;
    private JTextField answerField;
    private JButton enterButton;
    private JPanel mainPanel;
    private Map<String, String> capitals;
    private Set<String> doneCountries;
    private String currentCountry;
    private int points = 0;
    private int question = 1;

    public Problem2() {
        super("Capitals Quiz");

        initializeCapitals();
        doneCountries = new HashSet<>(5);

        currentCountry = getRandomCountry();
        questionArea.setText("Which is the capital of " + currentCountry + "?");

        questionLabel.setFont(new Font("Ariel", Font.BOLD, 22));
        pointsLabel.setFont(new Font("Ariel", Font.BOLD, 22));
        questionArea.setFont(new Font("Ariel", Font.PLAIN, 16));

        enterButton.addActionListener(e -> {
            String answer = answerField.getText();
            if (answer.equals(""))
                JOptionPane.showMessageDialog(this, "Please enter an answer.");
            else {
                if (capitals.get(currentCountry).equalsIgnoreCase(answer)) {
                    points += 2;
                    questionArea.append('\n' + answer + " is correct!");
                } else {
                    points--;
                    questionArea.append('\n' + answer + " is wrong! The correct answer was " + capitals.get(currentCountry) + ".");
                }

                pointsLabel.setText("Points: " + points);
                doneCountries.add(currentCountry);

                if (++question <= 5) {
                    do {
                        currentCountry = getRandomCountry();
                    } while (doneCountries.contains(currentCountry));

                    questionArea.append("\nWhich is the capital of " + currentCountry + "?");
                    questionLabel.setText("Question " + question + "/5");
                } else {
                    questionArea.append("\nGood game! You finished with " + points + " points!");
                    answerField.setEditable(false);
                    enterButton.setEnabled(false);
                }

                answerField.setText("");
            }
        });

        add(mainPanel);
    }

    private void initializeCapitals() {
        capitals = new HashMap<>();
        capitals.put("Albania", "Tirana");
        capitals.put("Andorra", "Andorra la Vella");
        capitals.put("Armenia", "Yerevan");
        capitals.put("Austria", "Vienna");
        capitals.put("Azerbaijan", "Baku");
        capitals.put("Belarus", "Minsk");
        capitals.put("Belgium", "Brussels");
        capitals.put("Bosnia and Herzegovina", "Sarajevo");
        capitals.put("Bulgaria", "Sofia");
        capitals.put("Croatia", "Zagreb");
        capitals.put("Cyprus", "Nicosia");
        capitals.put("Czechia", "Prague");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("Estonia", "Tallinn");
        capitals.put("Finland", "Helsinki");
        capitals.put("France", "Paris");
        capitals.put("Georgia", "Tbilisi");
        capitals.put("Germany", "Berlin");
        capitals.put("Greece", "Athens");
        capitals.put("Hungary", "Budapest");
        capitals.put("Iceland", "Reykjavik");
        capitals.put("Ireland", "Dublin");
        capitals.put("Italy", "Rome");
        capitals.put("Kazakhstan", "Nur-Sultan");
        capitals.put("Kosovo", "Pristina");
        capitals.put("Latvia", "Riga");
        capitals.put("Liechtenstein", "Vaduz");
        capitals.put("Lithuania", "Vilnius");
        capitals.put("Luxembourg", "Luxembourg");
        capitals.put("Malta", "Valletta");
        capitals.put("Moldova", "Chisinau");
        capitals.put("Monaco", "Monaco");
        capitals.put("Montenegro", "Podgorica");
        capitals.put("Netherlands", "Amsterdam");
        capitals.put("North Macedonia", "Skopje");
        capitals.put("Norway", "Oslo");
        capitals.put("Poland", "Warsaw");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Romania", "Bucharest");
        capitals.put("Russia", "Moscow");
        capitals.put("San Marino", "San Marino");
        capitals.put("Serbia", "Belgrade");
        capitals.put("Slovakia", "Bratislava");
        capitals.put("Slovenia", "Ljubljana");
        capitals.put("Spain", "Madrid");
        capitals.put("Sweden", "Stockholm");
        capitals.put("Switzerland", "Bern");
        capitals.put("Turkey", "Ankara");
        capitals.put("Ukraine", "Kyiv");
        capitals.put("United Kingdom", "London");
        capitals.put("Vatican City", "Vatican City");
    }

    private String getRandomCountry() {
        return capitals.keySet().stream().toList().get((int) Math.round(Math.random() * capitals.size()));
    }

    public static void main(String[] args) {
        JFrame frame = new Problem2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
