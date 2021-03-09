package HW_8;

import javax.swing.*;
import java.awt.*;

public class WinnerDialog extends JFrame {

    private JFrame game;

    public WinnerDialog(JFrame game, String res ) throws HeadlessException {
        this.game = game;
        game.dispose();
        setSize(150,130);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        JButton newGame = new JButton("New game");
        JButton exit = new JButton("Exit");
        JLabel result = new JLabel();
        result.setText(res);
        panel.add(result,CENTER_ALIGNMENT);
        panel.add(newGame);
        panel.add(exit);
        newGame.addActionListener(action -> {
            new Game();
            dispose();
        });
        exit.addActionListener(action -> {
            dispose();
            System.exit(0);
        });
        add(panel);
        setVisible(true);
    }
}
