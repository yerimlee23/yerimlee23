import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[M][2];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();

        int packageMin = arr[0][0];
        int eachMin = arr[0][1];

        for (int i = 1; i < M; i++) {
            if (packageMin > arr[i][0]) {
                packageMin = arr[i][0];
            }

            if (eachMin > arr[i][1]) {
                eachMin = arr[i][1];
            }
        }

        int costMin = 0;

        if (N <= 6) {
            costMin = Math.min(packageMin, eachMin * N);
        } else {
            if (N % 6 == 0) {
                costMin = Math.min(packageMin * (N / 6), eachMin * N);
            } else {
                int a = Math.min(packageMin * (N / 6 + 1), eachMin * N);
                int b = packageMin * (N / 6) + eachMin * (N % 6);
                costMin = Math.min(a, b);
            }
        }

        bw.write(costMin + "\n");
        bw.flush();
        bw.close();
    }
}