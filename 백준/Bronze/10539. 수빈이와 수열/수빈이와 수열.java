import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int[] K = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for (int i = 0; i < N; i++) {
            K[i] = B[i] * (i + 1);

            for (int j = 0; j < N; j++) {
                if (j == 0) A[j] = K[j];
                else A[j] = K[j] - K[j - 1];
            }
            bw.write(A[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}