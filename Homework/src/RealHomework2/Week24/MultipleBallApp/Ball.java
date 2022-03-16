package RealHomework2.Week24.MultipleBallApp;

import java.awt.Color;

class Ball implements Comparable<Ball> {
	int x = 0;
	int y = 0; // Current ball position
	int dx = 2; // Increment on ball's x-coordinate
	int dy = 2; // Increment on ball's y-coordinate
	int radius = 2 + (int) Math.round(Math.random() * 18); // Ball radius
	Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

	@Override
	public int compareTo(Ball o) {
		return Integer.compare(radius, o.radius);
	}
}