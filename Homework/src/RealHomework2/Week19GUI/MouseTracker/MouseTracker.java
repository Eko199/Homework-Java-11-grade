package RealHomework2.Week19GUI.MouseTracker;

import javax.swing.JFrame;
public class MouseTracker
{
	public static void main( String[] args )
	{
		MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
		mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		mouseTrackerFrame.setSize( 300, 100 ); // set frame size
		mouseTrackerFrame.setVisible( true ); // display frame
		System.out.println(mouseTrackerFrame.getInsets().left + " " + mouseTrackerFrame.getInsets().right + " " + mouseTrackerFrame.getInsets().top + " " + mouseTrackerFrame.getInsets().bottom);
	} // end main
} // end class MouseTracker
