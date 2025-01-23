import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.print("");
        int B = sc.nextInt();

        if (0 < A && A < 10) {
            if (0 < B && B < 10) {
                double result = (double) A / B;
                System.out.println(result);
            }
        }
    }
}