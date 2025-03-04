import java.io.*;

public class Main {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                bw.write(i + "\n");
                N /= i;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}