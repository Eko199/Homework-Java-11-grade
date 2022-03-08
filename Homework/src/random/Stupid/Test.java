package random.Stupid;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Bravo bravo = new Bravo();
        Stupid frame = new Stupid(bravo);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
