import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); //총금액
        int N = sc.nextInt(); //물건 종류의 수
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); //물건의 가격
            System.out.print("");
            int b = sc.nextInt(); //물건의 개수
            sum += a * b;
        }

        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}