package RealHomework2.Week21.Fractals;

import java.awt.*;

import javax.swing.JPanel;

public class SierpinskiTrianglePanel extends JPanel {
	private int order = 0;

	/** Set a new order */
	public void setOrder(int order) {
		this.order = order;
		repaint();
	}

	public int getOrder() {
		return order;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Select three points in proportion to the panel size
		Point p1 = new Point(getWidth() / 2, 10);
		Point p2 = new Point(10, getHeight() - 10);
		Point p3 = new Point(getWidth() - 10, getHeight() - 10);
		GradientPaint gp = new GradientPaint(0, 0, new Color(3, 0, 252),
				getWidth(), getHeight(), new Color(3, 252, 252));
		((Graphics2D)g).setPaint(gp);
		displayTriangles(g, order, p1, p2, p3);
	}
	//Override-ва се, за да се нарисуват триъгълниците, вика се и не-override-натия метод на суперкласа.
	//Вика се от repaint() всеки път, когато се смени order.
	//p1, p2 и p3 са върговете на главния триъгълник.

	private static void displayTriangles(Graphics g, int order, Point p1, Point p2, Point p3) {
		if (order == 0) {
			// Draw a triangle to connect three points
			g.drawLine(p1.x, p1.y, p2.x, p2.y);
			g.drawLine(p1.x, p1.y, p3.x, p3.y);
			g.drawLine(p2.x, p2.y, p3.x, p3.y);

			Polygon triangle = new Polygon(new int[] {p1.x, p2.x, p3.x}, new int[] {p1.y, p2.y, p3.y}, 3);
			g.fillPolygon(triangle);
		} else {
			// Get the midpoint on each edge of the triangle
			Point p12 = midpoint(p1, p2);
			Point p23 = midpoint(p2, p3);
			Point p31 = midpoint(p3, p1);
			// Recursively display three triangles
			displayTriangles(g, order - 1, p1, p12, p31);
			displayTriangles(g, order - 1, p12, p2, p23);
			displayTriangles(g, order - 1, p31, p23, p3);
		}
	}
	//Първо се рисуват най-малките триъгълници от горе надолу.

	private static Point midpoint(Point p1, Point p2) {
			return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
		}
}