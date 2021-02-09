package Java1_HW;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        byte var1 = 115;
        short var2 = 115;
        int var3 = 115;
        long var4 = 115L;

        float var5 = 115.14f;
        double var6 = 11.5d;

        char var7 = 'a';
        boolean var8 = true; //false

        Scanner in = new Scanner(System.in);

        System.out.println(calc(in.nextFloat(), in.nextFloat(), in.nextFloat(), in.nextFloat()));
        System.out.println(task4(in.nextInt(), in.nextInt()));
        System.out.println(task6(in.nextInt()));
        task5(in.nextInt());
        name(in.next());

    }
    static float calc (float a, float b, float c, float d) {
        return a * ( b + ( c / d ) );
    }

    static boolean task4 (int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static boolean task6 (int celoeChislo) {
        if (celoeChislo >= 0) {
            return true;
        } else {
            return false;
        }
    }
     static void task5 (int celoeChislo) {
        if (celoeChislo >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

     }

     static void name (String name) {
         System.out.println("Привет, " + name);
     }
}
