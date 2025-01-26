import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int piece = 0;

        //체스 재고
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            System.out.print("");
        }

        //킹, 퀸 = 1
        for (int i = 0; i < 2; i++) {
            if (arr[i] > 0) {
                piece = 1 - arr[i];
            } else {
                piece = 1 + arr[i];
            }
            System.out.print(piece + " ");
        }

        //룩, 비숍, 나이트 = 2
        for (int i = 2; i < 5; i++) {
            if (arr[i] > 0) {
                piece = 2 - arr[i];
            } else {
                piece = 2 + arr[i];
            }
            System.out.print(piece + " ");
        }

        //폰 = 8
        for (int i = 5; i < 6; i++) {
            if (arr[i] > 0) {
                piece = 8 - arr[i];
            } else {
                piece = 8 + arr[i];
            }
            System.out.println(piece);
        }
    }
}