import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        if (N == 0) bw.write("1");
        else bw.write(factorial(1, N).toString());
        bw.flush();
        bw.close();
    }

    public static BigInteger factorial (int a, int b) {
        if (a == b) return BigInteger.valueOf(a);

        int c = (a + b) / 2;
        return factorial(a, c).multiply(factorial(c + 1, b));
    }
}