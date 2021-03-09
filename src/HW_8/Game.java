package HW_8;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    private static final ImageIcon def = new ImageIcon("def.png");
    private static final ImageIcon cross = new ImageIcon("cross.png");
    private static final ImageIcon o = new ImageIcon("null.png");

    private JButton [][] map;
    GameXO gameXO = new GameXO();


    public static void main(String[] args) {
        new Game();
    }

    public Game() throws HeadlessException {
        setSize(360, 360);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        GridLayout layout = new GridLayout(3, 3);
        JPanel panel = new JPanel(layout);
        map = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton();
                button.setIcon(def);
                int xCor = i;
                int yCor = j;
                button.addActionListener(action -> {
                    if (gameXO.validInput(xCor,yCor)) {
                        button.setIcon(cross);
                        GameXO.MAP[xCor][yCor] = 'X';
                    }
                    if (gameXO.isWin('X')) {
                        showWinnerDialog("Вы победили!");
                    }
                    // TODO: 09.03.2021  проверка победы
                    movePc();
                    if (gameXO.isWin('O')) {
                        showWinnerDialog("Вы проиграли!");
                    }
                    // TODO: 09.03.2021  проверка победы
                    // TODO: 09.03.2021  может быть ничья
                    if (gameXO.isTie() && !gameXO.isWin('X') && !gameXO.isWin('O')){
                        showWinnerDialog("Ничья");
                    }
                });
                panel.add(button);
                map [i][j] = button;
            }

        }
        add(panel);
        setVisible(true);
        setResizable(false);
    }

    private void showWinnerDialog(String result) {
        new WinnerDialog(this, result);
    }

    private void movePc() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j].getIcon().equals(def)) {
                    map [i][j].setIcon(o);
                    GameXO.MAP[i][j] = 'O';
                    return;
                }
            }
        }
    }
}

