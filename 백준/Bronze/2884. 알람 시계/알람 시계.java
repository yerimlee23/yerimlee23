import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int m = M - 45;

        if (0 <= H && H <= 23 && 0 <= M && M <= 59) {
            if (H == 0 && m < 0) {
                H = 23;
                m = 60 + m;
            } else if (H != 0 && m < 0) {
                H -= 1;
                m = 60 + m;
            }
            System.out.print(H + " " + m);
        }
    }
}