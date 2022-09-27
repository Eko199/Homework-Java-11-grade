package random.Marti;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class HangMan extends JFrame {
	private static File wordBank = new File("src/random/Marti/words.txt");
	private final int MAX_STRIKES = 9;
	private int strikes = 0;
	private String word = "potato";
	private int correctGuesses = 0;
	private int totalGuesses = 0;

	AllPanel allPanel;
	HangMan reference;

	HangMan() {
		reference = this;
		word = getRandomWord();

		allPanel = new AllPanel();
		setLayout(new BorderLayout());
		add(allPanel, BorderLayout.CENTER);
		pack();
		setVisible(true);
		setTitle("HangMan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	protected void reset() {
		word = getRandomWord();
		lettersPanel.reset();
		inputPanel.reset();
		infoPanel.reset();
		imagePanel.reset();
		buttonPanel.update();
		pack();
		repaint();
	}

	protected void update() {
		lettersPanel.update();
		inputPanel.reset();
		infoPanel.update();
		imagePanel.update();
		pack();
		repaint();
	}

	protected String getRandomWord() {
		Scanner in = null;
		try {
			in = new Scanner(wordBank);
		} catch (FileNotFoundException e) {
			System.out.println("Could not find the file with the words");
			return "file not found";
		}
		int size = in.nextInt();
		int wordNumber = new Random().nextInt(size);
		for (int i = 0; i <= wordNumber - 1; i++) {
			in.nextLine();
		}
		String result = in.nextLine().toLowerCase();
		in.close();
		return result;
	}

	class LettersPanel extends JPanel {
		private JLabel[] labels = new JLabel[word.length()];
		Font font = new Font("", Font.BOLD, 20);

		LettersPanel() {
			setLayout(new FlowLayout());
			for (int i = 0; i < labels.length; i++) {
				labels[i] = new JLabel("_");
				labels[i].setFont(font);
				add(labels[i]);
			}
			tryLetter(word.charAt(0), false);
			tryLetter(word.charAt(word.length() - 1), false);
		}

		protected void reset() {
			labels = new JLabel[word.length()];
			this.removeAll();
			for (int i = 0; i < labels.length; i++) {
				labels[i] = new JLabel("_");
				labels[i].setFont(font);
				add(labels[i]);
			}
			tryLetter(word.charAt(0), false);
			tryLetter(word.charAt(word.length() - 1), false);
		}

		protected void update() {
			pack();
		}

		protected boolean tryLetter(char a, boolean update) {
			if (word.indexOf(a) == -1) {
				if (update)
					wrongGuess();
				return false;
			} else if (labels[word.indexOf(a)].getText() != "_" && labels[word.indexOf(a)].getText() != " ") {
				// totalGuesses++;
				// infoPanel.update();
				// checkWinLoss();
				return false;
			} else {
				for (int i = 0; i < word.length(); i++) {
					if (word.charAt(i) == a) {
						labels[i].setText(Character.toString(a).toUpperCase());
						correctGuesses++;
					}
				}
				if (update)
					correctGuess();
				return true;
			}
		}

		private void correctGuess() {
			totalGuesses++;
			reference.update();
			checkWinLoss();
		}

		private void wrongGuess() {
			strikes++;
			totalGuesses++;
			reference.update();
			checkWinLoss();
		}

		protected boolean tryWord(String str) {
			if (word.compareToIgnoreCase(str) != 0) {
				wrongGuess();
				return false;
			} else {
				correctGuesses = word.length();
				for (int i = 0; i < word.length(); i++) {
					labels[i].setText(Character.toString(word.charAt(i)).toUpperCase());
				}
				correctGuess();
				return true;
			}
		}

		protected void checkWinLoss() {
			if (word.length() == correctGuesses) {
				new WinLossFrame(WinLossFrame.WIN, word);
				buttonPanel.update();
				// reference.reset();
			}
			if (strikes == MAX_STRIKES) {
				new WinLossFrame(WinLossFrame.LOSS, word);
				buttonPanel.update();
				// reference.reset();
			}
		}
	}

	class InputPanel extends JPanel {
		JTextField tf = new JTextField();
		String inputText;

		InputPanel() {
			tf.setPreferredSize(new Dimension(120, 20));
			setLayout(new FlowLayout());
			add(new JLabel("input: "));
			add(tf);
			pack();
			tf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputText = tf.getText().toLowerCase();
					if (inputText.compareTo("") != 0) {
						if (inputText.length() == 1) {
							if (lettersPanel.tryLetter(inputText.charAt(0), true))
								tf.setBackground(Color.green);
							else
								tf.setBackground(Color.red);
						} else {
							if (lettersPanel.tryWord(inputText))
								tf.setBackground(Color.green);
							else
								tf.setBackground(Color.red);
						}
					}
					tf.setText("");
				}
			});
		}

		protected void reset() {
			tf.setBackground(Color.white);
			tf.setText("");
		}

	}

	class InfoPanel extends JPanel {
		JLabel totalGuesesLabel = new JLabel(Integer.toString(totalGuesses));
		JLabel correctGuessesLabel = new JLabel(
				Integer.toString(correctGuesses) + "/" + Integer.toString(word.length()));
		JLabel strikesLabel = new JLabel(Integer.toString(strikes) + "/" + Integer.toString(MAX_STRIKES));

		InfoPanel() {
			setLayout(new GridLayout(0, 2));
			add(new JLabel("Total guesses: "));
			add(totalGuesesLabel);
			add(new JLabel("Letters found: "));
			add(correctGuessesLabel);
			correctGuessesLabel.setForeground(Color.green);
			add(new JLabel("Strike: "));
			add(strikesLabel);
			strikesLabel.setForeground(Color.red);
			pack();
			Border border = BorderFactory.createLineBorder(Color.black);
			border = BorderFactory.createTitledBorder(border, "Info");
			setBorder(border);
		}

		protected void update() {
			totalGuesesLabel.setText(Integer.toString(totalGuesses));
			correctGuessesLabel.setText(Integer.toString(correctGuesses) + "/" + Integer.toString(word.length()));
			strikesLabel.setText(Integer.toString(strikes) + "/" + Integer.toString(MAX_STRIKES));
			repaint();
		}

		protected void reset() {
			strikes = 0;
			correctGuesses = 2;
			totalGuesses = 0;
			update();
			repaint();
		}
	}

	LettersPanel lettersPanel;
	InputPanel inputPanel;
	InfoPanel infoPanel;
	ImagePanel imagePanel;
	ButtonPanel buttonPanel;

	class AllPanel extends JPanel {
		AllPanel() {
			lettersPanel = new LettersPanel();
			inputPanel = new InputPanel();
			infoPanel = new InfoPanel();
			imagePanel = new ImagePanel();
			buttonPanel = new ButtonPanel();
			setLayout(new BorderLayout());
			JPanel mainP = new JPanel(new BorderLayout());
			mainP.add(lettersPanel, BorderLayout.CENTER);
			mainP.add(imagePanel, BorderLayout.SOUTH);
			add(mainP, BorderLayout.CENTER);
			add(inputPanel, BorderLayout.NORTH);
			add(infoPanel, BorderLayout.EAST);
			add(buttonPanel, BorderLayout.SOUTH);
			pack();
		}
	}

	class ButtonPanel extends JPanel {
		JButton exitButton = new JButton("EXIT");
		JButton resetButton = new JButton("RESET");
		ButtonPanel() {
			setLayout(new BorderLayout());
			add(exitButton, BorderLayout.CENTER);
			exitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reference.dispose();
					System.exit(0);
				}
			});
			resetButton.setVisible(false);
			add(resetButton, BorderLayout.NORTH);
			resetButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reference.reset();
				}
			});
		}
		protected void update() {
			if (word.length() == correctGuesses || strikes == MAX_STRIKES) {
				resetButton.setVisible(true);
			}else {
				resetButton.setVisible(false);
			}
			pack();
		}
	}

	ImageIcon[] images = new ImageIcon[MAX_STRIKES];

	class ImagePanel extends JPanel {
		JLabel label = new JLabel();

		ImagePanel() {
			for (int i = 0; i < MAX_STRIKES; i++) {
				images[i] = new ImageIcon(("src/random/Marti/images/" + (i + 1) + ".png"));
			}
			setLayout(new FlowLayout());
			add(label);
			pack();
		}

		protected void update() {
			if (strikes != 0) {
				label.setIcon(images[strikes - 1]);
			}
			pack();
		}

		protected void reset() {
			label.setIcon(null);
			pack();
		}
	}
}
