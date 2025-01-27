import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int num = input / 4;
        String name = "";

        for (int i = 0; i < num; i++) {
            name += "long ";
        }

        System.out.println(name + "int");
    }
}