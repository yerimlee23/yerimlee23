import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] valid = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if (n < 10001) valid[n] = true;
        }

        for (int i = 1; i < 10001; i++) {
            if (!valid[i]) bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int d(int num) {
        int sum = num;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            return sum;
        }
}