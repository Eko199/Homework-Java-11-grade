package random.Stupid2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stuidity extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private JPanel stupid;
    private JPanel bravo;

    public Stuidity() {
        setContentPane(stupid);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                getContentPane().add(bravo);
                getContentPane().doLayout();
                update(getGraphics());
                validate();
            }
        });
    }
}
