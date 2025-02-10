import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] C = new int[T];
        int Q = 0, D = 0, N = 0, P = 0;

        for (int i = 0; i < T; i++) {
            C[i] = Integer.parseInt(br.readLine());

            if (1 <= C[i] && C[i] <= 500) {
                Q = C[i] / 25;
                D = (C[i] % 25) / 10;
                N = (C[i] % 25 % 10) / 5;
                P = C[i] % 25 % 10 % 5;
            }

            bw.write(Q + " " + D + " " + N + " " + P + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}