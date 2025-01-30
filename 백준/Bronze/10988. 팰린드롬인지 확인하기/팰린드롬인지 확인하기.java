import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int left = 0;
        int right = input.length() - 1;
        int result = 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                result = 0;
                break;
            }
            left++;
            right--;
        }

        System.out.println(result);
    }
}