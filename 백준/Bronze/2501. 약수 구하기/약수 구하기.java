import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] div = new int[N];
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                div[count++] = i;
            }
        }

        div = Arrays.copyOf(div, count);

        if (count < K) {
            bw.write(0 + "\n");
        } else {
            bw.write(div[K - 1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}