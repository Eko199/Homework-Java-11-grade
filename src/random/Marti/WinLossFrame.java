package random.Marti;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class WinLossFrame extends JFrame{
	public static int WIN=1;
	public static int LOSS=2;
	WinLossFrame(int a,String word){
		setLayout(new BorderLayout());
		JLabel text = new JLabel();
		Font font = new Font("", Font.BOLD, 30);
		text.setFont(font);
		add(text,BorderLayout.CENTER);
		if(a==WIN) {
			setTitle("You have won");
			text.setText("You have won");
			text.setBackground(Color.green);
		}
		if(a==LOSS) {
			setTitle("You have lost");
			text.setText("You have lost, the word was "+word);
			text.setBackground(Color.red);
		}
		JButton OKbutton = new JButton("OK");
		OKbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		add(OKbutton,BorderLayout.SOUTH);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}
