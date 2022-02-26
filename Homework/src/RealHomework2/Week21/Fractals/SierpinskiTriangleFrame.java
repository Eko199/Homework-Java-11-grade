package RealHomework2.Week21.Fractals;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;

	// Order
	private JButton jbOrderMinus = new JButton("-");
	private JButton jbOrderPlus = new JButton("+");
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
	// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(jbOrderMinus);
		jbOrderMinus.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(jbOrderPlus);
		jbOrderPlus.setHorizontalAlignment(SwingConstants.RIGHT);
	// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
	// Register a listener

		jbOrderMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (trianglePanel.getOrder() > 0)
					trianglePanel.setOrder(trianglePanel.getOrder() - 1);
			}
		});
		jbOrderPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.setOrder(trianglePanel.getOrder() + 1);
			}
		});

	}

}
