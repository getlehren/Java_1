package HW_3;

public class Diamond {
    public static void main(String[] args) {
        drawDiamond(5);
    }

    static void drawDiamond(int size) {
        char[][] arr = new char[size][size];
        int left = size / 2;
        int right = size / 2;

        fillWithDots(arr);

        for (int i = 0; i <= size / 2; i++) {
            for (int j = left; j <= right; j++) {
                arr[i][j] = '*';
            }
            left--;
            right++;
        }

        left++;
        right--;

        for (int k = size / 2; k < size; k++) {
            for (int l = left; l <= right; l++) {
                arr[k][l] = '*';
            }
            left++;
            right--;
        }

        print2dArray(arr);
    }

    private static void fillWithDots(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '.';
            }
        }
    }

    private static void print2dArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
