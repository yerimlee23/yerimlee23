import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = 0, B = 0, C = 0, num = 0;

        for (int i = 1; i <= N; i++) {
            A = i * 2;

            for (int j = 1; j <= N; j++) {
                B = j;
                C = N - (A + B);

                if (N == A + B + C && C >= B + 2) {
                    num++;
                }
            }
        }

        System.out.println(num);
    }
}