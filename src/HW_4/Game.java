package HW_4;

import java.util.Scanner;

public class Game {
    private static final char X = 'X';
    private static final char O = '0';
    private static final char DEFAULT = '_';
    private static final char DELIMITER = '|';
    private static int steps = 0;
    private static char[][] MAP = new char[3][3];

    private static void fillMap() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                System.out.print(DELIMITER + "" + MAP[i][j]);
            }
            System.out.println(DELIMITER);
        }
    }

    private static void game() {
        steps = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Селайте ход:");
            int x = in.nextInt(), y = in.nextInt();

            x--;
            y--;
            if (validInput(x, y)) {
                MAP[x][y] = X;
                steps++;
                if (isWin(X)) {
                    System.out.println("Вы победили!");
                    return;
                }
                if (steps == MAP.length * MAP.length) {
                    System.out.println("Ничья!");
                    return;
                }
                movePC();
                if (isWin(O)) {
                    System.out.println("Вы проиграли!");
                    return;
                }
            } else {
                System.out.println("Неверный ход!");
            }
            printMap();
        }
    }

    private static void movePC() {
        int x, y;
        do {
            x = (int) (Math.random() * MAP.length);
            y = (int) (Math.random() * MAP.length);
        } while (!validInput(x, y));
        MAP[x][y] = O;
        steps++;
    }

    private static boolean isWin(char x) {
        // Сделать эффективную проверку на победу
        boolean isWin = false;

        for (int i = 0; i < 3; i++) {
            isWin = MAP[i][0] == x && MAP[i][1] == x && MAP[i][2] == x
                    || MAP[0][i] == x && MAP[1][i] == x && MAP[2][i] == x;
            if (isWin) {
                return true;
            }
        }
        return MAP[0][0] == x && MAP[1][1] == x && MAP[2][2] == x || MAP[0][2] == x && MAP[1][1] == x && MAP[2][0] == x;
    }

    private static boolean validInput(int x, int y) {
        boolean inMap = x >= 0 && y >= 0 && x < MAP.length && y < MAP.length;
        return inMap && MAP[x][y] == DEFAULT;
    }

    public static void main(String[] args) {
        System.out.println("Вы в игре 'Крестики Нолики'");
        System.out.println("На каждом ходу вы вводите два числа: номер строки и номер столбца.");
        fillMap();
        printMap();
        game();
    }

}






