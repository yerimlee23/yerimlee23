import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int firstSum = 0;
        for (int i = 0; i < X; i++) {
           firstSum += arr[i];
        }

        int maxSum = firstSum;
        int days = 1;
        for (int i = X; i < N; i++) {
            firstSum += arr[i] - arr[i - X];

            if (firstSum == maxSum) {
                days++;
            } else if (firstSum > maxSum) {
                maxSum = firstSum;
                days = 1;
            }
        }

        if (maxSum == 0) bw.write("SAD");
        else bw.write(maxSum + "\n" + days);
        bw.flush();
        bw.close();
    }
}