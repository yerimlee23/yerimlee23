import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;

        A = sc.nextInt(); //현재 시각(시)
        System.out.print("");
        B = sc.nextInt(); //현재 시각(분)
        C = sc.nextInt(); //조리 시간(분)
 
        int a = (B + C) / 60; //몫
        int b = (B + C) % 60; //나머지

        int clock = A + a;
        int minute = b;

        if (clock > 23) {
                clock -= 24;
        }

        System.out.print(clock + " ");
        System.out.println(minute);
    }
}