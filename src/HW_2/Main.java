package HW_2;
public class Main {

    public static void main(String[] args) {
        int[] task1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] task2 = new int[8];
        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int row = 10;
        int col = 10;
        int[][] task4 = new int[row][col];
        int[] task5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


        task1(task1);
        task2(task2);
        task3(task3);
        task4(10);
        task5(task5);
    }

    public static void task1(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }

        System.out.println("task1");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]);
        }
    }

    public static void task2(int[] a) {
        for (int k = 0; k < a.length; k++) {
            if (k == 0) {
                a[0] = 0;
            } else {
                a[k] = a[k - 1] + 3;
            }

        }
        System.out.println("\n task2");
        for (int o = 0; o < a.length; o++) {
            System.out.print(a[o] + ",");
        }
    }
    public static void task3(int[] a){
        for (int p = 0; p < a.length; p++) {
            if (a[p] < 6) {
                a[p] = a[p] * 2;
            }

        }
        System.out.println("\n task3");
        for (int m = 0; m < a.length; m++) {
            System.out.print(a[m] + ",");
        }
    }
    public static void task4(int a) {
        int row = a;
        int col = a;
        int[][] task4 = new int[row][col];

        for (int b = 0; b < row; b++) {
            for (int q = 0, qq = col; q < row; q++, qq--) {
                if (b == q || b == (qq - 1)){
                    task4[b][q] = 1;
                }

            }
        }

        System.out.println("\n task4");
        for (int d = 0; d < row; d++) {
            System.out.println("");
            for (int f = 0; f < col; f++) {
                System.out.print(task4[d][f]);
            }
        }
    }
    public static void task5 (int[] b) {
        int max = 0;
        int min = 999999999;

        for(int i = 0; i < b.length ; i++ ){
            if (b[i] > max) {
                max = b[i];
            }
            if (b[i] <= min ) {
                min = b[i];
            }
        }

        System.out.println("\n task 5");
        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);

    }

}

