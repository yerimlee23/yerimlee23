import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        int F = Integer.parseInt(br.readLine());
        br.close();

        long n = (N / 100) * 100;

        while (n % F != 0) {
            n++;
            if (n % F == 0) {
                break;
            }
        }

        n %= 100;

        if (n < 10) {
            System.out.println("0" + n);
        } else {
            System.out.println(n);
        }
    }
}