package HW_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Все животные могут бежать и плыть. Задайте длину дистанции каждому животному " +
                "(у каждого животного силы небезграничны): ");

        Animals cat = new Cat();
        Animals dog = new Dog();
        System.out.println("Задайте сколько нужно пробежать коту: ");
        cat.run(in.nextInt());
        System.out.println("Задайте сколько нужно проплыть коту: ");
        cat.swim(in.nextInt());
        System.out.println("Задайте сколько нужно пробежать собаке: ");
        dog.run(in.nextInt());
        System.out.println("Задайте сколько нужно проплыть собаке: ");
        dog.swim(in.nextInt());
    }
}
