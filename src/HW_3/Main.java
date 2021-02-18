package HW_3;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isGame = true;
        boolean repeatMenu = true;

        while (isGame) {
            playGame(isGame, input);
            printMenu();
            repeatMenu = true;

            while (repeatMenu) {
                System.out.println("Введите номер команды");
                switch (input.nextInt()) {
                    case 1:
                        isGame = true;
                        repeatMenu = false;
                        break;
                    case 0:
                        System.out.println("Спасибо за игру!");
                        isGame = false;
                        repeatMenu = false;
                        break;
                    default:
                        System.out.println("Вы ввели неправильную команду!");
                }
            }
        }
    }

    public static void printMenu() {
        System.out.println("Повторить еще раз?");
        System.out.println("1. Да");
        System.out.println("0. Нет");
    }

    static void playGame(boolean status, Scanner input) {
        int count = 0;
        int range = 9;
        int num = (int) (Math.random() * range);

        System.out.println("Угадайте число. У Вас 3 попытки :");

        while (count < 3) {
            System.out.println("Введите число от 0 до 9: ");
            int number = input.nextInt();

            if (number > num) {
                System.out.println("Неверно. Число слишком большое!");
                System.out.println("");

            } else if (number == num) {
                System.out.println("Верно!");
                System.out.println("");
                break;
            } else {
                System.out.println("Неверно. Число слишком маленькое!");
                System.out.println("");
            }
            count++;
        }
        if (count >= 3) {
            System.out.println("Вы проиграли! Попытки закончились.");
            System.out.println("");
        }


    }
}







