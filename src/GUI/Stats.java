package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class
Stats extends Launcher
{
    private int width = 600;
    private int height = 800;
    private JButton OK;
    private Rectangle rOK, rStats;
    private Choice stats = new Choice();

    public Stats()
    {
        super(1);
        setTitle("Statistics - NBA Advanced Statistics Launcher");
        setSize(new Dimension(width, height));
        setLocationRelativeTo(null);
        drawButtons();
    }

    private void
    drawButtons()
    {
        OK = new JButton("OK");
        rOK = new Rectangle((width-200), (height-120), button_width - 10, button_height - 20);
        OK.setBounds(rOK);
        window.add(OK);

        rStats = new Rectangle(50, 80, 200, 30);
        stats.setBounds(rStats);
        stats.add("Assist Percentage");
        stats.add("Block Percentage");
        stats.add("Total Rebound Percentage");
        stats.add("Defensive Rebound Percentage");
        stats.add("Offensive Rebound Percentage");
        stats.add("Player's Effective Field Goal%");
        stats.select(1);
        window.add(stats);

        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                new Launcher(0);
            }
        });
    }
}











