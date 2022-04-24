package RealHomework2.Week28.AnimationSelectionSort;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

class SortingPanel extends JPanel {

	private ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 2, 1, 4));

	private static final int NO_SORTING_STAGE = -1;
	private static final int INCREMENT_I_STAGE = 0;
	private static final int INCREMENT_J_STAGE = 1;
	private static final int COMPARE_STAGE = 2;
	private static final int SWITCH_STAGE = 3;
	private static final int IS_SORTED_STAGE = 4;

	private int stage = NO_SORTING_STAGE;

	int currentI = -1;
	int currentJ = -1;

	int minI = -1;

	public SortingPanel() {

	}

	public void nextStepInSorting() {
		if (stage == IS_SORTED_STAGE) {
			return;
		}

		if (stage == NO_SORTING_STAGE) {
			stage = INCREMENT_I_STAGE;
		}

		if (stage == INCREMENT_I_STAGE) {
			currentJ = ++currentI;
			minI = currentI;
			stage = INCREMENT_J_STAGE;
		}

		if (stage == INCREMENT_J_STAGE) {
			currentJ++;
		} else if (stage == SWITCH_STAGE && minI != currentI) {
			int temp = numbers.get(currentI);
			numbers.set(currentI, numbers.get(minI));
			numbers.set(minI, temp);
		}

		repaint();
	}

	private void nextStage() {
		if (stage == INCREMENT_J_STAGE) {
			stage = COMPARE_STAGE;
		} else if (stage == COMPARE_STAGE) {
			if (numbers.get(currentJ) < numbers.get(minI))
				minI = currentJ;
			if (currentJ < numbers.size() - 1) {
				stage = INCREMENT_J_STAGE;
			} else {
				stage = SWITCH_STAGE;
			}
		} else if (stage == SWITCH_STAGE) {
			if (currentI < numbers.size() - 2) {
				stage = INCREMENT_I_STAGE;
			} else {
				currentI = -1;
				stage = IS_SORTED_STAGE;
				repaint();
			}
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int towerWidth = ((getWidth() - 20) / numbers.size()) - 2;
		int towerHeghtIndex = (getHeight() - 20) / maxElement(numbers);
		int downY = getHeight() - 5;
		for (int j = 0; j < numbers.size(); j++) {
			// establish color
			if (stage == NO_SORTING_STAGE || stage == IS_SORTED_STAGE) {
				g.setColor(Color.BLACK);
			} else if ((j == currentJ || j == minI) && stage == COMPARE_STAGE) {
				g.setColor(Color.RED);
			} else if (j == currentI || (j == minI && (stage == SWITCH_STAGE || stage == INCREMENT_J_STAGE))) {
				g.setColor(Color.GREEN);
			} else {
				g.setColor(Color.BLACK);
			}

			int leftX = j * towerWidth + 5 * (j + 1);
			int rightX = leftX + towerWidth;
			int upperY = downY - numbers.get(j) * towerHeghtIndex;
			g.drawLine(leftX, downY, leftX, upperY); // left side line
			g.drawLine(leftX, upperY, rightX, upperY); // top line
			g.drawLine(rightX, downY, rightX, upperY); // right line

			g.drawString(numbers.get(j).toString(), leftX + towerWidth / 2, downY - 5);
		}

		if (stage != NO_SORTING_STAGE) {
			nextStage();
		}
	}

	public static Integer maxElement(ArrayList<Integer> numbers) {
		Integer max = numbers.get(0);
		for (Integer a : numbers) {
			if (a > max) {
				max = a;
			}
		}

		return max;
	}

}