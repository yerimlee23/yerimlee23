import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            System.out.print("");
            int B = sc.nextInt();
            int sum = A + B;
            System.out.println("Case #" + (i + 1) + ": " + sum);
        }
    }
}