import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = arr[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();

                if (max <= arr[i][j]) {
                    max = arr[i][j];
                    maxRow = i + 1;
                    maxColumn = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxRow + " " + maxColumn);
    }
}