package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class
Launcher extends JFrame
{
    protected JPanel window = new JPanel();
    private JButton stats, calculate, help, quit;
    private Rectangle rstats, rcalculate, rhelp, rquit;

    private int width = 600;
    private int height = 800;
    protected int button_width = 160;
    protected int button_height = 50;

    public Launcher(int id)
    {
        // Making our buttons look like Windows buttons
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        setTitle("NBA Advanced Statistics Launcher");
        setSize(new Dimension(width, height));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(window);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        window.setLayout(null);

        if(id == 0) drawButtons();
        repaint();
    }

    private void
    drawButtons()
    {
        stats = new JButton("Choose an advanced stat");
        rstats = new Rectangle((width/2)-(button_width/2), 90, button_width, button_height);
        stats.setBounds(rstats);
        window.add(stats);

        calculate = new JButton("Calculate!");
        rcalculate = new Rectangle((width/2)-(button_width/2), 140, button_width, button_height);
        calculate.setBounds(rcalculate);
        window.add(calculate);

        help = new JButton("Help");
        rhelp = new Rectangle((width/2)-(button_width/2), 190, button_width, button_height);
        help.setBounds(rhelp);
        window.add(help);

        quit = new JButton("Quit");
        rquit = new Rectangle((width/2)-(button_width/2), 240, button_width, button_height);
        quit.setBounds(rquit);
        window.add(quit);

        stats.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                new Stats();
            }
        });

        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}

















