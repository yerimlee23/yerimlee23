import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[M][2];
        boolean[][] avoid = new boolean[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            avoid[arr[i][0]][arr[i][1]] = true;
            avoid[arr[i][1]][arr[i][0]] = true;
        }
        br.close();

        int count = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (avoid[i][j]) continue;

                for (int k = j + 1; k <= N; k++) {
                    if (!avoid[j][k] && !avoid[k][i]) count++;
                }
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}