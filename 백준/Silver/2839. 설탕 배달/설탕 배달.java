import java.io.*;

public class Main {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = 0;

        while (N >= 0) {
            if (N % 5 == 0) {
                num += N / 5;
                System.out.println(num);
                return;
            }

            N -= 3;
            num++;
        }

        System.out.println(-1);
    }
}