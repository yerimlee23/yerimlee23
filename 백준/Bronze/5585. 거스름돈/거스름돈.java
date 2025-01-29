import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int change = 1000 - price;  //잔돈
        int count = 0;

        while (change > 0) {
            if (change >= 500) {
                change -= 500;
                count++;
            } else if (100 <= change && change < 500) {
                change -= 100;
                count++;
            } else if (50 <= change && change < 100) {
                change -= 50;
                count++;
            } else if (10 <= change && change < 50) {
                change -= 10;
                count++;
            } else if (5 <= change && change < 10) {
                change -= 5;
                count++;
            } else {
                change -= 1;
                count++;
            }
        }

        System.out.println(count);
    }
}