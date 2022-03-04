package random.Stupid;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stupid extends JFrame {
    private JButton button1;
    private JButton button2;
    private JPanel startPanel;

    public Stupid(JPanel bravo) {
        super("aaaaa");
        setContentPane(startPanel);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                getContentPane().add(bravo);
                //getContentPane().doLayout();
                //update(getGraphics());
                //setContentPane(bravo);
            }
        });
    }
}
