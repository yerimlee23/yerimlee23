import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        HashSet<Integer> overlapRemove = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int remain = num % 42;
            arr[i] = remain;
            overlapRemove.add(arr[i]);
        }

        System.out.println(overlapRemove.size());
    }
}