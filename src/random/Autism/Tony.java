package random.Autism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Random;









    /*

    |                                     |
    |                                     |
    |            -------------            |
    |_________         |         _________|
    |        |         |        |         |
    |        |         |        |         |
    |        |         |        |         |

    */

















public class Tony extends JFrame {
    JLabel text;
    JButton yes;
    JButton no;

    public static void main(String[] args) {
        JFrame tony = new Tony();
    }

    public void wrongOpinion() {
        Random random = new Random();
        no.setText("No (wrong)");
        do
            no.setBounds(random.nextInt(600) + 10, random.nextInt(250) + 250, 200, 69);
        while (no.getBounds().intersects(yes.getBounds()) || no.getBounds().contains(getMousePosition()));
    }

    public Tony() {
        //NEVER
        super("Tony :)");
        setLayout(null);
        setLocationRelativeTo(null);
        //GONNA
        text = new JLabel("Are you beautiful?");
        text.setFont(new Font("Serif", Font.BOLD, 69));
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setBounds(0, 0, 800, 200);
        add(text);
        //GIVE
        yes = new JButton("Yes");
        yes.setFont(new Font("Serif", Font.ITALIC, 30));
        yes.setBounds(169, 300, 120, 69);
        yes.setBackground(Color.green);
        //YOU
        yes.addActionListener(e -> {
            text.setText("Correct!");
            remove(yes);
            remove(no);
            JLabel ps = new JLabel("PS: Molia ne umirai, ne iskam naistina da umirash");
            ps.setHorizontalAlignment(SwingConstants.CENTER);
            ps.setBounds(100, 300, 600, 100);
            ps.setFont(new Font("Serif", Font.PLAIN, 30));
            add(ps);
            try {
                Desktop.getDesktop().browse(java.net.URI.create("https://youtu.be/dQw4w9WgXcQ"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            getContentPane().setBackground(Color.GREEN);
            repaint();
        });
        //UP
        no = new JButton("No");
        no.setFont(new Font("Serif", Font.PLAIN, 30));
        no.setBounds(500, 300, 120, 69);
        no.setBackground(Color.red);
        //NEVER
        no.addActionListener(e -> wrongOpinion());
        //GONNA
        no.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                wrongOpinion();
            }
        });
        //LET
        add(yes);
        add(no);
        //YOU
        getContentPane().setBackground(Color.white);
        setLocation(400, 300);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //DOWN
    }
}
