package RealHomework2.Week19GUI.MultipleSelectionFrame;

import javax.swing.JFrame;

public class MultipleSelectionTest
{
	public static void main( String[] args )
	{
		MultipleSelectionFrame multipleSelectionFrame = new MultipleSelectionFrame();
		multipleSelectionFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		multipleSelectionFrame.setSize( 350, 150 ); // set frame size
		multipleSelectionFrame.setVisible( true ); // display frame
		System.out.println(multipleSelectionFrame.getInsets().left + " " + multipleSelectionFrame.getInsets().right + " " + multipleSelectionFrame.getInsets().top + " " + multipleSelectionFrame.getInsets().bottom);
	} // end main
} // end class MultipleSelectionTest
