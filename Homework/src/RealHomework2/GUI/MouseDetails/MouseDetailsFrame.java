package RealHomework2.GUI.MouseDetails;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MouseDetailsFrame extends JFrame
{
	private String details; // String that is displayed in the statusBar
	private JLabel statusBar; // JLabel that appears at bottom of window
	
	// constructor sets title bar String and register mouse listener
	public MouseDetailsFrame()
	{
		super( "Mouse clicks and buttons" );

		statusBar = new JLabel( "Click the mouse" );
		add( statusBar, BorderLayout.SOUTH );
		addMouseListener( new MouseClickHandler() ); // add handler
	}
	
	// inner class to handle mouse events
	private class MouseClickHandler extends MouseAdapter
	{
		// handle mouse-click event and determine which button was pressed
		public void mouseClicked( MouseEvent event )
		{
			int xPos = event.getX(); // get x-position of mouse
			int yPos = event.getY(); // get y-position of mouse

			details = String.format( "Clicked %d time(s)", event.getClickCount());
			
			if( SwingUtilities.isRightMouseButton(event))//right mouse button
				details += " with right mouse button";
			else if(SwingUtilities.isMiddleMouseButton(event))  // middle mouse button
				details += " with center mouse button";
			else // left mouse button
				details += " with left mouse button";
			
			statusBar.setText( details ); // display message in statusBar
		} // end method mouseClicked
	} // end private inner class MouseClickHandler
} // end class MouseDetailsFrame
