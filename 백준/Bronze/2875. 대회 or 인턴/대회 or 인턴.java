import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        br.close();

        int count = Math.min(N / 2, M);
        int remain = N + M - (count * 3);

        while (remain < K) {
            count--;
            remain += 3;
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
    }
}