import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N];
        int[] P = new int[N];
        int[] revenue = new int[N + 1];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (i + T[i] <= N) {
                revenue[i + T[i]] = Math.max(revenue[i + T[i]], revenue[i] + P[i]);
            }

            revenue[i + 1] = Math.max(revenue[i + 1], revenue[i]);
        }

        bw.write(revenue[N] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}