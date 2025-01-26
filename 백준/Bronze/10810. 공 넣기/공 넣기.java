import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //바구니 개수
        System.out.print("");
        int M = sc.nextInt(); //참여 횟수
        int[] arr = new int[N];

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int number = sc.nextInt(); //공 번호

            for (int j = start - 1; j <= end - 1; j++) {
                arr[j] = number; //해당 범위의 바구니에 공 넣기
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}