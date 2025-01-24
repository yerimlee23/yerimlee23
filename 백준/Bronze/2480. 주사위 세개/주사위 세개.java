import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("");
        int b = sc.nextInt();
        System.out.print("");
        int c = sc.nextInt();
        int prizeMoney = 0;

        if (a == b) {
            if (b == c) {
                prizeMoney = 10000 + a * 1000; //a == b == c
            } else {
                prizeMoney = 1000 + a * 100; //a == b != c
            }
        } else {
            if (b == c) {
                prizeMoney = 1000 + b * 100; //a != b = c
            } else if (a == c) {
                prizeMoney = 1000 + c * 100; //a = c != b
            } else {
                if (a > b && a > c) {
                    prizeMoney = a * 100;
                } else if (b > a && b > c) {
                    prizeMoney = b * 100;
                } else {
                    prizeMoney = c * 100;
                }
            }
        }

        System.out.println(prizeMoney);
    }
}